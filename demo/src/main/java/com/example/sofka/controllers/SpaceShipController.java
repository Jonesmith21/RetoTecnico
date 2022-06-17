package com.example.sofka.controllers;

import com.example.sofka.entitys.MannedSpaceships;
import com.example.sofka.entitys.ShuttleVehicle;
import com.example.sofka.entitys.UnmannedSpaceships;
import com.example.sofka.service.MannedImpl;
import com.example.sofka.service.ShuttleImpl;
import com.example.sofka.service.UnmannedImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SpaceShipController {


    @GetMapping("/index")
    public String mainPage(Model model) {

        return "index";
    }


    @GetMapping("/lanzadera")
    public String getShip(Model model){

    return "lanzadera";
    }


    @GetMapping("/noTripulados")
    public String getNT(Model model){

        return "noTripulados";
    }


    @GetMapping("/tripulados")
    public String getT(Model model){

        return "tripulados";
    }

    @PostMapping("/lanzadera")
    public String sendShuttle(Model model, @RequestParam(name="spaceshipName") String spaceshipName){

        ShuttleVehicle spaceshipObtained = ShuttleImpl.searchSpaceship(spaceshipName);

        model.addAttribute("spaceshipName", spaceshipObtained.getName());
        model.addAttribute("spaceshipTopSpeedKmH", spaceshipObtained.getTopSpeedKmH());
        model.addAttribute("spaceshipHeightKg", spaceshipObtained.getHeightKg());
        model.addAttribute("spaceshipFuelType", spaceshipObtained.getFuelType());
        model.addAttribute("spaceshipCountry", spaceshipObtained.getCountry());
        model.addAttribute("spaceshipYear", spaceshipObtained.getYear());

        return "resultado";
    }


    @PostMapping("/noTripulados")
    public String sendUnmanned(Model model, @RequestParam(name="spaceshipName") String spaceshipName){

        UnmannedSpaceships spaceshipObtained = UnmannedImpl.searchSpaceship(spaceshipName);

        model.addAttribute("spaceshipName",spaceshipObtained.getName());
        model.addAttribute("spaceshipTopSpeedKmH",spaceshipObtained.getTopSpeedKmH());
        model.addAttribute("spaceshipHeightKg",spaceshipObtained.getHeightKg());
        model.addAttribute("spaceshipFuelType",spaceshipObtained.getFuelType());
        model.addAttribute("spaceshipCountry", spaceshipObtained.getCountry());
        model.addAttribute("spaceshipYear",spaceshipObtained.getYear());

        return "resultado";
    }


    @PostMapping("/tripulados")

    public String sendManned(Model model, @RequestParam(name="spaceshipName") String spaceshipName){

        MannedSpaceships spaceshipObtained = MannedImpl.searchSpaceship(spaceshipName);

        model.addAttribute("spaceshipName",spaceshipObtained.getName());
        model.addAttribute("spaceshipTopSpeedKmH",spaceshipObtained.getTopSpeedKmH());
        model.addAttribute("spaceshipHeightKg",spaceshipObtained.getHeightKg());
        model.addAttribute("spaceshipFuelType",spaceshipObtained.getFuelType());
        model.addAttribute("spaceshipCountry", spaceshipObtained.getCountry());
        model.addAttribute("spaceshipYear",spaceshipObtained.getYear());

        return "resultado";
    }





}
