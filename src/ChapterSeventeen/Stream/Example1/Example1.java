package ChapterSeventeen.Stream.Example1;

import java.util.Arrays;
import java.util.stream.Stream;

public class Example1{
    public static void main(String[] args){
        //1. the using
        Stream<Integer> numberStream = Stream.empty();
        //2.using the stream utility method of class array
                Integer[] numbers = {2,4,5,6,7,8,9,4};
                Stream<Integer> integerStream =Arrays.stream(numbers);

                //3.
        Stream<Integer> nums = Stream.generate(()->5);
        nums.limit(10);
        nums.forEach((n)-> System.out.println(n));
    }
    }

