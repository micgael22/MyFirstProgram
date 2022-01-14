package jTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;                             //they must be declared outside the constructer *must be global
    JTextField textField;                       //so the Action performed method has access to it

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);         // Since the class is already implementing an action listener interface we could just add *this

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField.setForeground(Color.pink);                    //font color
        textField.setBackground(Color.gray);
        textField.setCaretColor(Color.magenta);
        textField.setText("username");

        this.add(button);
        this.add(textField);
        this.pack();                                //the frame wil adjust the components that you add
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button){
                System.out.println("Welcome: " + textField.getText());               //gettext to get the message
            button.setEnabled(false);
            textField.setEditable(false);
            }
    }
}
