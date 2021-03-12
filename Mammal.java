public class Mammal extends Animal{

    protected int nbMonthPregnacy;

    // Constructor
    Mammal(){
        
    }

    Mammal(int nbMonthPregnacy){
        this.nbMonthPregnacy = nbMonthPregnacy;
    }

    // Polymorphic method in subclass should have the same signature as superclass method
    @Override
    String getType(){
       return super.getType()+ " I am a Mammal.";
    }

}