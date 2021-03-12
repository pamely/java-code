public class TriCmd {

            public static void trier (int[]tab) {

                int i , j , minimum , tmp ;

                for (i=0;i <tab.length-1;i++) {

                    minimum = i ;

                        for (j = i + 1 ; j <tab.length ; j++) {

                            if(tab[j]<=tab[minimum]) {

                                minimum = j ;

                            }

                        }

                    tmp = tab[minimum];
                    tab[minimum] = tab[i];
                    tab [i] = tmp ;

                }

            }

            public static void main (String [] args) {

                int[ ] notes = new int[args.length]; /*déclaration d’une variable (notes) référence vers un tableau d’entiers*/

                for (int i = 0; i < args.length; i++){
                     notes[i] = Integer.parseInt(args[i]); // convertir en entier les arguments de la ligne de commande
                }

                //notes = new int [ ] { 125 , 3 , 272 , 5 , 80 , 87 , 74 } ; /* crée un tableau d’entier et l’initialise. */

                trier(notes) ; /*Appel à la méthode trier pour le tableau notes*/
                System.out.print ("Le tableau trié est: {");
                for(int i  = 0; i<notes.length ; i++) {

                    /*Impression du contenu du tableau trié*/

                    if (i>0) {

                        System.out.print(" , ");

                    }

                    System.out.print (notes[i]);


                }

                System.out.print ("}");

              }

              

}