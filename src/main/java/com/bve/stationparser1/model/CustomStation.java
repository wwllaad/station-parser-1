package com.bve.stationparser1.model;

import java.util.List;

public class CustomStation {
    private int id;
    private String name;
    private List<CustomSection> sections;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CustomSection> getSections() {
        return sections;
    }

    public void setSections(List<CustomSection> sections) {
        this.sections = sections;
    }

    public CustomStation(int id, String name, List<CustomSection> sections) {
        this.id = id;
        this.name = name;
        this.sections = sections;
    }
}
