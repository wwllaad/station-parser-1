package com.bve.stationparser1.controller;

import com.bve.stationparser1.model.Station;
import com.bve.stationparser1.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class RestController {

    @Autowired
    StationService stationService;

    @GetMapping("/st")
    private Station getStation(@RequestParam int id){
        return stationService.getStationByIdFromDB(id);
    }
}
