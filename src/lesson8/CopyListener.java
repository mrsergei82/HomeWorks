package lesson8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CopyListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        new MyWindow();
    }
}
