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
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author acer
 */
class EmptyDocumentFilter {

    JTextField jb;

    public EmptyDocumentFilter(JTextField jb) {
        this.jb = jb;
    }
    AbstractDocument ab = (AbstractDocument) jb.getDocument();

    public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text,
            AttributeSet attrs) throws BadLocationException {
        String jtText = fb.getDocument().getText(0, fb.getDocument().getLength());
        String newText = jtText.substring(0, offset) + text;

        fb.remove(0, offset);

    }
}

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
//                AbstractDocument ab = (AbstractDocument) jb.getDocument();
//                ab.setDocumentFilter(new DocumentFilter() {
//                    int localOffset=0;
//                    @Override
//                    public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text,
//                            AttributeSet attrs) throws BadLocationException {
//                        String jtText = fb.getDocument().getText(0, fb.getDocument().getLength());
//                        String newText = jtText.substring(0, offset) + text;
//                        localOffset = offset;
//                        System.out.println("text is " + text);
//                        System.out.println("length is " + offset);
//
//                        fb.remove(0, offset);
//                        System.out.println("ABC");
//
//                    }
//                   
//                });

            }

            if (jcp[i] instanceof JComboBox) {
                JComboBox jb = (JComboBox) jcp[i];
                jb.setSelectedIndex(0);
            }

        }
    }
}
