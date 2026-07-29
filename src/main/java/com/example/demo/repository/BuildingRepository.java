package com.example.demo.repository;

import com.example.demo.repository.entity.BuildingEntity;

import java.util.ArrayList;
import java.util.List;

public interface BuildingRepository {
    List<BuildingEntity> findAll (String name,Integer districtId);
}

