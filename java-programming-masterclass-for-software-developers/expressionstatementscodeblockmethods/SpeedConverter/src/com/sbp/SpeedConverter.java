package com.sbp;

public class SpeedConverter
{

    public static long toMilePerHour(double kilometerPerHour)
    {
        if(kilometerPerHour < 0)
        {
            return  -1;
        }

        return Math.round(kilometerPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour)
    {
        if(kilometersPerHour < 0)
        {
            System.out.println("Invalid value");
        }
        else
        {
            long milesPerHour = toMilePerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h= " + milesPerHour + "mi/h");
        }

    }
}
