package com.example.sofka.service;

import com.example.sofka.entitys.MannedSpaceships;
import com.example.sofka.factory.MannedFactory;

public class MannedImpl {

    // Función que recibe un parámetro, busca en una lista y retorna un objeto

    public static MannedSpaceships searchSpaceship (String ship) {

        MannedSpaceships spaceshipFinded = null;
        MannedFactory mannedFactory = new MannedFactory();

        for (int i = 0; i < mannedFactory.addManned().size(); i++){
            String name = mannedFactory.addManned().get(i).getName();

            if (name.contains(ship))
            {
                spaceshipFinded = mannedFactory.addManned().get(i);
            }
        }
        return spaceshipFinded;
    }

}
