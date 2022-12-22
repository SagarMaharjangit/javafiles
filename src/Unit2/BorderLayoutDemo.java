/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Set;

class BorderEg extends JFrame{
    JButton b1,b2,b3,b4,b5;
    JTextArea t1;
    
    public void setBorder(){
        b1 = new JButton("North");
        b2 = new JButton("South");
        b3 = new JButton("East");
        b4 = new JButton("West");
        //b5 = new JButton("Center");
        
        t1 = new JTextArea();
        
        setVisible(true);
        setSize(400,400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //adding component into layout
        
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        //add(b5,BorderLayout.CENTER);
        add(t1);
        
        
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                t1.setText("NORTH has been pressed");
            } 
        });
        
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                t1.setText("SOUTH has been pressed");
            } 
        });
        
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                t1.setText("EAST has been pressed");
            } 
        });
        
        b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                t1.setText("WEST has been pressed");
            } 
        });
        
        
    
    }
}

public class BorderLayoutDemo {
    public static void main(String[] args) {
        BorderEg Eg =  new BorderEg();
        Eg.setBorder();
        
    }
}
