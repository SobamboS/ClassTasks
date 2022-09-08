package Stack;


// adding element
import java.util.Stack;
class Main {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);

//        // Remove element stacks
//        String element = animals.pop();
//        System.out.println("Removed Element: " + element);

//        // Access element from the top
//        String element = animals.peek ();
//        System.out.println ( "Element at the top: " + element );

        // to search for the position of an element
//        int position = animals.search ( "Horse" );
//        System.out.println( "Position of Horse : " + position );

        // to check if a stack is empty
        boolean result = animals.empty ();
        System.out.println( "Is the Stack empty : " + result );
  }
}
