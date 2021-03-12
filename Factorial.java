public class Factorial {
	public static void main (String[] args) {
		
		int nombre = Integer.parseInt(args[0]) ;
		int v =1;
		for(int i = 1; i<=nombre;++i) {
			v= v*i;
		}
		System.out.println(v);
	}

}