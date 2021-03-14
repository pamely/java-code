public class Dog extends Mammal{

    Dog(){
        super(3);
        System.out.println("I am a dog and just born after " + this.nbMonthPregnacy + " months of pregnacy. I d’ont have a name yet");
    }

    Dog(String name){
        super.name = name;
    }

    @Override
    String getType(){
       return super.getType()+ " I am a Dog.";
    }  

}