package com.bve.stationparser1.service;

import com.bve.stationparser1.model.Section;
import com.bve.stationparser1.model.Station;
import com.bve.stationparser1.model.StationSQLformat;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StationParser {

    private Station station;

    private List<Section> sections;

    private Section section;
    private List<Integer> customfield_section_id;
    private List<String> customfield_name;
    private List<String> customfield_type;
    private List<String> customfieldsvalue_text_value;
    private List<Integer> customfieldsvalue_numeric_value;



    public Station parse(List<StationSQLformat> stationSQLformat){

        int id = stationSQLformat.get(0).getStation_id();
        String stationName = stationSQLformat.get(0).getStation_name();

        customfield_name = new ArrayList<>();
        customfield_section_id = new ArrayList<>();
        customfield_type = new ArrayList<>();
        customfieldsvalue_text_value = new ArrayList<>();
        customfieldsvalue_numeric_value = new ArrayList<>();

        section = new Section();
        section.setSection_name(stationSQLformat.get(0).getSection_name());
        section.setSection_id(stationSQLformat.get(0).getCustomfield_section_id());
        sections = new ArrayList<>();
        sections.add(section);
        int sectionCounter = 1;


        for (int i=0;i<stationSQLformat.size();i++) {

            if (section.getSection_id() != stationSQLformat.get(i).getCustomfield_section_id()) {
                section = new Section();
                sectionCounter++;

                section.setSection_id(sectionCounter);
                section.setSection_name(stationSQLformat.get(i).getSection_name());
                sections.add(section);
            }


                customfield_section_id.add(stationSQLformat.get(i).getCustomfield_section_id());
                customfield_name.add(stationSQLformat.get(i).getCustomfield_name());
                customfield_type.add(stationSQLformat.get(i).getCustomfield_type());
                customfieldsvalue_text_value.add(stationSQLformat.get(i).getCustomfieldsvalue_text_value());
                customfieldsvalue_numeric_value.add(stationSQLformat.get(i).getCustomfieldsvalue_numeric_value());

                section.setCustomfield_section_id(customfield_section_id);
                section.setCustomfield_name(customfield_name);
                section.setCustomfield_type(customfield_type);
                section.setCustomfieldsvalue_text_value(customfieldsvalue_text_value);
                section.setCustomfieldsvalue_numeric_value(customfieldsvalue_numeric_value);


        }


        station = new Station(id, stationName, sections);

        return station;

    }

}
