package Controller;

import java.util.Random;

public class Capteur {

    private String reference;
    private Centrale centrale;
    private float temp;
    private float elec;
    private int min = 5;
    private int max = 19;

    public Capteur(String reference){
        this.reference = reference;
    }

    public void MesurerTemperature(){
        Random r = new Random();
        this.temp = min + r.nextFloat() * (max - min);
    }

    public void TransmettreTemperature(){

    }

    public float getTemp(){
        return this.temp;
    }
}
