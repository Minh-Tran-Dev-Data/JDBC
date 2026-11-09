package com.example.demo.repository.impl;

import com.example.demo.repository.BuildingRepository;
import com.example.demo.repository.DistrictRepository;
import com.example.demo.repository.RentAreaRepository;
import com.example.demo.repository.entity.RentAreaEntity;
import com.example.demo.untils.ConnectionJDBCUtil;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
@Repository
public class RentAreaRepositoryImpl implements RentAreaRepository {

    @Override
    public List<RentAreaEntity> getValueByBuildingId(Long id) {
        StringBuilder sql = new StringBuilder("SELECT * FROM rentarea WHERE rentarea.buildingid = " + id);
        List<String> rentAreas = new ArrayList<>();
        try (
                Connection conn = ConnectionJDBCUtil.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql.toString())
        ) {
            while (rs.next()) {
                RentAreaEntity areaEntity = new RentAreaEntity();
                areaEntity.setValue(rs.getString("value"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
