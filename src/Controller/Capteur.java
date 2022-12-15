package Controller;

import java.util.Objects;
import java.util.Random;

public class Capteur {

    private String reference;
    private float temp;
    private int min = 5;
    private int max = 19;

    public Capteur(String reference){
        this.reference = reference;
        this.temp = 0;
    }

    public String getReference() {
        return reference;
    }

    public void mesurerTemperature(){
        Random r = new Random();
        this.temp = min + r.nextFloat() * (max - min);
    }

    public void notifyCapteur(){

    }

    public float getTemp(){
        return this.temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;

    }
}
