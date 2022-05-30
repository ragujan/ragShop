/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtilRag;

import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author acer
 */
public class FilterDocRag {

    public void setDoc(JTextField jt) {

    }

    public JTextField setFilter(JTextField jt, String regex, int strmaxlength) {
        AbstractDocument ad = (AbstractDocument) jt.getDocument();
        ad.setDocumentFilter(new DocumentFilter() {
            @Override
            public void remove(DocumentFilter.FilterBypass fb, int offset, int length) throws
                    BadLocationException {

                fb.remove(offset, length);
            }

            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string,
                    AttributeSet attr) throws BadLocationException {
                fb.insertString(offset, string, attr);
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text,
                    AttributeSet attrs) throws BadLocationException {
                String jtText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                System.out.println(jtText);
                if (jtText.length() <= strmaxlength && jtText.matches(regex)) {
                    fb.replace(offset, length, text, attrs);
                }

            }

        });

        return jt;
    }
}
