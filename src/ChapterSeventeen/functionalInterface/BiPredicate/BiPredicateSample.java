package ChapterSeventeen.functionalInterface.BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateSample{
    public static void main(String[] args){
        BiPredicate<String, Integer> biPredicate =
                (word, number) -> word.length()==number;

        boolean result = biPredicate.test("Hello", 5);
        System.out.println(result);
    }
}
