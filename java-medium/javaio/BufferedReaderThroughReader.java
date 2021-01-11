import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferedReaderThroughReader 
{
    public static void main(String[] args)
    {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)))
        {
                      System.out.println("Enter your name");    
                      String name=bufferedReader.readLine();    

                      System.out.println("Welcome "+name);    
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
