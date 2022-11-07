public class Main {
    public static void main ( String[] args ) {
        // equals
        String word = "Hello";
        String secondWord = new String ( "Hello" );
        System.out.println (word == secondWord );
        System.out.println ("word ->"+word );
        System.out.println ("second word->"+secondWord );
        System.out.println ("with == operator :::"+word == secondWord );
        System.out.println ("with equals method in class String:::"+word.equals ( secondWord ) );

        String word1 = "ABU";
        String thirdWord = "AC";
        System.out.println ("Result of Comparison::"+thirdWord.compareTo ( word1 ) );


    }
}
