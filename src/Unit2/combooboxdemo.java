/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class ListCombo extends JFrame{
    JComboBox j1;
    JList j2;
    JLabel l1, l2;
    JTable tb1;
    public void setList(){
        String country[] = {"Nepal", "India", "China", "Japan"};
        String course[]= {"BCA", "BIM", "BbA", "BHM"};
        //for jtable header 
        String[] header= {"id", "name", "gender", "faculty", "grade"};
        String [][] data={
            {"1", "ram", "male", "csit", "A+"},
            {"1", "ram", "male", "csit", "A+"},
            {"1", "ram", "male", "csit", "A+"},
            {"1", "ram", "male", "csit", "A+"},
            {"1", "ram", "male", "csit", "A+"},
            {"1", "ram", "male", "csit", "A+"},
            {"1", "ram", "male", "csit", "A+"},
            {"1", "ram", "male", "csit", "A+"},
            {"1", "ram", "male", "csit", "A+"},
            {"1", "ram", "male", "csit", "A+"},
            {"1", "ram", "male", "csit", "A+"},
            {"1", "ram", "male", "csit", "A+"},
            {"1", "ram", "male", "csit", "A+"},
            {"1", "ram", "male", "csit", "A+"},
            {"1", "ram", "male", "csit", "A+"},
        
        };
                
                j1= new JComboBox(country);
                j2= new JList(course);
                l1 = new JLabel("Result for combo List");
                l2 = new JLabel("result for list");
                tb1 = new JTable(data,header);
                tb1.setPreferredScrollableViewportSize(new Dimension( 250,200));
         //to insert scroll bar
         
         
         JScrollPane scroll = new JScrollPane(j2);
         JScrollPane sc1 = new JScrollPane(tb1);
         add(j1);
         add(l1);
         add(scroll);
         add(l2);
         add(tb1);
         
         
            
            j2.setSelectionMode(1);
            //combobox throws 2 events...action event and item event
            j1.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            String country = (String)j1.getSelectedItem();
            l1.setText("YOUR COUNTRY IS "+country);
            }
            
            });
            //event handling in JLIst
            
            
            
            
            setVisible(true);
            setSize(500,500);
            setLayout(new FlowLayout());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         
    } 
     }

public class combooboxdemo {
    public static void main(String[] args) {
        ListCombo lc = new ListCombo();
        lc.setList();
        
    }
    
}
