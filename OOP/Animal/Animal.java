public class Animal {
    protected String name="";

    // Constructors
    Animal(){

    }

    Animal(String name){
        this.name = name;
    }

    String getType(){

        if (this.name == ""){
            return "I am an animal";
        } else {
            return "I am an animal an my name is " + this.name +".";
        }
    }

}