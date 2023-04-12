import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Agent {
    public static void main(String[] args) {
        File file = new File("result.txt"); // replace with your file path
        BufferedReader reader = null;
        String solution = "";
        try {
            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null ) {
                if( line.contains("dir-sud")){
                    solution +="D";
                }
                if( line.contains("dir-nord")){
                    solution +="U";
                }
                if( line.contains("dir-ouest")){
                    solution +="L";
                }
                if( line.contains("dir-est")){
                    solution +="R";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (char c : solution.toCharArray()) System.out.println(c);
    }
}
