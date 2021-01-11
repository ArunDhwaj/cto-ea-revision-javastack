import java.util.*;

public class DeleteDirectoryNIOWithStream 
{
    public static void main(String[] args) 
    {
        Path dir = Paths.get("./oops");
 
        Files.walk(dir)
            .sorted(Comparator.reverseOrder())
            .map(Path::toFile)
            .forEach(File::delete);
    }
}
