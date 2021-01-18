package java_basic;

/*
@author: Arun Dhwaj
@purpose: Implementing Queue data structure using two stacks. I have make the pop method costly.
*/

import java.util.Queue;
import java.util.Stack;

public class QueueByUsingStacks {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public QueueByUsingStacks()
    {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueueTo(Integer x )
    {
        stack1.push(x);
    }

    public Integer dequeueFrom( )
    {
        Integer x;

        if(stack1.isEmpty() && stack2.isEmpty())
        {
            System.out.println("Queue is empty");
            System.exit(0);
        }

        if(stack2.isEmpty())
        {
            while (!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }

        x = stack2.pop();

        if(stack1.isEmpty())
        {
            while (!stack2.isEmpty())
            {
                stack1.push(stack2.pop());
            }
        }

        return x;
    }

    public void print()
    {
        System.out.println(stack1);
    }
}
