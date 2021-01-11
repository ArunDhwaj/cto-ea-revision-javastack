package com.sbp;

public class Main
{

    public static void main(String[] args)
    {
        // write your code here
        byte byteValue = 20;
        short shortValue = 30;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10L * (byteValue + shortValue + intValue));
        System.out.println(shortTotal);

    }
}
