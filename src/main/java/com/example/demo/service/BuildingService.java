package com.example.demo.service;

import com.example.demo.Model.BuildingDTO;

import java.util.List;

public interface BuildingService {
    List<BuildingDTO> findAll(String name,Integer districtId);
}
