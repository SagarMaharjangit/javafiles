/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class UserInput extends JFrame{
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2;
    
    public void setComponent(){
        l1 = new JLabel("Enter first Number: ");
        l2 = new JLabel("Enter second Number: ");
        l3 = new JLabel("Result");
        t1 = new JTextField(30);
        t2 = new JTextField(30);
        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        
        //addinf component on window
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(l3);
        
        //handling action listener
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());
                    int sum = num1 + num2;
                    l3.setText("sum is "+sum);
            }
            
        });
        
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());
                    int difference = num1 - num2;
                    l3.setText("differencea is "+difference);
            }
            
        });
        
        //setting properties of window
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
        
public class UserDemo {
    public static void main(String[] args) {
        UserInput u1 = new UserInput();
        u1.setComponent();
    }
}
