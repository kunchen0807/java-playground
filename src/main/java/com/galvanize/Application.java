package com.galvanize;

public class Application {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please specify a name and email");
        } else {
            String name = args[0];
            if (args.length < 2) {
                System.out.println("Please specify an email for " + name);
            } else {
                String email = args[1];
                System.out.println(name + " <" + email + ">");
            }
        }
    }
}
