import java.io.*;

public class Question4 {
    public static void main(String [] args) throws IOException, FileNotFoundException{
        InputStreamReader input = null;
        try{
            input = new InputStreamReader( new FileInputStream("data.txt"));
            int c;
            while (( c = input.read() ) != -1 ){
                System.out.write( c );
            }
            // code 
            finally {
                if ( input != null ){
                    input.close();
                }
            }
        }
    }
}