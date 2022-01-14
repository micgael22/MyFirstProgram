package flowLayoutManagaer;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));             //to set up other container class
        //JButton button1 = new JButton();          There is shortcut to save some time.
        // except by calling it and just adding it to frame

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.gray);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);                       // set visibility at the end because it might not show the code after
    }
}
/*Layout Manager = Defines the natural layout for components within a container.

 FlowLayout = places components in a row, sized at their preferred size.
              If the horizontal space in the container is too small
              the FlowLayout class uses the next available row.
*/