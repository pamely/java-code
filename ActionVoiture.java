public class ActionVoiture{

    public static void main(String[] args){
       fibonacci();


    }

    public static void fibonacci(){
        int[] tabFibo = new int [30];
        tabFibo[0] = 1;
        tabFibo[1] = 1;
        for (int i = 2; i < tabFibo.length; i++ ){
            tabFibo[i] = tabFibo[i-2] + tabFibo[i-1];
        }

        for (int i=0; i < tabFibo.length -1; i++){
            System.out.print(tabFibo[i]);
            System.out.print(" ");
        }

    }
}

