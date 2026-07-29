package com.example.demo.repository.impl;

import com.example.demo.repository.BuildingRepository;
import com.example.demo.repository.entity.BuildingEntity;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Repository
public class BuidlingReposityoryImpl implements BuildingRepository {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/estatebasic";
    private static final String USER = "root";
    private static final String PASS = "123456";


    @Override
    public List<BuildingEntity> findAll(String name, Integer districtId) {
        StringBuilder sql = new StringBuilder("SELECT * FROM building b where 1=1");
        if(name!=null && !name.equals("")){
            sql.append(" AND b.name like '%"+name+"%' ");
        }
        if(districtId != null){
            sql.append(" AND b.districtid = "+districtId+" ");
        }
        List<BuildingEntity> result = new ArrayList<>();

        try (
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql.toString());
        ) {

            while (rs.next()) {
                BuildingEntity building = new BuildingEntity();
                building.setId(rs.getInt("id"));
                building.setName(rs.getString("name"));
                building.setStreet(rs.getString("street"));
                building.setWard(rs.getString("ward"));
                building.setNumberOfBasement(rs.getInt("numberofbasement"));

                result.add(building);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}