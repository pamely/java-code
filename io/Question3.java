import java.io.*;

public class Question3{

    public static byte getInput() [] throws Exception{

        byte [] buffer = new byte[256];
        System.in.read(buffer);
        return buffer;

    }

    /*
        char[] buffer = new char[256];
        String s = null;
        InputStreamReader in = new InputStreamReader(System.in);
        int num;
        do{
            num = in.read(buffer);
            s = new String(buffer); 
        } while (num != -1 && num <=50);
        
        return s.getBytes(); 
    */

    public static void main(String[] args) throws Exception {
        System.out.print("enter some text. \n only 50 bytes i.e. about 2 lines … \n press enter after each line to get input into the program \n" );
        byte input[] = getInput();
        OutputStream myOutFile = new FileOutputStream("./write.txt");
        for(int i=0; i<50; i++){
            myOutFile.write(input [i]);

        }
        myOutFile.close();
        int size;
        InputStream myInFile = new FileInputStream ("./write.txt");
        size = myInFile.available();
        System.out.println("\nreading contents of file write2.txt…");

        for(int i=0; i<size; i++) {
            System.out.print((char)myInFile.read());
        }
        myInFile.close();


    }
}