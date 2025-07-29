package com.ecommerceApp.ecommerceApp.JavaBasicProgram.lamda;

public class Example {
    public static void main(String[] args) {

        Reverse reverse = (reverses, param2) -> {
            if (param2.equalsIgnoreCase("Is true"))
                return !reverses;
            else
                return reverses;
        };
        System.out.println(reverse.reverseThink(true, "Is true"));

        Think thinker = think -> {
            System.out.println("Thinking: " + think);
        };
        thinker.thinking("what");

    }
}

@FunctionalInterface
interface Reverse {
    boolean reverseThink(boolean param, String param2);
}

interface Think{
    void thinking(String think);
}