package com.example.sofka.factory;

import com.example.sofka.entitys.MannedSpaceships;
import com.example.sofka.factory.ifactory.IShipManned;

import java.util.ArrayList;

public class MannedFactory implements IShipManned {

    //Función que crea objetos y los agrega a una lista

    public ArrayList<MannedSpaceships> addManned (){

        MannedSpaceships skylab = new MannedSpaceships("Skylab", 435.0, 77000.0
        , "Queroseno+H(liq.)", "EE.UU", 1973);

        MannedSpaceships salyut = new MannedSpaceships("Salyut", 248.9, 19800.0
                , "N2O4+UDMH", "Rusia", 1982);

        MannedSpaceships eei = new MannedSpaceships("Estación Espacial Internacional", 386.0, 420000.0
                , "dimetilhidracina asimétrica", "Internacional", 1998);

        ArrayList<MannedSpaceships> spaceshipsList = new ArrayList<>();

        spaceshipsList.add(skylab);
        spaceshipsList.add(salyut);
        spaceshipsList.add(eei);

        return spaceshipsList;

    }


}
