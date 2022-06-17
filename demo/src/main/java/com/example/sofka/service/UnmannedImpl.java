package com.example.sofka.service;

import com.example.sofka.entitys.UnmannedSpaceships;
import com.example.sofka.factory.UnmannedFactory;

public class UnmannedImpl {

    public static UnmannedSpaceships searchSpaceship (String ship) {

        UnmannedSpaceships spaceshipFinded = null;
        UnmannedFactory unmannedFactory = new UnmannedFactory();

        for (int i = 0; i < unmannedFactory.addUnmanned().size(); i++) {
            String name = unmannedFactory.addUnmanned().get(i).getName();

            if (name.contains(ship))
            {
                spaceshipFinded = unmannedFactory.addUnmanned().get(i);
            }
        }
        return spaceshipFinded;
    }
}
