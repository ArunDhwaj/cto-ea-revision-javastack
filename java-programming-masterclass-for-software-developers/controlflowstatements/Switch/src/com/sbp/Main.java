package com.sbp;

public class Main
{
    public static void main(String[] args)
    {
        int switchValue = 6;

        switch(switchValue)
        {
            case 1:
                System.out.println("It is 1");
                break;

            case 2:
                System.out.println("It is 2");
                break;

            case 3:case 4:case 5:
                System.out.println("It is 3 or a 4, or a 5");
                System.out.println("Actually it is a " + switchValue);
                break;

            default:
                System.out.println("It is not 1,2,3, 4 or 5");
                break;
        }

        char charValue = 'G';
        switch(charValue)
        {
            case 'A':
                System.out.println("A is found");
                break;
            case 'B':
                System.out.println("B is found");
                break;
            case 'C': case 'D' : case 'E':
                System.out.println(charValue + " is found");
                break;

            default:
                System.out.println("Could not find A, B, C, D or E");
                break;
        }

        String month = "JuNE";
        switch(month.toUpperCase())
        {
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "JUNE":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
