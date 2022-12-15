package Model;

import java.util.Date;

public class Temperature {

    private int date;
    private String refCapteur;
    private double temperature;

    /**
     * Permet d'instancier une température
     * @param date
     * @param refCapteur
     * @param temperature
     */
    public Temperature(int date, String refCapteur, double temperature) {
        this.date = date;
        this.refCapteur = refCapteur;
        this.temperature = temperature;
    }

    /**
     * Redéfinit la méthode toString pour un bel affichage
     * @return
     */
    @Override
    public String toString() {
        return "date=" + date +
                ", refCapteur='" + refCapteur + '\'' +
                ", temperature=" + temperature +
                "°C";
    }
}
