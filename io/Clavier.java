import java.io.InputStreamReader;
import java.io.IOException;

public class Clavier {
    public static void main( String[] args ) throws IOException {
        InputStreamReader in = new InputStreamReader( System.in );
        int num;
        char[] buffer = new char[ 256 ];
        while ( ( num = in.read(buffer) ) != -1 ) {
            String str = new String(buffer);
            System.out.println( "The number of characters read is " + str.trim().length() );
        }
        
        System.out.println( "bye" );
    }
}
