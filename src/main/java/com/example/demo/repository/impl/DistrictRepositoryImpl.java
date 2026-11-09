package com.example.demo.repository.impl;

import com.example.demo.repository.DistrictRepository;
import com.example.demo.repository.entity.BuildingEntity;
import com.example.demo.repository.entity.DistrictEntity;
import com.example.demo.untils.ConnectionJDBCUtil;
import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public class DistrictRepositoryImpl implements DistrictRepository {
    @Override
    public DistrictEntity findNameById(Long id) {
        DistrictEntity districtEntity = new DistrictEntity();
        StringBuilder sql = new StringBuilder("SELECT d.name FORM distric d WHERE d.id = " + id + ";");
        try (
                Connection conn = ConnectionJDBCUtil.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql.toString())
        ) {
            while (rs.next()) {
                districtEntity.setName(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return districtEntity;
    }
}
