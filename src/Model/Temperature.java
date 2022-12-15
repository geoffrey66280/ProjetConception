package Model;

import java.util.Date;

public class Temperature {

    private int date;
    private String refCapteur;
    private float temperature;

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

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public Temperature(int date, String refCapteur, float temperature) {
        this.date = date;
        this.refCapteur = refCapteur;
        this.temperature = temperature;
    }



}
