public class TriTabCouple{

    public static void bubbleSort(Couple[] tab){
        
        int longeurTableau = tab.length;

        for (int i = 0; i < longeurTableau - 1; i++){
            
            for (int j = 0; j < longeurTableau-i-1; j++ ){
                
                if ( !(tab[j].compare(tab[j+1])) ){   // (true)
                    Couple temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+ 1] = temp;
                }
            }
        }

    }

    public static void insertSort(Couple[] tab){

        int longeurTableau = tab.length;

        for (int i = 0; i < longeurTableau-1; i++){
            
            for (int j = i; j < longeurTableau-1; j++){

                if( !(tab[j].compare(tab[j+1])) ){
                    Couple temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+ 1] = temp;

                }
            }
        }

    }

    public static void main(String[] args){
        Couple c1 = new Couple(0, 5);
        Couple c2 = new Couple(3, 3);
        Couple c3 = new Couple(2, 5);
        
        Couple tab [] = {c1, c2, c3};
        insertSort(tab);
        for (Couple couple: tab){
            couple.display();
        }
    }
}