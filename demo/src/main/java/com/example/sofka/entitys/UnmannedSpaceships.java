package com.example.sofka.entitys;

import com.example.sofka.entitys.shared.Spaceships;

public class UnmannedSpaceships extends Spaceships {

    public UnmannedSpaceships(String name, Double topSpeedKmH, Double heightKg, String fuelType, String country, Integer year) {
        super(name, topSpeedKmH, heightKg, fuelType, country, year);
    }

    @Override
    public void takeOf() {
        System.out.println("Esta nave no tripulada está despengando ¡¡¡¡¡¡¡¡buuuuummmm!!!!!!! ");

    }

    @Override
    public void navigateInSpace() {

        System.out.println("¡¡¡Comenzamos a navegar en el espacio!!!");
    }


}
