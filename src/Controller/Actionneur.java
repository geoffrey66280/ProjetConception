package Controller;

public class Actionneur {

    private String reference;

    public Actionneur(String reference){
        this.reference = reference;
    }

    public String getReference() {
        return reference;
    }

    public void allumerChauffage(){
        System.out.println("Les chauffages sont maintenant allumés");
    }

    public void eteindreChauffage(){
        System.out.println("Les chauffages sont à présent éteints");
    }
}
