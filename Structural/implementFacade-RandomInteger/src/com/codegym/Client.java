package com.codegym;

import java.util.Scanner;

public class Client {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	    RandomListFacade facade = new RandomListFacade();
        System.out.println("Enter size, min and max values: ");
        int size = scanner.nextInt();
        int min = scanner.nextInt();
        int max = scanner.nextInt();

	    facade.printRandomEvenList(size, min, max);
    }
}
