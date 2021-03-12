public class Dog extends Mammal{

    Dog(){
        super(3);
        System.out.print("I am a dog and just born after " + this.nbMonthPregnacy + " months of pregnacy. I d’ont have a name yet");
    }

    Dog(String name){
        super.name = name;
    }

    @Override
    String getType(){
        if(this.name == ""){
            return "I am an animal. I am a Mammal. I am a Dog.";
        } else {
            return "I am an animal an my name is " + this.name + ". I am a Mammal." + " I am a Dog.";
        }
    }  

}