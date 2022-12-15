package Controller;

import Model.Temperature;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Centrale {
    private float seuilElectricite = 50;
    private float electriciteActuel;
    private ArrayList<Temperature> temperatures;
    private ArrayList<Salle> salles;
    private ArrayList<Gestionnaire> gestionnaires;

    public Centrale(){
        Random r = new Random();
        this.electriciteActuel = r.nextFloat(0,100);
    }

    public void updateEtatElectricite(){

    }

    public void allumerChauffage(){

    }

    public void couperChauffage(){

    }
    /*
    Enregistre un objet Temperature
     */
    public void stockerTemp( int d, String ref,double t){
        this.temperatures.add(new Temperature(d,ref,t));
    }
    /*
        Souscrit la centrale à une salle
     */
    public void suscribe(Salle s){
        this.salles.add(s);
    }

    public ArrayList<Temperature> getTemperatures() {
        ArrayList<Temperature> temps = new ArrayList<Temperature>();
        for (int i=0; i<10; i++){
            temps.add(temperatures.get(i));
        }
        return temps;
    }
}
