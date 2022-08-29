import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Example {
    public static void main(String[] args) {
        File directory = new File("C:\\Test");
        File file = new File(directory, "Test.txt");
        System.out.println(file.lastModified());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        System.out.println(dateFormat.format(file.lastModified()));
    }


}
