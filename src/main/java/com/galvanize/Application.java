package com.galvanize;

public class Application {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please specify a name and email");
            return;
        }

        String name = args[0];
        if (args.length < 2) {
            System.out.println("Please specify an email for " + name);
            return;
        }
        String email = args[1];
        System.out.println(name + " <" + email + ">");
    }
}
