public class Cmdline {
		public static void main (String [] args) {
			int i = 0;
		    for (String arg : args) {
		    	System.out.println("Argument " + i + " " + arg);
			    i++;
			}
		}
		
}