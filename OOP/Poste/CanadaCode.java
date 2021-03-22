public class CanadaCode extends PostalCode{

    CanadaCode(){

    }
    CanadaCode(String code){
        super(code);
    }
      
    public boolean isValid(){
        boolean valid = true;
        //String code = this.getCode();
        int i = 0; // count number of iteration
        while(valid && i < code.length()){

            if(i == 0 || i == 2 || i == 5){
                
                 valid = Character.isLetter( code.charAt(i));

            } else if(i == 1 || i == 4 || i == 6) {
              
              valid = Character.isDigit(code.charAt(i));

            } else {
                
                valid = Character.isWhitespace(code.charAt(i));
            }
            i++;
        }

        return valid;
    }

    public static void main (String [] args){

        CanadaCode code_1 = new CanadaCode("t2r 5t5");
        CanadaCode code_2 = new CanadaCode("45678");
        CanadaCode code_3 = new CanadaCode("th 99524");

        System.out.println(code_1.isValid());
        System.out.println(code_2.isValid());
        System.out.println(code_3.isValid());
        

    }

}