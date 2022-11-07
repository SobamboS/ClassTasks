package ChapterSeventeen.functionalInterface.BiFunction;

import java.util.function.BiFunction;

public class BiFunctionSample{
    public static void main(String[] args){
        BiFunction<String, String, String> biFunction = (firstNumber, secondNumber)-> firstNumber+ " "+secondNumber;
        String result = biFunction.apply("1","0");
        System.out.println(result);
    }
}
