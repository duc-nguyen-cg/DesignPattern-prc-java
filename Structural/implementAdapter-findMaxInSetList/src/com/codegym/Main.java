package com.codegym;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        int size = 10;

        Set<Integer> testSet = new HashSet<>(size);
        for (int i = 1; i < size; i++){
            testSet.add(rd.nextInt(100));
        }
        System.out.println(testSet);

        CollectionOperations collectionOperations = new CollectionUtilsAdapter();
        Client client = new Client(collectionOperations);
        client.printMaxValue(testSet);
    }
}
