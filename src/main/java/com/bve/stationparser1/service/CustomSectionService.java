package com.bve.stationparser1.service;

import com.bve.stationparser1.model.CustomSection;
import com.bve.stationparser1.model.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomSectionService {



    private CustomSection customSection0;
    private CustomSection customSection1;
    private CustomSection customSection2;

    public List<CustomSection> getCustomSection(){
        customSection0 = new CustomSection(0,"Программа работы", "foo");
        customSection1 = new CustomSection(1,"Штат", "fo888o");
        customSection2 = new CustomSection(2,"Приборы", "fo674357o");
        List<CustomSection> customSections = new ArrayList<>();
        customSections.add(customSection0);
        customSections.add(customSection1);
        customSections.add(customSection2);
        return customSections;

    }
}
