package com.bve.stationparser1.model;

import java.util.List;

public class Station {

    private int id;
    private String name;
    private List<Section> section;

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", section=" + section +
                '}';
    }

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

    public List<Section> getSection() {
        return section;
    }

    public void setSection(List<Section> section) {
        this.section = section;
    }

    public Station() {
    }

    public Station(int id, String name, List<Section> section) {
        this.id = id;
        this.name = name;
        this.section = section;
    }
}
