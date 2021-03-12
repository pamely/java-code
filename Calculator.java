public class Calculator {
	
	//variables (Operandes)  et (Operation )
	
	private double first ; // Premiere Operande 
	
	private double second ; // Deuxieme Operande 
	
	private String oP ; // Pour l'operation 
	
	// constructeur
	
	 public Calculator () {
		 this.first = 0;
         this.second = 0;
	 }
	 //Acceseur 
	 
	 double  getFirst() {
		 return this.first ;
	 }
	 
	 double getSecond() {
		 return this.second;
	 }

     String getOP(){
         return this.oP;
     }
	 
	 //Modificateurs
	 
	 void setFirst(double first) {
		 this.first = first ;
	 }
	 
	 void setSecond(double second) {
		 this.second = second ;
	 }
	 
	 // Methodes 
	  
	 void operation (String oP) {
         this.oP = oP;
	 }

	 void add() { 
		operation("+");
        this.first += this.second ;
	 }
	 
	 void substract () {
		 operation("-");
         this.first -= this.second ; 
	 }
	 
	 void multiply () {
		 operation("*");
         this.first *= this.second ;
	 }
	 
	 void divide () {
		 operation ("/") ;
         if (this.second == 0){
             this.second = 1;
         }
         this.first /= this.second ;
	 }
	 
	 void factorial () {
		 operation ("!") ;
         this.first = Math.sqrt(2*Math.PI *this.first) * Math.pow((this.first/2.718) , this.first) *(1+ 1/12*this.first) ;
	 }
	 
	 void pow() {
		operation ("POW") ; 
        this.first = Math.pow(this.first, this.second ) ;
	 }
	 
	 void rootSquare() {
		 operation ("sqrt") ;
         this.first = Math.sqrt(this.first);
	 }
	 
	 void nepLog () {
		operation ("ln") ;
        this.first = Math.log(this.first);
	 }
	 
	 
	 void compute () {
		 
		switch (this.oP) {
		 
		    case "+" :
			    this.add();
		    break ;
				 
			case "-" :
				this.substract();
				 	 
			break ;
		
			case "*" : 
				 
				 this.multiply();
				 
				 break ;
				 
			case "/" :
				 this.divide();
				 
			break ;
				 
			case "!" :
				this.factorial();
				 
				break ;
				 
			 case "POW" :
				 this.pow();
				 
				 break ;
				 
			 case "sqrt" :
				 
				 this.rootSquare();
				 
				 break ; 
				 
			 case "ln":
				 
				 this.nepLog();
				 
				 break ;
		 }
		 
	 }
	 
	  void clear () {
		  if (oP == "C") {
			  setFirst(0);  
			  setSecond(0) ;
		  }
	  }
	  
	  double display () {
		  return second; 
	  }

}