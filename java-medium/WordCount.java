public class WordCount
{
  public static void main(String[] args)
  {
      String s;

      String input = "Welcome to the java in smartBitPixel for counting words";

      StringBuffer inp =new StringBuffer("Welcome to the java in smartBitPixel for counting words");  
      
      inp.replace(0,1,"Hello");  
      
      System.out.println(inp);
      
      inp.insert(1,"test",2,3);

      System.out.println(inp);

      int count = 0;
        
      System.out.println("10th char: " + input.charAt(10));
      
      for(int i = 0; i < input.length(); i++) 
      {    
            if(input.charAt(i) == ('m') || input.charAt(i) == ('e'))    
                count++;   
	    
      } 
      
      System.out.println("number of character in strin: " + count);   
  }	  
}
