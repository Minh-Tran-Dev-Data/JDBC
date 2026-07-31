package com.example.demo.service;

import com.example.demo.Model.BuildingDTO;

import java.util.List;
import java.util.Map;

public interface BuildingService {
    List<BuildingDTO> findAll(Map<String,Object> params);
}
