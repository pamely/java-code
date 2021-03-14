public class Tab{

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

    // La méthode afficherTableau permet d'afficher le contenu du tableau dans le format spécifié 

    public static void afficherTableau(int[] tableau, int tailleTableau){

        for (int i = 0; i < tableau.length; i++ ) {
            
            if(i > 0){

                System.out.print(" , ");

            }
            System.out.print (tableau[i]);
        }
    }

    // La méthode moyenne calcule et affiche la valeur de la moyenne du t'un tableau

    public static int moyenne (int[] tableau){

        int sum = 0;

        for (int i = 0; i < tableau.length; i++){
            sum += tableau[i];
        }
        return (sum / tableau.length);

    }

    // La méthode count permet de counter les éléments du tableau inférieurs à la moyenne

    public static int count(int[] tab, int val){

        int counteur = 0;

        for (int i = 0; i < tab.length; i++){
            
            if (tab[i] < val){
                counteur += 1;
            }
        }
        return counteur;
    }

    // La méthode split 

    public static void split(int[] tab, int[] petit, int val){

        for (int i = 0; i < petit.length; i++){
            
            if(tab[i] < val){
               petit[i] = tab[i] ;
            }
        }
    }

    public static void main(String[] args){

        // initialisations
        int tab1 [ ] = { 3, 55, 7, 1, 88, 9 , 4, -10 };
        int[] tab2;
        tab2 = new int[]{10,34,62,56,82,7,95};
        int[] petitTab;


        // Trie des éléments du tableau
        trier(tab1);
        trier(tab2);

        // Affichage des éléments de tab1 et tab2
        System.out.println ("Les éléments de tab1 et tab2 triés sont : ");
        afficherTableau(tab1, tab1.length);
        System.out.print ("\n");
        afficherTableau(tab2, tab2.length);
        System.out.print ("\n");

        // Calcul de moyenne des éléments de tab2
        
        int resultat_moyenne = moyenne(tab2);
        System.out.print("La valeur moyenne de tab2 est " + resultat_moyenne);
        System.out.print ("\n");

        // 
        petitTab = new int[count(tab2, resultat_moyenne)];
        System.out.print("Les valeurs de petitTab2 sont : ");
        split(tab2, petitTab, resultat_moyenne);
        afficherTableau(petitTab, petitTab.length);
        
    }
}