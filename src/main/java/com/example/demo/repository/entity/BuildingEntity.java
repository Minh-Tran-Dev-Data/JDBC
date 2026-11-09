package com.example.demo.repository.entity;

public class BuildingEntity {
    private Long id;
    private String name ;
    private Integer numberOfBasement;
    private String ward;
    private String street;
    private Long Districtid;
    private Long FloorArea;
    private Long RentPrice;

    public Long getDistrictid() {
        return Districtid;
    }

    public void setDistrictid(Long districtid) {
        Districtid = districtid;
    }

    public Long getFloorArea() {
        return FloorArea;
    }

    public void setFloorArea(Long floorArea) {
        FloorArea = floorArea;
    }

    public Long getRentPrice() {
        return RentPrice;
    }

    public void setRentPrice(Long rentPrice) {
        RentPrice = rentPrice;
    }

    public String getServiceFee() {
        return ServiceFee;
    }

    public void setServiceFee(String serviceFee) {
        ServiceFee = serviceFee;
    }

    public Long getBrokerageFee() {
        return BrokerageFee;
    }

    public void setBrokerageFee(Long brokerageFee) {
        BrokerageFee = brokerageFee;
    }

    public String getManagerName() {
        return ManagerName;
    }

    public void setManagerName(String managerName) {
        ManagerName = managerName;
    }

    public String getManagerPhoneNumber() {
        return ManagerPhoneNumber;
    }

    public void setManagerPhoneNumber(String managerPhoneNumber) {
        ManagerPhoneNumber = managerPhoneNumber;
    }

    private String ServiceFee;
    private Long BrokerageFee;
    private String ManagerName;
    private String ManagerPhoneNumber;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfBasement() {
        return numberOfBasement;
    }

    public void setNumberOfBasement(Integer numberOfBasement) {
        this.numberOfBasement = numberOfBasement;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }
}
