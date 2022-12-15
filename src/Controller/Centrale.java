package Controller;

import Model.Temperature;

import java.util.ArrayList;

public class Centrale {
    private float seuilElectricite;
    private ArrayList<Temperature> temperatures;
    private ArrayList<Salle> salles;
    private ArrayList<Gestionnaire> gestionnaires;

    public void updateEtatElectricite(){

    }


    public void allumerChauffage(){

    }

    public void couperChauffage(){

    }

    public void stockerTemp(){

    }
    public void suscribe(){

    }


    public void setGestionnaires(ArrayList<Gestionnaire> gestionnaires) {
        this.gestionnaires = gestionnaires;
    }

    public void setSalles(ArrayList<Salle> salles) {
        this.salles = salles;
    }

    public void setSeuilElectricite(float seuilElectricite) {
        this.seuilElectricite = seuilElectricite;
    }

    public void setTemperatures(ArrayList<Temperature> temperatures) {
        this.temperatures = temperatures;
    }
}
