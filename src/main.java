import Controller.Centrale;
import Model.Temperature;
import Vue.TableauBord;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        ArrayList<Temperature> temps = new ArrayList<Temperature>();
        Temperature temperature1 = new Temperature(05022002, "Ref0125638", 20.5);

        temps.add(temperature1);
        Centrale centre = new Centrale();
        TableauBord tb = new TableauBord(centre);

        tb.recupererInformation();

    }



}
