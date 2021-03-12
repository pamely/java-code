public class Tesla extends Voiture{

    String typeCarburation;
    boolean connected;

    public Tesla(){
        super();
        this.typeCarburation = "electric";
        this.connected = true;
    }

    public Tesla(String couleurVoiture){
        super(couleurVoiture);

    }

    public Tesla(String couleurVoiture, String typeCarburation, boolean connected){
        super(couleurVoiture);
        this.typeCarburation = typeCarburation;
        this.connected = connected;
    }

    public void calculVitesse(){
        System.out.println("C\'est bon");
    }


    public static void main (String[] args){

        Tesla teslaCar = new Tesla("Orange", "Electrique", true);
        teslaCar.affiche();

    }
}