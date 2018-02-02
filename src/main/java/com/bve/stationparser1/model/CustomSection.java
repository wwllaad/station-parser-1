package com.bve.stationparser1.model;

import java.util.List;

public class CustomSection {


    private int id;
    private String name;
    private String data;

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public CustomSection(int id, String name, String data) {
        this.id = id;
        this.name = name;
        this.data = data;
    }
}
