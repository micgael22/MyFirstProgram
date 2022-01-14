package colorChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("this is some text!!");
        label.setFont(new Font("MV Boli", Font.PLAIN,90));
        label.setOpaque(true);                            //to display the background color

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                JColorChooser colorChooser = new JColorChooser();   // wil create an instance of our new color chooser

                Color color = JColorChooser.showDialog(null, "Pick a color... If you want to", Color.black);
                //label.setForeground(color);        // if you want to actually change whatever you is trying to color
                label.setBackground(color);
            }
    }
}
