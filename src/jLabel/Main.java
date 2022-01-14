package jLabel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon image  = new ImageIcon("C:\\Users\\Micgael\\Desktop\\Brain.png");
        Border border = BorderFactory.createLineBorder(Color.orange);

        JLabel label = new JLabel();                                   //create a label AND you can put in text()
        label.setText("I am getting somewhere with Code!");            //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);                //set text Left, Right, Center of image icon
        label.setVerticalTextPosition(JLabel.CENTER);                  //set text left, Right, center or bottom of the image
        label.setForeground(new Color(33244566));                  //set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN,60));   //set font of text
        //label.setIconTextGap(44);                                    //set gap of text to image
        label.setBackground(Color.GRAY);                               //set background color
        label.setOpaque(true);                                         //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);           //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);         //set horizontal position of icon + text within label
       //label.setBounds(100, 100, 250, 250);        // set x,y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);                           //Add label to the frame *DO NOT forget
        frame.pack();               //when you use the pack method make sure you add all of you components before using pack
    }
}
//JLabel is a GUI display area for a String of text, an image or both