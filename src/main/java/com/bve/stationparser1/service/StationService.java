package com.bve.stationparser1.service;

import com.bve.stationparser1.model.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StationService {

    @Autowired
    StationParser stationParser;

    @Autowired
    StationSQLformatService stationSQLformatService;

    public Station getStationByIdFromDB(int id){
        return stationParser.parse(stationSQLformatService.getStationById(id));
    }


}
