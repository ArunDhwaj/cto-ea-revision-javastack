package com.sbp;

public class Main
{

    public static void main(String[] args)
    {
	  // write your code here
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Interger Minimum Value: " + myMinIntValue);
        System.out.println("Interger Maximum Value: " + myMaxIntValue);

        System.out.println("myBusted Max Value: " + (myMaxIntValue + 1));
        System.out.println("myBusted Min Value: " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte MinValue: " + myMinByteValue);
        System.out.println("Byte MaxValue: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short MinValue: " + myMinShortValue);
        System.out.println("Short MaxValue: " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long MinValue: " + myMinLongValue);
        System.out.println("Long MaxValue: " + myMaxLongValue);
    }
}
