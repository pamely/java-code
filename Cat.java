public class Cat extends Mammal{

    Cat (){
        super.nbMonthPregnacy = 2;
        System.out.print("I am a cat and just born after " + this.nbMonthPregnacy + " months of pregnacy. I d’ont have a name yet");
    }

    Cat (String name){
        super.name = name;
    }

    @Override
    String getType(){
        if(this.name == ""){
            return "I am an animal. I am a Mammal. I am a Cat;";
        } else {
            return "I am an animal an my name is " + this.name + ". I am a Mammal." + " I am a Cat.";
        }
    }

}