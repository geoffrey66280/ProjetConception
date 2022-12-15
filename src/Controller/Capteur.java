package Controller;

import java.util.Random;

public class Capteur implements CapteurObserver{

    private String reference;
    private Centrale centrale;
    private double temp;

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
        this.temp = 5 + r.nextFloat() * (19 - 5);
        notifyCentral();
    }

    @Override
    public void notifyCentral() {
        this.centrale.verifierTemperature(this, this.temp);
    }
}
