package com.galvanize;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(FizzBuzz(Integer.parseInt(args[0])));
    }

    public static String FizzBuzz(int input) {
        if (input % 3 == 0 && input % 5 == 0) {
            return "FizzBuzz";
        }
        if (input % 3 == 0) {
            return "Fizz";
        }
        if (input % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(input);
    }
}
