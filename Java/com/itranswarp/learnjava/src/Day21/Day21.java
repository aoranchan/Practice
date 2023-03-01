package Day21;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Day21 implements ActionListener {
    JButton botton;

    public static void test() {
        Day21 gui = new Day21();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame("Day21");
        JButton button = new JButton("click me");
        botton.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        botton.setText("I've been clicked!");
    }
}