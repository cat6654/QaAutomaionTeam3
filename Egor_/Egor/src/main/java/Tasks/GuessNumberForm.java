package Tasks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/**
 * Created by Egor on 04.09.2016.
 */
public class GuessNumberForm extends JFrame
{
    int randomNumber;
    JButton check;
    JLabel inputNumberLabel,result;
    JTextField inputNumberEdit;

    public GuessNumberForm(String s)
    {
        super(s);
        randomNumber = new Random().nextInt(1000);
        setLayout(new FlowLayout());
        check = new JButton("Check");
        inputNumberLabel = new JLabel("Enter a number");
        result = new JLabel("");
        inputNumberEdit = new JTextField(10);
        add(inputNumberLabel);
        add(inputNumberEdit);
        add(check);
        add(result);

        ActionListener handler = new eHandler();
        check.addActionListener(handler);
    }


    String[] buttons = { "Restart", "Close" };

    private class eHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==check)
            {
                try
                {
                    int num = Integer.parseInt(inputNumberEdit.getText());
                    if(num > randomNumber)
                        result.setText("required number is less");
                    else if(num < randomNumber)
                        result.setText("required number is more");
                    else
                    {
                        int rc = JOptionPane.showOptionDialog(null, "Do you want to try again?", "You Win!!!",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, buttons, buttons[0]);
                        if(rc == 0)
                        {
                            randomNumber = new Random().nextInt(1000);
                            result.setText("");
                            inputNumberEdit.setText("");
                        }
                        else
                            dispose();

                    }
                }
                catch(Exception ex){result.setText("Incorrect input");}
            }
        }
    }

}


