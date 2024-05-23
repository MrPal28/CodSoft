import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public  void Rules() {
        // Specify the path to the text file
        String filePath = "C:\\Users\\ARINDAM PAL\\OneDrive\\Desktop\\CodSoft\\Project1\\Rules.txt";

        try {
            // Create a FileReader object
            FileReader fileReader = new FileReader(filePath);
            
            // Create a BufferedReader object to read the file
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read the file line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Print each line
            }

            // Close the BufferedReader
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
