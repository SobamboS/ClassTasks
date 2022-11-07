package ChapterSeventeen.Stream;

import java.util.stream.Stream;

public class Example5{
    public static void main(String[] args){
        Stream<Integer> nums= Stream.of(1,2,3,4,5,6);
        nums.map((num) -> num*num)
              .forEach(System.out::println);
    }
}
