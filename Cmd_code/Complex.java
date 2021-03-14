public class Complex {

    double reel;
    double img; 

    public Complex(double reel, double img){
            this.reel = reel;
            this.img = img;
    }

    public Complex(double nombre){
        this.reel = nombre;
        this.img = nombre;
    }

    public Complex(){
        this(0,0); // Complex(0)
    }

    public double getReel(){
        return this.reel;
    }

    public double getImg(){
        return this.img;
    }

    public void setReel(double reel){
        this.reel = reel;
    }

    public void setImg(double img){
        this.img = img;
    }

    public void setComplex(double reel, double img){
        this.reel = reel;
        this.img = img;
    }

    public String toString(){
        return this.reel + " + i" + this.reel;
    }

    public Complex add (Complex numComplex){
        numComplex.reel += this.reel;
        numComplex.img += this.img;
        return numComplex;
    }

    public static Complex addTwo(Complex a, Complex b){
        a.reel += b.reel;
        a.img += b.img;
        return a;
    }

    public boolean checkConjugate(Complex a, Complex b){

        if(a.reel == b.reel && (a.img - b.img == 0) ){
            return true;
        }else{
            return false;
        }
    }

    public double productConjugate(Complex a, Complex b){
        return ((a.reel * a.reel) + (a.img * a.img));
    }

    public static void main (String[] args){

        Complex num1 = new Complex(2,5);
        Complex num2 = new Complex(4);
        Complex num3 = new Complex();

        System.out.println("Le nombre complexe entré est: " + num1.toString());
        System.out.println("Le nombre complexe entré est: " + num2.toString());
        System.out.println("Le nombre complexe entré est: " + num3.toString());
        System.out.println("La somme est: " + addTwo(num1, num2).toString());



    }


}