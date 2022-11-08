package ChapterSeventeen;

import java.util.List;


public class Example11{
    public static void main(String[] args){
        List<Integer> list = List.of(12,13,45,15,16,7);
        var result = list.stream()
                .peek(System.out::print).toList();
        System.out.println(result);
    }
}
