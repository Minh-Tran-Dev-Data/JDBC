package com.example.demo.repository;

import com.example.demo.repository.entity.RentAreaEntity;

import java.util.List;

public interface RentAreaRepository {
    List<RentAreaEntity> getValueByBuildingId (Long id);
}
