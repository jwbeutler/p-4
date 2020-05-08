package hu.nl.hibernate;

import java.util.Date;

public class Reiziger {
    private int reizigerID;
    private String voorl;
    private String tussenvoegsel;
    private String achternaam;
    private Date gbdatum;

    public Reiziger(){

    }
    public int getReizigerID(){
        return reizigerID;
    }

    public void setReizigerID(int reizigerID) {
        this.reizigerID = reizigerID;
    }

    public Date getGbdatum() {
        return gbdatum;
    }

    public void setGbdatum(Date gbdatum) {
        this.gbdatum = gbdatum;
    }

    public String getVoorl() {
        return voorl;
    }

    public void setVoorl(String voorl) {
        this.voorl = voorl;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }
}

