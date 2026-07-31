package com.example.demo.repository;

import com.example.demo.repository.entity.BuildingEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface BuildingRepository {
    List<BuildingEntity> findAll (Map<String, Object> parrams);

}

