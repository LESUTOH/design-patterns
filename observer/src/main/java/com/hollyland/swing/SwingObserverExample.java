package com.hollyland.swing;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName SwingObserverExample
 * @Description TODO
 * @Author wangqiang
 * @Date 2022/7/28 9:36
 **/
public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it ?");
        // button.addActionListener(new AngeListener());
        // button.addActionListener(new DeviListener());

        button.addActionListener(event ->
            System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(event ->
            System.out.println("Come on,do it!"));

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
