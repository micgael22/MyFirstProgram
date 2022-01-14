package jComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"Dog", "Cat", "Bird"};              // **you need to pass in an array of reference data types

        comboBox = new JComboBox(animals);                   //  **you have to use the wrapper class** specially if you want to use primitive data types
        comboBox.addActionListener(this);

        //comboBox.setEditable(true);
        //comboBox.getItemCount();                // print the certain amount of items
        //comboBox.addItem("Horse");
        comboBox.insertItemAt("Pig", 0);
        //comboBox.setSelectedIndex(2);
        //comboBox.removeItem("Cat");
        //comboBox.removeItem(1);
        //comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox);
        System.out.println(comboBox.getSelectedItem());
        //System.out.println(comboBox.getSelectedIndex());
    }
}
