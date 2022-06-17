package com.example.sofka.entitys.shared;

public abstract class Spaceships {

    // Atributos

    private String name;
    private Double topSpeedKmH;
    private Double heightKg;
    private String fuelType;
    private String country;
    private Integer year;

    // Constructor

    public Spaceships(String name, Double topSpeedKmH, Double heightKg, String fuelType, String country, Integer year )  {
        this.name = name;
        this.topSpeedKmH = topSpeedKmH;
        this.heightKg = heightKg;
        this.fuelType = fuelType;
        this.country = country;
        this.year = year;
    }

    // Métodos Abstractos

    public abstract void takeOf();
    public abstract void navigateInSpace();

    // Getters y Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTopSpeedKmH() {
        return topSpeedKmH;
    }

    public void setTopSpeedKmH(Double topSpeedKmH) {
        topSpeedKmH = topSpeedKmH;
    }

    public Double getHeightKg() {
        return heightKg;
    }

    public void setHeightKg(Double heightKg) {
        this.heightKg = heightKg;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
