package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow(){
        setVisible(true);
        setLocation(500,200);
        setSize(500, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(1,2));

        JButton button1 = new JButton("Exit");
        ActionListener closeListener = new CloseActionListener();
        button1.addActionListener(closeListener);
        panel.add(button1);

        JButton button2 = new JButton("copy");
        ActionListener copyListener = new CopyListener();
        button2.addActionListener(copyListener);
        panel.add(button2);

        add(panel, BorderLayout.SOUTH);
    }
}
