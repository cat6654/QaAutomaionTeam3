package HM.NumberCatcher;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 * Created by alarin on 24.10.2016.
 */
public class JCatch extends JFrame {

    public JCatch(){
        initUI();
    }

    private void initUI() {

        setTitle("Numbers Catchers");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main (String[] args){

        EventQueue.invokeLater(() -> {
            JCatch jc = new JCatch();
            jc.setVisible(true);
        });
    }
}
