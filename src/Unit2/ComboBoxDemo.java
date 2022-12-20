/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Combo extends JFrame{
    JComboBox j1;
    JLabel l1,l2;
    JList j2;
    JTable tbl;
    public void setCombo()
    {
         String country[] = {"Nepal","USA","China"};
         String courses[] = {"BIM","BCA","CSIT","BBM","BHM"};
         String header[] ={"id","name","gender","faculty","grade"};
         String data[][] = {
             {"101","ramesh","male","csit","A+"},
             {"101","ramesh","male","csit","A+"},
             {"101","ramesh","male","csit","A+"},
             {"101","ramesh","male","csit","A+"},
             {"101","ramesh","male","csit","A+"},
             {"101","ramesh","male","csit","A+"},
             {"101","ramesh","male","csit","A+"},
             {"101","ramesh","male","csit","A+"},
             {"101","ramesh","male","csit","A+"},
             {"101","ramesh","male","csit","A+"}
         };
         j1 = new JComboBox(country);
         l1 = new JLabel("Result");
         l2 = new JLabel("Result for List");
         j2 = new JList(courses);
         tbl = new JTable(data,header);
         //to set scrollable size of table
         tbl.setPreferredScrollableViewportSize(new Dimension (250,100));
         
         //to insert scroll bar
         
         JScrollPane scroll = new JScrollPane(j2);//scroll bar for table
         JScrollPane scroll_tbl = new JScrollPane(tbl);//scroll bar for table
         add(j1);
         add(l1);
         add(l2);
         add(scroll);
         add(scroll_tbl);
         
         //for mulipke selection
         //0"->single selection, 1->single sselection interval
         //2->muliple selection
         
         j2.setSelectionMode(2);
         
         //combo box throw two events : actionevent and itemevent
         
         j1.addItemListener(new ItemListener(){
             @Override
             public void itemStateChanged(ItemEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                String Country = (String) j1.getSelectedItem();
                l1.setText("your country is " +country);
             }
         });
         
         //handling event for JList
         //JList throws ListSelectionEvent when item of List is Selected
     
         j2.addListSelectionListener(new ListSelectionListener(){
             @Override
             public void valueChanged(ListSelectionEvent e) {
                 //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                 //extracting value of selected item from the list
                 String res = "Your courses are: ";
                 ArrayList<String> arr = (ArrayList)j2.getSelectedValuesList();
                 for(String str:arr){
                     res+=","+str;
                 }
                 l2.setText(res);
             }
         });
         
         setVisible(true);
         setSize(200,200);
         setLayout(new FlowLayout());
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class ComboBoxDemo {
    public static void main(String[] args) {
        Combo c = new Combo();
        c.setCombo();
    }
}
