/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MenuExample extends JFrame{
    JMenuBar mb; // to create menu bar
    JMenu m1,m2,m3; //to create main menu
    JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13;//to insert item in menu
    ImageIcon p;
    
    
    public void setMenu(){
        
        p = new ImageIcon("C:\\Users\\Dell\\Desktop\\new.png");
        
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edt");
        m3 = new JMenu("View");
        
        
        i1 = new JMenuItem("New",p);
        i2 = new JMenuItem("New Window");
        i3 = new JMenuItem("Open");
        i4 = new JMenuItem("Save");
        i5 = new JMenuItem("Save as");
        
        i6 = new JMenuItem("Copy");
        i7 = new JMenuItem("Cut");
        i8 = new JMenuItem("Paste");
        i9 = new JMenuItem("Select");
        i10 = new JMenuItem("Delete");
        
        i11 = new JMenuItem("Zoom");
        i12 = new JMenuItem("Status Bar");
        i13 = new JMenuItem("Word Wrap");
        
        //adding items to File
        
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m1.add(i4);
        m1.add(i5);
        
        //adding items to Edit
        
        m2.add(i6);
        m2.add(i7);
        m2.add(i8);
        m2.add(i9);
        m2.add(i10);
        
        //adding items to View
        
        m3.add(i11);
        m3.add(i12);
        m3.add(i13);
        
        //adding menu into menu bar
        
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        
        //adding menu into JFrame
        
        add(mb);
        
        setVisible(true);
        setSize(200,200);
        setLayout(new FlowLayout(FlowLayout.LEFT,25,30/*FlowLayout.LEFT for menu alignment*/));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class MenuBarDemo {
    public static void main(String[] args) {
        MenuExample m = new MenuExample();
        m.setMenu();
    }
}
