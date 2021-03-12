class Example{

    private double first;
    private double second;
    private String oP;


    def add (){
        operation("+");
    }
    public void operation(String operateur){

        switch(operateur){
            case '+': 
                this.first += this.second;
                
            case '!':
            factorial = 1 
            for (int i =1; i <= this.first; i++){
                factorial *= i;
            }
            this.first = factorial;
            
        }

    }
}