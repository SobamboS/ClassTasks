package Kata;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class Main {
    public static void main ( String[] args ) {
        Queue<String> colours = new PriorityQueue<> ( );
        colours.add ( "Blue" );
        colours.add("Black");

        Map<String, Integer> map = new TreeMap<>();
        map.put("A", 1);
        map.put("B", 2);
        System.out.println ( "From queue"+colours);
        System.out.println ("from map" +map );
    }
}
