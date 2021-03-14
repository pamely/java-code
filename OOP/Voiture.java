public abstract class Voiture{
    final int pneus = 4;
    String couleur;

    public Voiture(){
        this.couleur = "Noir";
    }

    public Voiture(String couleurVoiture){

        this.couleur = couleurVoiture;
    }

    public int getPneu(){
        return this.pneus;
    }

    public String getCouleur(){
        return this.couleur;
    }

    public void setCouleur(String couleurVoiture){
        this.couleur = couleurVoiture;
    }

    public String toString(){
        return "La voiture est de couleur " + this.getCouleur() + " et a " + this.getPneu() + " pneus";
    }

    public void affiche(){
        System.out.println(toString());
    }

    public abstract void calculVitesse();


    /*public static void main (String[] args){
        Voiture Urus = new Voiture();
        Voiture Tesla = new Voiture("Blanche");
        Tesla.affiche();
    }*/
}