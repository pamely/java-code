public class USCode extends PostalCode{

    USCode(){

    }

    USCode(String code){
        super(code);
    }
      
    public boolean isValid(){
        boolean valid = true;
        //String code = this.getCode();
        int i = 0; // count number of iteration
        while(valid && i < code.length()){

            if(i < 2){
                 valid = Character.isLetter( code.charAt(i));

            } else if(i == 2) {
              valid = Character.isWhitespace(code.charAt(i));

            } else {
                valid = Character.isDigit(code.charAt(i));
            }
            i++;
        }

        return valid;
    }

    public static void main (String [] args){

        USCode code_1 = new USCode("thru 99524");
        USCode code_2 = new USCode("45678");
        USCode code_3 = new USCode("th 99524");

        System.out.println(code_1.isValid());
        System.out.println(code_2.isValid());
        System.out.println(code_3.isValid());
        

    }

}