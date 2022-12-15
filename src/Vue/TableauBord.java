package Vue;

import Controller.Centrale;
import Controller.Gestionnaire;
import Model.Temperature;

import java.util.ArrayList;

public class TableauBord implements Gestionnaire {

    private Centrale centraleVue;

    /**
     * Permet d'instancier un tableau de bord
     * @param centrale
     */
    public TableauBord(Centrale centrale) {
        this.centraleVue = centrale;
    }

    /**
     * Permet de recupérer les informations fournit par la centrale
     */
    public void recupererInformation() {
        afficherInfos(this.centraleVue.getTemperatures());
    }

    /**
     * Affiche les températures récupérées en paramètres
     * @param temps
     */
    public void afficherInfos(ArrayList<Temperature> temps) {
        for(Temperature t : temps){
            System.out.println(t);
        }

    }

    /**
     * Méthode redéfini depuis l'interface Gestionnaire
     * @param bool
     */
    @Override
    public void update(boolean bool) {
        recupererInformation();
    }
}
