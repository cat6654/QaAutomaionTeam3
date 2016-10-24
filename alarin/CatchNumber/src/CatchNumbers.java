/**
 * Created by alarin on 24.10.2016.
 */

import java.awt.EventQueue;
import javax.swing.JFrame;

public class CatchNumbers extends JFrame {

    public CatchNumbers() {

        initUI();
    }

    private void initUI() {

        setTitle("Numbers Catcher");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            CatchNumbers ex = new CatchNumbers();
            ex.setVisible(true);
        });
    }
}