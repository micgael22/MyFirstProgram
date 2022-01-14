package jButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame(){

        ImageIcon icon = new ImageIcon("C:\\Users\\Micgael\\Desktop\\java course\\left.png");
        ImageIcon icon1 = new ImageIcon("C:\\Users\\Micgael\\Desktop\\java course\\south.png");

        label = new JLabel();
        label.setIcon(icon1);
        label.setBounds(150, 250 ,150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        //button.addActionListener(e -> System.out.println("mee"));       //Does the exact same thing just with less syntax
        button.addActionListener(this);
        button.setText("I'm a button!");
        button.setFocusable(false);                 //get rid of the text around the button
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.BLACK);
        button.setBackground(Color.GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button);
       System.out.println("mee");
        label.setVisible(true);
      // button.setEnable.(false);
       //you can only press once, it will be disabled
    }
}
