package com.hollyland.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName AngeListener
 * @Description TODO
 * @Author wangqiang
 * @Date 2022/7/28 9:39
 **/
public class AngeListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Don't do it, you might regret it!");
    }
}
