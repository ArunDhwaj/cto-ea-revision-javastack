public class MyLabeledStatement 
{
    public static void main(String[] args) 
    {
        loop: for(int i=0; i < 10; i++) 
        {
            if(i % 2 == 0) 
            {
                System.out.println("Block :: " + i);
                continue loop;
            } 
            else
            {
                System.out.println("Else Block :: " + i);
            }
        }
    }
}
