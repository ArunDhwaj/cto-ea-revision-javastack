package java_basic;

import java.util.Scanner;

public class Driver
{
    public static void main(String[] args) {

        QueueByUsingStacks q = new QueueByUsingStacks();

        Scanner s = new Scanner(System.in);

        System.out.println("Enter custom queue opertion option: [ 1: enqueue, 2: dequeue, -1: exit");

        int option = s.nextInt();

        while(option != -1) {
            switch (option) {
                case 1:
                    System.out.println("Enter the integer number for equeue");
                    if (!s.hasNext()) {
                        System.out.println("Please enter the integer number only");
                    }
                    q.enqueueTo(s.nextInt());
                    q.print();
                    break;

                case 2:
                    Integer x =  q.dequeueFrom();
                    System.out.println(x);
                    q.print();
                    break;

                case -1:
                    break;
            }

            System.out.println("Enter custom queue opertion option: [ 1: enqueue, 2: dequeue, -1: exit");
            option = s.nextInt();
        }

//        q.enqueueTo(1);
//        q.enqueueTo(2);
//        q.enqueueTo(3);
//        q.print();
    }
}
