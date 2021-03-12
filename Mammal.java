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
        if(this.name == ""){
            return "I am an animal. I am a Mammal";
        } else {
            return "I am an animal an my name is " + this.name + ". I am a Mammal.";
        }
    }

}