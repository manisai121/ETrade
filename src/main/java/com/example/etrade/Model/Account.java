package com.example.etrade.Model;

public class Account {
    private String id;
    private String type;
    private String name;

    public Account(String id, String type, String name) {
        this.id = id;
        this.type = type;
        this.name = name;
    }

    // Getters and Setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
