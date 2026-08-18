package com.example.demo.service.impl;

import com.example.demo.Model.BuildingDTO;
import com.example.demo.converter.BuildingDTOConverter;
import com.example.demo.repository.BuildingRepository;
import com.example.demo.repository.DistrictRepository;
import com.example.demo.repository.RentAreaRepository;
import com.example.demo.repository.entity.BuildingEntity;
import com.example.demo.repository.entity.DistrictEntity;
import com.example.demo.repository.entity.RentAreaEntity;
import com.example.demo.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class BuildingServiceImpl implements BuildingService {
    @Autowired
    private BuildingRepository buildingRepository;
    @Autowired
    private BuildingDTOConverter buildingDTOConverter;

    @Override
    public List<BuildingDTO> findAll(Map<String, Object> params, List<String> typeCode) {
        List<BuildingEntity> buidlingEntities = buildingRepository.findAll(params, typeCode);
        List<BuildingDTO> result = new ArrayList<BuildingDTO>();
        for (BuildingEntity item : buidlingEntities) {
            BuildingDTO building = buildingDTOConverter.toBuildingDTO(item);
            result.add(building);
        }
        return result;
    }
}
