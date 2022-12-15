package Controller;

import Model.Temperature;
import java.util.ArrayList;
import java.util.Random;

public class Centrale {
    private double seuilElectricite = 20;
    private double seuilTemp = 10;
    private double electriciteActuel;
    private ArrayList<Temperature> temperatures;
    private ArrayList<Gestionnaire> gestionnaires;

    public Centrale(){
        Random r = new Random();
        this.gestionnaires = new ArrayList<>();
        this.temperatures = new ArrayList<>();
        this.electriciteActuel = r.nextFloat(0,100);
    }

    public void notifyGestionnaire(boolean bool){
        for (Gestionnaire gest : this.gestionnaires){
            gest.update(bool);
        }
    }

    public void verifierTemperature(Capteur c, double temp){
        stockerTemp(0102, c.getReference(), temp);
        System.out.println("Electricite actuelle " + this.electriciteActuel);
        if(temp >= seuilTemp && !verifierElectricite()){
            // On eteint le chauffage et on affiche
            notifyGestionnaire(true);
        } else {
            // On eteint le chauffage et on affiche
            notifyGestionnaire(false);
        }
    }
    public boolean verifierElectricite(){
        Random r = new Random();
        this.electriciteActuel = r.nextFloat(0,100);
        if (this.electriciteActuel < this.seuilElectricite){
            return true;
        }else{
            return false;
        }
    }

    /*
    Enregistre un objet Temperature
     */
    public void stockerTemp(int d, String ref, double t){
        this.temperatures.add(new Temperature(d,ref,t));
    }

    /*
    Ajoute un gestionnaire aux souscripteur
     */
    public void suscribeGestionnaire(Gestionnaire g){
        this.gestionnaires.add(g);
    }

    public ArrayList<Temperature> getTemperatures() {
        ArrayList<Temperature> temps = new ArrayList<>();
        for (int i=0; i<temperatures.size(); i++){
            temps.add(temperatures.get(i));
        }
        return temps;
    }
}
