package ChapterSeventeen.functionalInterface.Biconsumer;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerSample{
    public static void main(String[] args){
        BiConsumer<String, Integer> biConsumer = (name, age)-> System.out.println(name+ "" + age);
      //  biConsumer.accept("Rachael", 22);

        Map<String, Integer> mapOfPersons = Map.of(
                "Banke",  38,
                "Olusola",  20,
                "Hadiza",  22
        );

        mapOfPersons.forEach(biConsumer);
    }
}
