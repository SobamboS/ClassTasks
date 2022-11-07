package ChapterSeventeen.functionalInterface.Functions;

import java.util.function.Function;

public class FunctionSample{
    public static void main(String[] args){
        Function<String, Integer> function = (word)->word.length()*2;
        int number = function.apply("Hello");
        System.out.println(number);
    }
}
