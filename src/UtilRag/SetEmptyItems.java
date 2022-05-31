/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtilRag;

import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author acer
 */
public class SetEmptyItems {
    
    public static void emptyItems(JComponent[] jcp) {
        for (int i = 0; i < jcp.length; i++) {
            if (jcp[i] instanceof JLabel) {
                JLabel jb = (JLabel) jcp[i];
                jb.setText("none");
            }
            
            if (jcp[i] instanceof JTextField) {
                JTextField jb = (JTextField) jcp[i];
                jb.setText("");
            }
            
            if (jcp[i] instanceof JComboBox) {
                JComboBox jb = (JComboBox) jcp[i];
                jb.setSelectedIndex(0);
            }
            if (jcp[i] instanceof JDateChooser) {
                JDateChooser jb = (JDateChooser) jcp[i];
                jb.setDate(new Date());
            }
        }
    }
}
