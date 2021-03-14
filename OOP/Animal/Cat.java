public class Cat extends Mammal{

    Cat (){
        super.nbMonthPregnacy = 2;
        System.out.println("I am a cat and just born after " + this.nbMonthPregnacy + " months of pregnacy. I d’ont have a name yet");
    }

    Cat (String name){
        super.name = name;
    }

    @Override
    String getType(){
       return super.getType()+ " I am a Cat.";
    }

}