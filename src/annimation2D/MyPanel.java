package annimation2D;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Image stage;
    Timer timer;
    int xVelocity = 1;          //How many pixels the image is moving
    int yVelocity = 1;
    int x = 0;
    int y =0;

    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        enemy = new ImageIcon("C:\\Users\\Micgael\\Desktop\\java course\\enemy.png").getImage();
        stage = new ImageIcon("C:\\Users\\Micgael\\Desktop\\java course\\stage.jpg").getImage();
        timer = new Timer(10,this);
        timer.start();
    }
    public void paint(Graphics g) {
        super.paint(g);         //paint Background

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(stage, 0, 0, null);
        g2D.drawImage(enemy, x, y, null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH - enemy.getWidth(null) || x < 0) {
            xVelocity = xVelocity *-1;
        }
        x = x + xVelocity;
        if (y >= PANEL_HEIGHT - enemy.getHeight(null) || y < 0) {
            yVelocity = yVelocity *-1;
        }
        y = y + yVelocity;
        repaint();
    }
}
