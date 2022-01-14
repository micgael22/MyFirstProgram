package jOptionPane;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "This is some useless info", "title",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Here is more useless info", "title",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Really?", "title",JOptionPane.QUESTION_MESSAGE);
        //while (true){
            //JOptionPane.showMessageDialog(null, "Your computer has a VIRUS!", "title",JOptionPane.WARNING_MESSAGE);
       // }
        //JOptionPane.showMessageDialog(null, "Call tech support NOW!", "title",JOptionPane.ERROR_MESSAGE);

        //JOptionPane.showConfirmDialog(null,"Did you eat?", "this is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        //System.out.println(JOptionPane.showConfirmDialog(null,"Did you eat?", "this is my title", JOptionPane.YES_NO_CANCEL_OPTION));
        //int answer = JOptionPane.showConfirmDialog(null,"Did you eat?", "this is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        //String name = JOptionPane.showInputDialog("What is your name?: ");
        //System.out.println("Hello " +name);

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Micgael\\Desktop\\java course\\black.png");
        JOptionPane.showOptionDialog(null, "You are awesome!", "secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, imageIcon,null,0);
    }
}
/* JOptionPane = pop up a standard dialog box that prompts users for a value or informs them of something
 */
