package graphics2D;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    Image image;

    MyPanel () {
        image = new ImageIcon("C:\\Users\\Micgael\\Desktop\\java course\\clouds.png").getImage();
        this.setPreferredSize(new Dimension(500,500));
    }
    public void paint (Graphics g) {        //g is going to be our graphics object //  paint method is called behind the scenes, it invokes automatically when we instantiate a component such a JFrame
        Graphics2D g2D = (Graphics2D) g;             //graphics 2D is a child class of (Graphics g)
        g2D.drawImage(image,0,0,null);

        //g2D.setPaint(Color.black);
        //g2D.setStroke(new BasicStroke(5));
        //g2D.drawLine(0,0,500,500);

        //g2D.setPaint(Color.orange);
        //g2D.drawRect(0,0, 100,200);
        //g2D.fillRect(0,0,100,200);

        //g2D.setPaint(Color.orange);
        //g2D.drawOval(0,0,100,100);
        //g2D.fillOval(0,0,100,100);

        g2D.setPaint(Color.red);
        //g2D.drawArc(0,0,100,100,180,180);
        g2D.fillArc(0,0,100,100,0,100);
        g2D.setPaint(Color.white);
        g2D.fillArc(0,0,100,100,180,100);

       int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};
        g2D.setPaint(Color.YELLOW);
        //g2D.drawPolygon(3);
        g2D.fillPolygon(xPoints, yPoints,3);

        g2D.setPaint(Color.black);
        g2D.setFont(new Font("Ink Free", Font.BOLD, 30));
        g2D.drawString("YOU ARE A WINNER :D", 50,50);


    }
}
