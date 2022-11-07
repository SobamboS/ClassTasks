package ChapterSeventeen.functionalInterface;

public class Main{
    public static void main(String[] args){
        Instrument instrument = ()-> playImplementation();

                instrument.play();

    }

    private static void playImplementation(){
        System.out.println("Playing an Instrument !!");
        System.out.println(Math.random());
    }
}
