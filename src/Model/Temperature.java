package Model;

import java.util.Date;

public class Temperature {

    private int date;
    private String refCapteur;
    private double temperature;

    public Temperature(int date, String refCapteur, double temperature) {
        this.date = date;
        this.refCapteur = refCapteur;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "date=" + date +
                ", refCapteur='" + refCapteur + '\'' +
                ", temperature=" + temperature +
                "°C";
    }
}
