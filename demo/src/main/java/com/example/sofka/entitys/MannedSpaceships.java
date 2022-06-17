package com.example.sofka.entitys;


import com.example.sofka.entitys.shared.Spaceships;

public class MannedSpaceships extends Spaceships {

    // Constructor

    public MannedSpaceships(String name, Double topSpeedKmH, Double heightKg, String fuelType, String country, Integer year) {
        super(name, topSpeedKmH, heightKg, fuelType, country, year);
    }

    // Métodos Abstractos

    @Override
    public void takeOf() {
        System.out.println("Esta nave tripulada está despengando ¡¡¡¡¡¡¡¡buuuuummmm!!!!!!!");
    }

    @Override
    public void navigateInSpace() {

        System.out.println("¡¡¡Comenzamos a navegar en el espacio!!!");

    }
}
