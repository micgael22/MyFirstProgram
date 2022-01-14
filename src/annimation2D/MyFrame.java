package annimation2D;

import javax.swing.*;

public class MyFrame extends JFrame {
    MyPanel panel;

    MyFrame(){

        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null); //set Frame in the middle of computer screen
        this.setVisible(true);
    }
}
