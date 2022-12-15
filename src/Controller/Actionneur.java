package Controller;

public class Actionneur implements Gestionnaire{

    private String reference;

    /**
     * Permet d'instancier un actionneur
     * @param reference
     */
    public Actionneur(String reference){
        this.reference = reference;
    }

    /**
     * Allume le chauffage
     */
    public void allumerChauffage(){
        System.out.println("Les chauffages sont maintenant allumés");
    }

    /**
     * Eteint le chauffage
     */
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
