import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption.*;
import java.nio.file.*;


public class DirectoryCopy 
{
    public static void main(String[] args) throws IOException 
    {
        //Source directory which you want to copy to new location
        File sourceFolder = new File("/home/smartbitpixel/Desktop/MyTask-uber");
         
        //Target directory where files should be copied
        File destinationFolder = new File("tempnew");
 
        //Call Copy function
        copyFolder(sourceFolder, destinationFolder);
    }
 
    //public  void copyFolder(Path src, Path dest) throws IOException 
    public  void copyFolder(Path src, Path dest) throws IOException 
    {
        try (Stream<Path> stream = Files.walk(src)) 
	{
            stream.forEach(source -> copy(source, dest.resolve(src.relativize(source))));
        }
    }
 
    private void copy(Path source, Path dest) 
    {
        try 
	{
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
        } 
	catch (Exception e) 
	{
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
