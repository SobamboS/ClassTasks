import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class CreateTextFile {
    public static void main ( String[] args ) {

        try(Formatter output = new Formatter ( "clients.text" )){
            Scanner input = new Scanner ( System.in );
            System.out.printf ( "%s%n%s%n", "Enter account number, first name, last name and balance.",
                    "Enter end of file indicator to end input");

        } catch (FileNotFoundException e) {
            throw new RuntimeException ( e );
        }

    }
}
