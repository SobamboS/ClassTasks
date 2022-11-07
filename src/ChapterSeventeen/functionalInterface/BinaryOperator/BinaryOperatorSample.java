package ChapterSeventeen.functionalInterface.BinaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample{
    public static void main(String[] args){
        BinaryOperator<Integer> binaryOperator = (number, number2) -> (number * number2);
        System.out.println(binaryOperator.apply(10,5));
    }
}
