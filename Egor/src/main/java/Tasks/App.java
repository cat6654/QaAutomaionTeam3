package Tasks;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        GuessNumberForm form1 = new GuessNumberForm("Guess Number Game");
        form1.setVisible(true);
        form1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form1.setSize(300,200);
        form1.setLocationRelativeTo(null);
    }
}
