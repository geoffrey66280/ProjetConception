package Controller;

import java.util.ArrayList;

public class Salle {

    ArrayList<Capteur> capteurs;
    int numSalle;

    public Salle(int numSalle){
        this.capteurs = new ArrayList<>();
        this.numSalle = numSalle;
    }

    public ArrayList<Capteur> getCapteurs() {
        return this.capteurs;
    }

    public void addCapteurs(Capteur capteur){
        this.capteurs.add(capteur);
    }

    public float transmettreTemperature(){
        float sum = 0;
        int count = 0;
        for (Capteur c : this.capteurs){
            sum += c.getTemp();
            count++;
        }
        return sum/count;
    }


}
