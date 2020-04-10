import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFileExample {

    public File createFile(String filePath) throws Exception {
        File file = new File(filePath);
        if (!file.exists()){
            file.createNewFile();
            System.out.println("Created successfully!");
        }
        return file;
    }

    public void readFileText(File file) throws Exception {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        int sum = 0;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            sum = sum + Integer.parseInt(line);
        }
        bufferedReader.close();
        System.out.println("Sum = " + sum);
    }
}
