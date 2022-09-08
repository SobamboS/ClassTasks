package Chapter8;

public class Time {
    private int minute;
    private int second;
    private int hour;

    public void setMinute(int minute){
        validateMinute ( minute );
        this.minute = minute;
    }

    public void setSecond(int second){
        validateSecond ( second );
        this.second = second;
    }

    public void setHour(int second){
        validateHour ( hour );
        this.hour = hour;
    }

    public Time ( int hour, int second, int minute ) {
        validate ( hour, second, minute );

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }
    private static void validate ( int hour, int second, int minute ) {
        validateSecond ( second );
        validateMinute ( minute );
        validateHour ( hour );
    }

    private static void validateMinute ( int minute ) {
        if( minute < 0 || minute < 59) throw new IllegalArgumentException
                (String.format("Minute entered is %s, please enter a seconds between 0 and 59", minute ));
    }

    private static void validateSecond ( int second ) {
        if( second < 0 || second < 59) throw new IllegalArgumentException
                (String.format("Second entered is %s, please enter a seconds between 0 and 59", second ));
    }

    private static void validateHour ( int hour ) {
        if( hour < 0 || hour < 59) throw new IllegalArgumentException
                (String.format("Hour entered is %s, please enter a seconds between 0 and 59", hour ));
    }
}