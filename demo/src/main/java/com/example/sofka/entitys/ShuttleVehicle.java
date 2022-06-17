package com.example.sofka.entitys;

import com.example.sofka.entitys.shared.Spaceships;

public class ShuttleVehicle extends Spaceships {


    public ShuttleVehicle(String name, Double topSpeedKmH, Double heightKg, String fuelType, String country, Integer year) {
        super(name, topSpeedKmH, heightKg, fuelType, country, year);
    }

    @Override
    public void takeOf() {
        System.out.println("Esta nave lanzadera está despengando ¡¡¡¡¡¡¡¡buuuuummmm!!!!!!!");
    }

    @Override
    public void navigateInSpace() {

        System.out.println("¡¡¡Comenzamos a navegar en el espacio!!!");
    }


}
