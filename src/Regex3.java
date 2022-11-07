public class Regex3 {
    public static void main ( String[] args ) {
        String email = "f.oladeji@semicolon.africa";
        if ( isValidEmailAddress ( email ) )System.out.println ("email address"  );
else  System.out.println ( "email is invalid" );
    }

       public static boolean isValidEmailAddress (String email) {
        boolean isValid = email.matches("[a-z].[a-z]+semicolon.africa");
        return isValid;
       }  }