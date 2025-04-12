package oving2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMap {

    // Map<String, Integer> alder = new HashMap<>();

    public static void main(String[] args) {

        Map<String, Integer> alder = new java.util.HashMap<>();

        List<String> navn = List.of("Kari", "Ole", "Kari", "Per", "Ole", "Kari");

        Map<String, Integer> antall = navn.stream().collect(Collectors.groupingBy());




        
        
    }
}