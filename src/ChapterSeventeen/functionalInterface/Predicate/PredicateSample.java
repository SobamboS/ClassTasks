package ChapterSeventeen.functionalInterface.Predicate;

import java.util.List;
import java.util.function.Predicate;

public class PredicateSample{
    public static void main(String[] args){
        Predicate<String> predicate = (word)->word.length()==5;
        boolean result = predicate.test("Semicolon");
       // System.out.println(result);

//
//        List<Person> people = List.of(
//                new Person("Tom", 24),
//                new Person("Jerry", 40);
//                new Person("Faith", 95)
//                        );
//
//
//        people.stream()
//

    }
}
