package Roma.Group.ID;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.awt.*;

/**
 * Created by rznamerovskiy on 8/22/2016.
 */
public class FindNumber extends JFrame {

    public static void main(String args[]) {
        FindNumber findANumber = new FindNumber("Game");
        findANumber.setVisible(true);
        findANumber.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        findANumber.setSize(300, 200);
        findANumber.setResizable(false);
        findANumber.setLocationRelativeTo(null);

    }

    Random random = new Random();
    int randomNumber = random.nextInt(1000);
    int enteredNumber;


    JButton button1;
    JLabel label1, label2;
    JTextField textField1;
    Logic logic = new Logic();

    public FindNumber(String s) {
        super(s);
        setLayout(new FlowLayout());
        button1 = new JButton("Ввести");
        label1 = new JLabel("Угадайте число от 0 - 1000  ");
        label2 = new JLabel("");
        textField1 = new JTextField(10);
        add(label1);
        add(button1);
        add(textField1);
        add(label2);
        button1.addActionListener(logic);


    }


    public class Logic implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == button1) {
                    enteredNumber = Integer.parseInt(textField1.getText());
                    if (enteredNumber == randomNumber) {
                        label1.setText("Вы выиграли                 ");
                    } else if (enteredNumber < randomNumber) {
                        label1.setText("Вы ввели меньшее число      ");
                    } else {
                        label1.setText("Вы ввели большее число      ");
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Введите в поле число");
            }
        }
    }
}
