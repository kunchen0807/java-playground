package com.galvanize;
import java.util.HashMap;
import java.util.Map;

public class RomanToDecimal {
    public static void main(String[] args) {
        System.out.println(RomanToDecimal("XIV"));
        System.out.println(RomanToDecimal("MCMXLIV"));
    }
    public static int RomanToDecimal(String Roman) {
        int DecimalOutput = 0;
        Map<String, Integer> RomanDecimalPair = new HashMap<>();
        RomanDecimalPair.put("I", 1);
        RomanDecimalPair.put("V", 5);
        RomanDecimalPair.put("X", 10);
        RomanDecimalPair.put("L", 50);
        RomanDecimalPair.put("C", 100);
        RomanDecimalPair.put("D", 500);
        RomanDecimalPair.put("M", 1000);

        System.out.println(Roman);
        String[] arrOfStr = Roman.split("");
        for (int i = arrOfStr.length; i >= 1; i--) {
            if (i == 1) {
                DecimalOutput += RomanDecimalPair.get(arrOfStr[i - 1]);
            } else {
                if(RomanDecimalPair.get(arrOfStr[i - 2]) < RomanDecimalPair.get(arrOfStr[i - 1])) {
                    DecimalOutput = DecimalOutput + RomanDecimalPair.get(arrOfStr[i - 1]) - RomanDecimalPair.get(arrOfStr[i - 2]);
                    i--;
                } else {
                    DecimalOutput += RomanDecimalPair.get(arrOfStr[i - 1]);
                }
            }
        }

        return DecimalOutput;
    }
}
