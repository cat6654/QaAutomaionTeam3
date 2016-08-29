package group_hometasks.hometask_02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by adombrovskiy on 8/19/2016.
 */
public class SimpleGame {
    private JTextField textField1;
    private JPanel panel1;
    private JButton button1;
    private JLabel Log;

    public SimpleGame() {
        Random rnd = new Random();
        int GuessNumber = rnd.nextInt(1000);
        button1.addActionListener( ae ->  {
            //JOptionPane.showMessageDialog(null, "Clicked");
            int guess=0;
            try{
                guess = Integer.parseInt(textField1.getText());
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Wrong data! Please input correct number");
            }
            if(guess>GuessNumber)
            Log.setText("Done!");

        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new SimpleGame().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300,300);
        frame.setVisible(true);
    }

}
