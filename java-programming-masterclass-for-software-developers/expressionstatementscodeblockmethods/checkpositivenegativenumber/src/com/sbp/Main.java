package com.sbp;

public class Main {

    public static void main(String[] args) {
        chechknumber(0);
    }

    public static void chechknumber(int number)
    {
        if(number>0)
        {
            System.out.println("Number is Positive");
        }
        else if(number<0)
        {
            System.out.println("Number is Negetive");
        }
        else if(number==0)
        {
            System.out.println("Number is Zero");
        }
    }
}
