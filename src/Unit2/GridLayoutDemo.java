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

class GridExample extends JFrame{
    JButton b1,b2,b3,b4,b5,b6;
    //JTextArea t1;
    
    public void setGrid(){
        b1 = new JButton("BUTTON1");
        b2 = new JButton("BUTTON2");
        b3 = new JButton("BUTTON3");
        b4 = new JButton("BUTTON4");
        b5 = new JButton("BUTTON5");
        b6 = new JButton("BUTTON6");
        
        //t1 = new JTextArea();
        
        setVisible(true);
        setSize(400,400);
        setLayout(new GridLayout(2,3,25,20));//(rows,column,vertical height, horizontal height)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //adding component into layout
        
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        
    
    }
}


public class GridLayoutDemo {
    public static void main(String[] args) {
        GridExample Ge = new GridExample();
        Ge.setGrid();
    }
}
