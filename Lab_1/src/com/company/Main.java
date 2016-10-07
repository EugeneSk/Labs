package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame("First");
        JButton btn=new JButton("Результат:");
        JTextField ta=new JTextField();
        JTextField tb=new JTextField();
        JTextField tc=new JTextField();
        GridLayout gbl = new GridLayout(4,0);
        frame.setLayout(gbl);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(ta,BorderLayout.NORTH);
        frame.getContentPane().add(tb,BorderLayout.NORTH);
        frame.getContentPane().add(btn,BorderLayout.CENTER);
        frame.getContentPane().add(tc,BorderLayout.SOUTH);
        frame.setSize(400,400);
        frame.setVisible(true);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String a,b,c="";
                int i,j;
                boolean k;
                a = ta.getText();
                b = tb.getText();
                for(j=0;j<=a.length()-1;j++) {
                    k=true;
                    for(i=0;i<=b.length()-1;i++){
                        if(a.charAt(j)==b.charAt(i)) k=false;
                    }
                    if(k==true)c=c+a.charAt(j);
                }
                tc.setText(c);
            };
        });
    }
}