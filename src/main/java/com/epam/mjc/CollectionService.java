package com.epam.mjc;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Integer::compareTo);
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream()
                .flatMap(List::stream)
                .min(Integer::compareTo);
    }

    public Integer sum(List<Integer> list) {
        //reduce() here starts with an initial value of 0 and uses the sum method of Integer
        // to add each element to the running total.
        return list.stream().reduce(0, Integer::sum);
    }
}
