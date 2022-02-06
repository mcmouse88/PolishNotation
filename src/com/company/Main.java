package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите математическую формулу:");
        String input = scan.nextLine();
        Deque<String> sign = new ArrayDeque<>();
        Deque<Integer> numbers = new ArrayDeque<>();

        String[] inputSplit = input.split("\\s");
        for (String s : inputSplit) {
            if (isNumber(s)) {
                numbers.offer(Integer.parseInt(s));
            } else {
                sign.offer(s);
            }
        }
        while (!numbers.isEmpty()) {
            System.out.print(numbers.poll() + " ");
        }

        while (!sign.isEmpty()) {
            System.out.print(sign.pollLast() + " ");
        }

    }

    public static boolean isNumber(String numberOrNot) {
        try {
            Integer.parseInt(numberOrNot);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
