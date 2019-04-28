package edu.dmacc.codedsm.homework20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;


public class Runner {
    public static void main(String[] args) {


        List<String> animals = Arrays.asList("Dog", "Cat", "Bird", "Monkey", "Donkey");


        List<Character> result = animals.stream()
                .flatMap(word -> word.chars().mapToObj(i -> (char)i))
                .collect(toList());
        System.out.println(result);

        /*List<Integer> newIntegerlist = animals.stream().map(x->
                Integer.valueOf(x)).collect(Collectors.toList());
        System.out.println(newIntegerlist);*/


        List<String> startsWithD = animals.stream()
                .filter(x -> x.startsWith("D"))
                .collect(toList());
        System.out.println(startsWithD);


        String combinedSting = animals.stream()          //can't figure out how to print this out as List, i.e. [DogCatBirdMonkeyDonkey]
                .collect(Collectors.joining());

        System.out.println(combinedSting);



        /*animals.stream();
        List<Integer> listInteger =
                animals.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        System.out.println(listInteger);*/


    }

}

//"values".chars().mapToObj(x -> String.valueOf((char) x).length());


// "values".chars().mapToObj(x -> String.valueOf((char) x));

/*
Provided list: Arrays.asList(“Dog”, “Cat”, “Bird”, “Monkey”, “Donkey”);
A list of integers that is the length of each individual string
A list that is all of the characters from all of the strings flattened into one list
A list of the strings that start with “D”
An integer that is the sum of all of the lengths of each individual string
Hint: Use the following function to help you convert a string to a stream
"
 */