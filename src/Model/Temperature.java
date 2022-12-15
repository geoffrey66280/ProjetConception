package Model;

import java.util.Date;

public class Temperature {

    private int date;
    private String refCapteur;
    private double temperature;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getRefCapteur() {
        return refCapteur;
    }

    public void setRefCapteur(String refCapteur) {
        this.refCapteur = refCapteur;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Temperature(int date, String refCapteur, double temperature) {
        this.date = date;
        this.refCapteur = refCapteur;
        this.temperature = temperature;
    }



}
