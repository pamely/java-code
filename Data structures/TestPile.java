public class TestPile {
	
	public static void vider(ArrayStack o){
		
		while(!o.isEmpty()){
			
		System.out.println(o.pop()); }}
	
	
		public static void main(String[] args) {
			
	    ArrayStack<String> o1= new ArrayStack<String> (10);
		
		for(int i=0; i<=10 ; i++) {
			o1.push(Integer.toString(i));
            System.out.println(o1.peek());
		    }
		
}
}