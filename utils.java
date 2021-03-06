import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;


public class utils {
    public static void loadStringsToArray(ArrayList<String> arrList) throws IOException {
        Path path = Paths.get("bookfiles.txt");
        arrList.clear();

        try (Stream<String> lines = Files.lines(path)){
            Object[] arr = lines.toArray();

            for (Object t : arr) {
                arrList.add(t.toString());
            }
        }
        
    }
}