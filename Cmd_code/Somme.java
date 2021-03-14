public class Somme {

    public static void main(String[]args) {

        int somme = 0 ;

		// prendre les nombres en entrées

		for (String arg : args) {

            somme += Integer.parseInt(arg);

        }

        System.out.println(somme);

}
}