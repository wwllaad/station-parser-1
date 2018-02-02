package com.bve.stationparser1.controller;

import com.bve.stationparser1.model.CustomSection;
import com.bve.stationparser1.model.CustomStation;
import com.bve.stationparser1.model.Station;
import com.bve.stationparser1.service.CustomSectionService;
import com.bve.stationparser1.service.CustomStationService;
import com.bve.stationparser1.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class RestController {

    @Autowired
    StationService stationService;

    @Autowired
    CustomSectionService customSectionService;

    @Autowired
    CustomStationService customStationService;

    @GetMapping("/st")
    private Station getStation(@RequestParam int id){
        return stationService.getStationByIdFromDB(id);
    }

    @GetMapping("/sec")
    private List<CustomSection> getCustomSection(){
        return customSectionService.getCustomSection();
    }

    @GetMapping("/sta")
    private List<CustomStation> getCustomStation(){
        return customStationService.getCustomStation();
    }

    @GetMapping("/sta1")
    private CustomStation getOneStation(){
        return customStationService.getOneCustom();
    }
}
