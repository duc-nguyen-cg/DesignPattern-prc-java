package com.codegym;

import java.util.List;
import java.util.Scanner;

public class RandomListFacade {
    public void printRandomEvenList(int size, int min, int max){
        RandomList generator = new RandomList();
        ListFilter filter = new ListFilter();
        ListPrinter printer = new ListPrinter();

        List<Integer> myList = generator.generateList(size, min ,max);
        System.out.println("The pre-filtered random list: ");
        printer.printList(myList);

        myList = filter.filterOdd(myList);
        System.out.println("The post-filtered random list: ");
        printer.printList(myList);

    }
}
