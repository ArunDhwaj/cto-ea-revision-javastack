public class MyThrowExample 
{
    public static void main(String[] args) 
    {
        try
        {
            //Can skip handling of NullPointerException (unchecked exception)
            method();   
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
    }
     
    public static void method( ) throws NullPointerException, FileNotFoundException 
    {
        //code
	System.out.println("Check Throw Exception");
    }
}
