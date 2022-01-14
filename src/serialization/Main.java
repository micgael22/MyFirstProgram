package serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();

        user.name = "Migo";
        user.password = "coffee</>";

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Object info saved! ;)");
    }
}
/* Serialization = The process of converting an object into a byte stream
                 = Persist ( saves the state) the object after program exit
                 = This byte stream can be saved as a file or sent over a network
                 = means can be sent to a different machine
                 = Byte Stream can be saved as a file (.ser) which is a platform independent
              *******(Think of this as if you're saving a file with the object's information)

Deserialization = The reverse process of converting a byte stream into an object.
              *******(Think of this as if you're loading a saved file)
------------------------------------------------------------------------------------------------------------------
STEPS TO SERIALIZE = 1. Your object class should implement Serialize interface
                     2. add import java.io.Serializable;
                     3. FileOutStream fileOut = new FileOutputStream(file path);
                     4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
                     5. out.writeObject(objectName)
                     6. out.close();
                     7. fileOut.close();
-----------------------------------------------------------------------------------------------------------------
 */