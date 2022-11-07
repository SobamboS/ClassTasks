import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamSample {
    public static void main ( String[] args ) throws IOException {
        InputStreamReader reader = new InputStreamReader ( System.in );
        BufferedReader bufferedReader = new BufferedReader ( reader );
        String line = bufferedReader.readLine ();
        System.out.println ( line );
        reader.close ();
        bufferedReader.close ();
    }
}
