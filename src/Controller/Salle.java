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
}
