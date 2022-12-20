/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class KeySample extends JFrame{
    
   JTextField t1;
   JLabel l1;
   public void setKey(){
       t1 = new JTextField(30);
       l1 = new JLabel("RESULTS");
       
       add(t1);
       add(l1);
       
       
     t1.addKeyListener(new KeyListener(){
           @Override
           public void keyTyped(KeyEvent e) {
            l1.setText("key typed");
            
// throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           }

           @Override
           public void keyPressed(KeyEvent e) {
            l1.setText("key pressed"+e.getKeyChar());
// throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           }

           @Override
           public void keyReleased(KeyEvent e) {
              l1.setText("key released"+e.getKeyChar());
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           }
         
     });
      setVisible(true);
            setSize(500,500);
            setLayout(new FlowLayout());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
   }
 

}
/**
 *
 * @author Dell
 */
public class KeyEventt {
    public static void main(String[] args) {
        KeySample ke = new KeySample();
        ke.setKey();
        
    }
    
}
