package ChapterSeventeen.Stream;

import java.util.Random;
import java.util.stream.Stream;

public class Example13{
    public static void main(String[] args){
        Stream<Integer> stream = Stream.of(2,3,4,5,6,7,8);
        var num = stream.findAny()
                .orElseGet(()->new Random().nextInt());
        System.out.println(num);
    }
}
