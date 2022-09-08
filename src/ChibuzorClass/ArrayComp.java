package ChibuzorClass;

import  java.util.Arrays;

public class ArrayComp {
    public static void main ( String[] args ) {
        String [] tinubu = new String[] {"Agbado", "Garri", "Cassava", "Eba"};
        String [] fruits = new String[] {"Mango", "Apple", "Banana", "Guava"};

        if ( Arrays.equals (tinubu, fruits))

            System.out.println("Arrays are equal.");
        else
            System.out.println("Arrays are not equal.");
    }
}
