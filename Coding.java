public class Coding{

    public static byte [][] code(byte[] data){

        byte[][] tabCode = new byte[3][6];

        for (int i = 0; i < 3; i++){

            for (int j = 0; j < data.length; j++){

                tabCode[i][j] = data[j];

            }
        }
        return tabCode;

    }

    public static void afficherTabCode (byte[][] tabCode){

        for (byte[] rows: tabCode){

            for(byte data: rows){

                System.out.print(data + " ");

            }
            System.out.print("\n");
        }
    }

    public static void afficherTabDecode(byte[] tab){

        for (byte data: tab){

            System.out.print(data + " ");
        }
    }

    public static byte compareTriplet(byte a, byte b, byte c){

        if(a == b || a == b){
            return a;

        }else if (b == c){
            return b;
        }else{
            return a;
        }
    }

    public static byte[][] transpose(byte[][] tab){

        byte[][] transposeTab = new byte [tab[0].length][tab.length];

        for (int i = 0; i < tab[0].length; i++){

            for (int j = 0; j < tab.length; j++){
                
                transposeTab[i][j] = tab[j][i];
            }
        }
        return transposeTab;
    }

    public static byte[] decode (byte[][] data){

        byte[] tabDecode = new byte[data[0].length];
        
        data = transpose(data);
        
        for (int i = 0; i < data.length; i++){

            for (int j = 0; j < data[0].length; j++){

                tabDecode[i] = compareTriplet(data[i][j], data[i][j+1], data[i][j+2]);
                
            }

        }
        return tabDecode;
    }

    public static void main(String[] args){

        byte[] data = {1, 2, 3, 4, 5, 6};
        byte[][] tabCode = code(data);
        System.out.println("Le tableau codé si pas d\'erreur de transmission :");
        afficherTabCode(tabCode);
        System.out.print("\n");
        afficherTabCode(transpose(tabCode));
        System.out.print("\n");
        afficherTabDecode(decode(tabCode));


    }
}

