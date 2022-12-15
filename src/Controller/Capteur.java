package Controller;

import java.util.Objects;
import java.util.Random;

public class Capteur {

    private String reference;
    private Centrale centrale;
    private Salle salle;
    private float temp;
    private float elec;
    private int min = 5;
    private int max = 19;

    public Capteur(String reference, Salle salle){
        this.reference = reference;
        this.salle = salle;
        this.temp = 0;
    }

    public String getReference() {
        return reference;
    }

    public void mesurerTemperature(){
        Random r = new Random();
        this.temp = min + r.nextFloat() * (max - min);
    }

    public String transmettreTemperature(){
        mesurerTemperature();
        for(Capteur c : this.salle.getCapteurs()){
            if(Objects.equals(c.getReference(), this.getReference())){
                c.setTemp(this.temp);
            }
        }
        this.salle.addCapteurs(this);
        return "Capteur ajouté";
    }

    public float getTemp(){
        return this.temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }
}
