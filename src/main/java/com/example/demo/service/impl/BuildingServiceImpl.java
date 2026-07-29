package com.example.demo.service.impl;

import com.example.demo.Model.BuildingDTO;
import com.example.demo.repository.BuildingRepository;
import com.example.demo.repository.entity.BuildingEntity;
import com.example.demo.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BuildingServiceImpl  implements BuildingService {
    @Autowired
    private BuildingRepository buildingRepository;
    @Override
    public List<BuildingDTO> findAll(String name,Integer districtId) {
    List<BuildingEntity> buidlingEntities  = buildingRepository.findAll(name,districtId);
    List<BuildingDTO> result = new ArrayList<BuildingDTO>();
    for(BuildingEntity item : buidlingEntities){
        BuildingDTO building = new BuildingDTO();
        building.setId(item.getId());
        building.setName(item.getName());
        building.setAddress(item.getStreet() + "," + item.getWard());
        building.setNumberOfBasement(item.getNumberOfBasement());
        result.add(building);
    }
        return result;
    }
}
