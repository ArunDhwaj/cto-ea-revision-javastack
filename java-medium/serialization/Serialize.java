import java.io.*;

public class Serialize 
{

   public static void main(String [] args) 
   {
      Employee e = new Employee();
      e.name = "SBP";
      e.address = "Concord Manhatthan";
      e.SSN = 11122333;
      e.number = 104;
      
      try 
      {
         FileOutputStream fileOut =
         new FileOutputStream("/tmp/employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/employee.ser");
      } 
      catch (IOException i) 
      {
         i.printStackTrace();
      }
   }
}
