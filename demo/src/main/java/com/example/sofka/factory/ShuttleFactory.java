package com.example.sofka.factory;

import com.example.sofka.entitys.ShuttleVehicle;
import com.example.sofka.factory.ifactory.IShipShuttle;

import java.util.ArrayList;


public class ShuttleFactory implements IShipShuttle {

    //Función que crea objetos y los agrega a una lista

    public ArrayList<ShuttleVehicle> addShuttle (){

        ShuttleVehicle saturnoV = new ShuttleVehicle( "Saturno V", 8600.0, 2900000.0
                , "H(liq)+O(liq)", "EE.UU", 1967);

        ShuttleVehicle atlasV = new ShuttleVehicle( "Atlas V", 5800.0, 546000.0
                , "Queroseno+O(liq)", "EE.UU", 2002);

        ShuttleVehicle zenitII = new ShuttleVehicle( "Zenit II", 8500.0, 444900.0
                , "Queroseno+O(liq)", "Rusia/Ucrania", 1985);


        ArrayList<ShuttleVehicle> spaceshipList = new ArrayList<>();

        spaceshipList.add(saturnoV);
        spaceshipList.add(atlasV);
        spaceshipList.add(zenitII);

        return spaceshipList;
    }




}
