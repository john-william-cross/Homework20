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
        System.out.println(lengthOfIndividualStrings);  //outputs [3, 3, 4, 6, 6]

        List<Character> result = animals.stream()
                .flatMap(word -> word.chars().mapToObj(i -> (char) i))
                .collect(toList());
        System.out.println(result); //outputs [D, o, g, C, a, t, B, i, r, d, M, o, n, k, e, y, D, o, n, k, e, y]

        List<String> startsWithD = animals.stream()
                .filter(x -> x.startsWith("D"))
                .collect(toList());
        System.out.println(startsWithD); //outputs [Dog, Donkey]

        int count1 = animals.stream()
                .map(String::length)
                .reduce(0,(m1,m2)->m1+m2);
        System.out.println(count1); //outputs 22 using reduce rather than the first way I used below

        /*int count = animals.stream()
                .flatMap(word -> word.chars().mapToObj(i -> (char) i))
                .collect(toList())
                .size();
        System.out.println(count);   outputs 22*/

    }
}
