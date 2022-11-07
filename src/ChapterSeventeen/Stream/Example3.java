package ChapterSeventeen.Stream;

import java.util.List;

public class Example3{
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        int result = numbers.stream()
                .mapToInt((n)->n*2)
                .sum();



    }
}
