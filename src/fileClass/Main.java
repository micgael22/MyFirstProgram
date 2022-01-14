package fileClass;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Micgael\\Desktop\\secret_message.txt");

        if(file.exists()){
            System.out.println("That file exist!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();

        }
        else {
            System.out.println("That file does not exist!");
        }

    }
}
/* file = An abstract representation of file and directory path names


 */