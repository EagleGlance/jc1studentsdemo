package com.noirix;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiTest {
    public static void main(String[] args) throws IOException {

//        List<String> list = new ArrayList<>();
//        Stream<String> stream = list.stream();
        Stream<String> stringElements = Stream.of("111", "111", "aa,a", "aa,a", "b,bb", "ccc", "ccc");
//        String[] letters = {"a", "b", "c"};
//        Stream<String> streamOfLetters = Arrays.stream(letters);
//        List<String> collect = Files.lines(Paths.get("file.txt")).collect(Collectors.toList());
        Predicate<String> checkStringLengthPredicate = (s) -> s.length() >= 2;
        Optional<String> preparedStrings = stringElements
                .filter(checkStringLengthPredicate) //we are waiting true here
                .skip(2)
                .distinct()
                .map(String::toUpperCase)
                //.peek(System.out::println)
                .limit(10)
                .sorted()
                //.mapToInt(Integer::parseInt)
                .flatMap((s) -> Arrays.stream(s.split(",")))
                .reduce((s, s2) -> s + s2);
                //.findFirst()
                //.collect(Collectors.toList());


//        for (String preparedString : preparedStrings) {
//            System.out.println(preparedString);
//        }

//        if (first.isPresent()) {
//            String s = first.get();
//            System.out.println(s.length());
//        }
//
        preparedStrings.ifPresent((s) -> System.out.println(s.toUpperCase()));


    }
}
