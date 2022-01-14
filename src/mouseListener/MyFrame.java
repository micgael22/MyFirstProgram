package mouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon cristiano;
    ImageIcon bruno;
    ImageIcon both;
    ImageIcon black;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);

        cristiano = new ImageIcon("C:\\Users\\Micgael\\Pictures\\pictures\\cristiano.jpg");
        bruno = new ImageIcon("C:\\Users\\Micgael\\Pictures\\pictures\\bruno.jpg");
        both = new ImageIcon("C:\\Users\\Micgael\\Pictures\\pictures\\both.jpg");
        black = new ImageIcon("C:\\Users\\Micgael\\Pictures\\wallpaper\\black.jpg");

        label = new JLabel();
        label.setIcon(cristiano);
        label.addMouseListener(this);


        //label.addMouseListener(this);
        //this.addMouseListener(this);        // colors will change when you enter the frame
        this.add(label);
        this.pack();
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);         // this will have you frame open in the middle of your computer screen
        this.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) { //Invoked when the mouse button has been clicked (pressed and release) on a component
        System.out.println("You clicked the mouse");
        //label.setBackground(Color.YELLOW);
        label.setIcon(both);
    }
    @Override
    public void mousePressed(MouseEvent e) {    //Invoked when a mouse has been pressed on a component
        System.out.println("You pressed the mouse");
        //label.setBackground(Color.blue);
        label.setIcon(black);
    }
    @Override
    public void mouseReleased(MouseEvent e) {   // Invoked when a mouse button has been released on a component
        System.out.println("You released the mouse");
        //label.setBackground(Color.cyan);
        label.setIcon(both);
    }
    @Override
    public void mouseEntered(MouseEvent e) { // invoked when the mouse enters a component
        System.out.println("You entered the component");
        //label.setBackground(Color.MAGENTA);
        label.setIcon(bruno);
    }
    @Override
    public void mouseExited(MouseEvent e) {     //invoked when the mouse exits a component
        System.out.println("You exit the component");
        //label.setBackground(Color.red);
        label.setIcon(cristiano);
    }
}
