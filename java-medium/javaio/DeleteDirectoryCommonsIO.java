import org.apache.commons.io.FileUtils;
import java.io.File;
 
public class DeleteDirectoryCommonsIO 
{
    public static void main(String[] args) 
    {
        File file = FileUtils.getFile("./oops");
 
        FileUtils.deleteDirectory( file );
    }
}
