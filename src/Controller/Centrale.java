package Controller;

import Model.Temperature;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Centrale {
    private double seuilElectricite = 50;
    private double seuilTemp = 15;
    private double electriciteActuel;
    private ArrayList<Temperature> temperatures;
    private ArrayList<Gestionnaire> gestionnaires;

    public Centrale(){
        Random r = new Random();
        this.electriciteActuel = r.nextFloat(0,100);
    }

    public void notifyGestionnaire(boolean bool){
        for (Gestionnaire gest : this.gestionnaires){
            gest.update(bool);
        }
    }

    public void verifierTemperature(Capteur c, double temp){
        if(temp >= seuilTemp){
            notifyGestionnaire(true);
        } else {
            notifyGestionnaire(false);
        }
        stockerTemp(0102, c.getReference(), temp);
    }

    /*
    Enregistre un objet Temperature
     */
    public void stockerTemp( int d, String ref,double t){
        this.temperatures.add(new Temperature(d,ref,t));
    }


    public ArrayList<Temperature> getTemperatures() {
        ArrayList<Temperature> temps = new ArrayList<Temperature>();
        for (int i=0; i<10; i++){
            temps.add(temperatures.get(i));
        }
        return temps;
    }
}
