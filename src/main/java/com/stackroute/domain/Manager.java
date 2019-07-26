package com.stackroute.domain;

public class Manager {
    private int manId;
    private String manName;
    private Surveyor surveyor;


    public Manager(int manId, String manName,Surveyor surveyor) {
        this.manId = manId;
        this.manName = manName;
        this.surveyor=surveyor;

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


    public Surveyor getSurveyor() {
        return surveyor;
    }

    public void setSurveyor(Surveyor surveyor) {
        this.surveyor = surveyor;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "manId=" + manId +
                ", manName='" + manName + '\'' +
                ", surveyor=" + surveyor +
                '}';
    }
}
