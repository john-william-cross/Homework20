package edu.dmacc.codedsm.homework20;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;


public class Runner {
    public static void main(String[] args) {

        List<String> animals = Arrays.asList("Dog", "Cat", "Bird", "Monkey", "Donkey");

        List<Integer> lengthOfIndividualStrings = animals.stream()
                .map(x -> x.length())
                .collect(toList());
        System.out.println(lengthOfIndividualStrings);

        List<Character> result = animals.stream()
                .flatMap(word -> word.chars().mapToObj(i -> (char) i))
                .collect(toList());
        System.out.println(result);

        List<String> startsWithD = animals.stream()
                .filter(x -> x.startsWith("D"))
                .collect(toList());
        System.out.println(startsWithD);

        int count = animals.stream()
                .flatMap(word -> word.chars().mapToObj(i -> (char) i))
                .collect(toList())
                .size();
        System.out.println(count);

    }
}
