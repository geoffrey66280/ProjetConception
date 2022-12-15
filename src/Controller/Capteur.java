package Controller;

import java.util.Objects;
import java.util.Random;

public class Capteur implements CapteurObserver{

    private String reference;
    private Centrale centrale;
    private double temp;
    private int min = 5;
    private int max = 19;

    public Capteur(String reference, Centrale centrale){
        this.reference = reference;
        this.temp = 0;
        this.centrale = centrale;
    }

    public String getReference() {
        return reference;
    }

    public void mesurerTemperature(){
        Random r = new Random();
        this.temp = min + r.nextFloat() * (max - min);
        notifyCentral();
    }

    public double getTemp(){
        return this.temp;
    }

    @Override
    public void notifyCentral() {
        this.centrale.verifierTemperature(this, this.temp);
    }
}
