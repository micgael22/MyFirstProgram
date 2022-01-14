package jFrame;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();                            //creates a frame
        frame.setTitle("the title");                            //the title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Exit out of application
        frame.setResizable(false);                              //prevent frame from being resize
        frame.setSize(420,420);                     //sets the x dimension and y dimension of frame
        frame.setVisible(true);                                 //make frame visible

        ImageIcon image = new ImageIcon("C:\\Users\\Micgael\\Pictures\\wallpaper\\picture.jpg"); //create an ImageIcon
        frame.setIconImage(image.getImage());                   //change icon of frame
        frame.getContentPane().setBackground(new Color(125,060,250));       //change color of background
    }
}
//JFrame is a GUI window to add components to