package com.example.sofka.service;

import com.example.sofka.entitys.ShuttleVehicle;
import com.example.sofka.factory.ShuttleFactory;


public class ShuttleImpl {


    public static ShuttleVehicle searchSpaceship (String ship){

        ShuttleVehicle spaceshipFinded = null;
        ShuttleFactory shuttleFactory = new ShuttleFactory();

        for (int i = 0; i < shuttleFactory.addShuttle().size(); i++) {
           String name = shuttleFactory.addShuttle().get(i).getName();

            if (name.contains(ship))
            {
              spaceshipFinded = shuttleFactory.addShuttle().get(i);
            }
        }
        return spaceshipFinded;
    }
    
}
