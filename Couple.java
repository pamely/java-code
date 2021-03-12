public class Couple {
	
	//Variables
	
	private int p , q ;
	
	//Constructeurs
	
	public Couple(int p1, int q1) {  // Ce constructeur  , initialise les attributs du couple
		p = p1 ;
		q= q1 ;
	}
	    
	public Couple() { // Ce constructeur initialise les attributs a 0
		p = 0 ;
		q = 0 ;
			
	}
	
	public Couple(Couple couple) { // Ce constructeur initialise les attributs d'un couple  grace a ceux d'un autre couple
		p = couple.p ;
		q = couple.q ;
	}
	
	//Acccesseur
	
	public int getP() { // Cet accesseur permet d'acceder a  l'attribut p
		return p ;
	
	}
	public int getQ() { // Cet accesseur permet  d'acceder a  l'attribut q
		return q ;
		
	}
	//Modificateur
	
	public void setP(int newP) { // Ce modificateur  permet de modifier l'attribut p
		p = newP ;
	}
	
	public void setQ(int newQ) { // Ce modificateur permet de modifier l'attribut q 
		q = newQ ;
	}
	
	//Methode
	
	public void display() {  // cette methode permet d'afficher les attributs p et q d'un couple 
		System.out.println("(" + getP() + "," + getQ() + ")");
		
	}
	
	public boolean compare (Couple couple_1) { // cette methode permet de comparer deux couples selon une regle  lexicographique 
		if((p < couple_1.p) || ((p ==  couple_1.p) && (q < couple_1.q))) {
			return true; // (p1,q1) <(p2,q2) si (p1<p2) ou (p1 = q1 et q1<q2) 
		}
		else {
			return false ;
			
		}
		
		
		
	}
	
	
	
	
				
}
