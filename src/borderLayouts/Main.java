package borderLayouts;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10,10));   //you can send in some margins for width & height
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.gray);
        panel3.setBackground(Color.magenta);
        panel4.setBackground(Color.yellow);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(50,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.CENTER);
        frame.add(panel3,BorderLayout.WEST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.EAST);
    }
}
/* Layout Manager = defines the natural layout for components within a container
3 common managers
A BorderLayout is use within a container to place within 5 major areas: NORTH, SOUTH, WEST, EAST, CENTER.
    All extra space is placed in the CENTER area.
*/