package ChapterSeventeen.Stream.Example2;

import java.util.List;

public class Example2{
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,2,3,5,6,7,9);
        var result =numbers.stream()
                                 .map((n)->n*2)
                                 .reduce(0,(i,j)->i+j);
        System.out.println(result);

    }
}
