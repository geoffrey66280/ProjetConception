package Controller;

public class Actionneur implements Gestionnaire{

    private String reference;

    public Actionneur(String reference){
        this.reference = reference;
    }

    public void allumerChauffage(){
        System.out.println("Les chauffages sont maintenant allumés");
    }

    public void eteindreChauffage(){
        System.out.println("Les chauffages sont à présent éteints");
    }

    @Override
    public void update(boolean bool) {
        if(bool){
            eteindreChauffage();
        } else {
            allumerChauffage();
        }
    }
}
