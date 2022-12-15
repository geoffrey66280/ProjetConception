import Controller.Actionneur;
import Controller.Capteur;
import Controller.Centrale;
import Model.Temperature;
import Vue.TableauBord;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        // Centrale
        Centrale centre = new Centrale();
        // Capteur
        Capteur c1 = new Capteur("A26", centre);
        Capteur c2 = new Capteur("A27", centre);
        Capteur c3 = new Capteur("A28", centre);
        // Tableau de bord
        TableauBord t1 = new TableauBord(centre);
        // Actionneur
        Actionneur a1 = new Actionneur("A17");

        // souscriptions
        centre.suscribeGestionnaire(t1);
        centre.suscribeGestionnaire(a1);

        // mesures de temperatures des capteurs et traitement
        c1.mesurerTemperature();
        c2.mesurerTemperature();
        c3.mesurerTemperature();
    }



}
