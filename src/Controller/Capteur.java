package Controller;

import java.util.Random;

public class Capteur implements CapteurObserver{

    private String reference;
    private Centrale centrale;
    private double temp;

    /**
     * Instancie un Capteur
     * @param reference
     * @param centrale
     */
    public Capteur(String reference, Centrale centrale){
        this.reference = reference;
        this.temp = 0;
        this.centrale = centrale;
    }

    /**
     * Renvoie la reference du Capteur
     * @return
     */
    public String getReference() {
        return reference;
    }

    /**
     * Mesure la temperature de la salle où le capteur est
     *
     * Nous utilisons un random pour faire la simulation
     */
    public void mesurerTemperature(){
        Random r = new Random();
        this.temp = 5 + r.nextFloat() * (19 - 5);
        notifyCentral();
    }

    /**
     * Redefinition de notify de l'interface Gestionnaire
     */
    @Override
    public void notifyCentral() {
        this.centrale.verifierTemperature(this, this.temp);
    }
}
