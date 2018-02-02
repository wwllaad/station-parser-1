package com.bve.stationparser1.service;

import com.bve.stationparser1.model.CustomStation;
import com.bve.stationparser1.model.Section;
import com.bve.stationparser1.model.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomStationService {

    private CustomStation customStation0;
    private CustomStation customStation1;
    private CustomStation customStation2;

    @Autowired
    CustomSectionService customSectionService;

    public List<CustomStation> getCustomStation(){

        customStation0 = new CustomStation(0,"Мысовое", customSectionService.getCustomSection());
        customStation1 = new CustomStation(1,"Тыловое", customSectionService.getCustomSection());
        customStation2 = new CustomStation(2,"Штормовое", customSectionService.getCustomSection());

        List<CustomStation> customStations = new ArrayList<>();
        customStations.add(customStation0);
        customStations.add(customStation1);
        customStations.add(customStation2);
        return customStations;
    }

    public CustomStation getOneCustom(){
        return new CustomStation(0,"Мысовое", customSectionService.getCustomSection());

    }


}
