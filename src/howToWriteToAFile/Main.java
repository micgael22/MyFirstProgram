package howToWriteToAFile;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \n Violets are blue \n Who are you \n Smile");
            writer.append("\n*A poem by ME*");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
