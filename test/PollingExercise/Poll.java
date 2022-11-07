package PollingExercise;

public class Poll {
    private String[] topics = {"Financial Issues", "Psychological issues","Gender Issues","Hunger", "Breakfast"};

    private int[][] responses = new int[5][10];
    public static double calculateAverage(int [] pollNumbers){
        int totalOfRatings = 0;
        for(int pollNumber :pollNumbers){
            totalOfRatings += pollNumber;
        }
        double average = totalOfRatings / pollNumbers.length;
        return average;
    }

    public int getHighestPoint(int[]pollNumbers) {
        int highestNumber = pollNumbers[0];
        for (int i = 0; i < pollNumbers.length; i++) {
            if ( pollNumbers[i] > highestNumber ) {
                highestNumber = pollNumbers[i];
            }
        }
        return highestNumber;
    }
public  int getLowestPoints(int[] pollNumbers){
    int lowestNumber = pollNumbers[0];
    for(int i = 0; i < pollNumbers.length; i++){
    if ( pollNumbers[i] < lowestNumber){
    lowestNumber = pollNumbers[i];
    }
    }
    return  lowestNumber;
}
}
