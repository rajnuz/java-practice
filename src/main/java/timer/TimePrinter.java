package timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @author rajnuz
 * @date 2022/2/11 14:11
 */
public class TimePrinter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event){
            System.out.println("the time is " + new Date());
            Toolkit.getDefaultToolkit().beep();
        }

}

