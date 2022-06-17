package com.example.sofka.factory;

import com.example.sofka.entitys.UnmannedSpaceships;
import com.example.sofka.factory.ifactory.IShipUnmanned;


import java.util.ArrayList;

public class UnmannedFactory implements IShipUnmanned {

    //Función que crea objetos y los agrega a una lista

    public ArrayList<UnmannedSpaceships> addUnmanned () {

        UnmannedSpaceships atv = new UnmannedSpaceships("Julio Verne", 12000.0, 20000.0, "Monometilhidracina+NO"
                , "Europa ESA/ASI", 2008);

        UnmannedSpaceships sputnik = new UnmannedSpaceships("Sputnik", 8.0, 83.6, "N2O4+UDUnmH"
                , "Rusia (URSS)", 1957);

        UnmannedSpaceships galileo = new UnmannedSpaceships("Galileo", 173800.0, 340.0, "NO4+UnmUnmH"
                , "EE.UU", 1989);

        ArrayList<UnmannedSpaceships> spaceshipList = new ArrayList<>();

        spaceshipList.add(atv);
        spaceshipList.add(sputnik);
        spaceshipList.add(galileo);

        return spaceshipList;
    }

}
