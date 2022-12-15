package Vue;

import Controller.Centrale;
import Controller.Gestionnaire;
import Model.Temperature;

import java.util.ArrayList;

public class TableauBord implements Gestionnaire {

    private Centrale centraleVue;

    public TableauBord(Centrale centrale) {
        this.centraleVue = centrale;
    }

    public void recupererInformation() {
        afficherInfos(this.centraleVue.getTemperatures());
    }

    public void afficherInfos(ArrayList<Temperature> temps) {
        for(Temperature t : temps){
            System.out.println(t);
        }

    }
    @Override
    public void update(boolean bool) {
        recupererInformation();
    }
}
