package timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


/**
 * @author rajnuz
 * @date 2022/2/11 14:03
 */
public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();

        //every 10 seconds
        Timer t = new Timer(10000,listener);
        t.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }

}
