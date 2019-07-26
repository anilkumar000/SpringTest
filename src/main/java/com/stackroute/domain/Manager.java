package com.stackroute.domain;

public class Manager {
    private int manId;
    private String manName;

    public Manager(int manId, String manName) {
        this.manId = manId;
        this.manName = manName;
    }

    public Manager() {
    }

    public int getManId() {
        return manId;
    }

    public void setManId(int manId) {
        this.manId = manId;
    }

    public String getManName() {
        return manName;
    }

    public void setManName(String manName) {
        this.manName = manName;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "manId=" + manId +
                ", manName='" + manName + '\'' +
                '}';
    }
}
