package TestingShit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */

import java.awt.BorderLayout;
//from   w  w  w .j  a va  2  s  .c  o  m
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

class Main {

    public static void main(String[] args) {
        Main m = new Main();
        JTextArea ta = new JTextArea(20, 20);
        ((AbstractDocument) ta.getDocument()).setDocumentFilter(new MyFilter(ta));
        DocumentFilter dc = ((AbstractDocument) ta.getDocument()).getDocumentFilter();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(ta));
        frame.pack();
        frame.setVisible(true);
    }

}

class MyFilter extends DocumentFilter {

    JTextArea j;

    public MyFilter(JTextArea tx) {
        j = tx;
    }
    String s;

    @Override
    public void replace(DocumentFilter.FilterBypass fb, int offset, int length,
            String text, AttributeSet attrs) throws BadLocationException {
           String docText =  fb.getDocument().getText(0, fb.getDocument().getLength());
           System.out.println(docText);
             //fb.insertString(offset, text.replaceAll("\\D", ""), attrs);
        
        super.replace(fb, offset, length, text, attrs);
    }

    @Override
    public void insertString(DocumentFilter.FilterBypass fb, int offset,
            String text, AttributeSet attr) throws BadLocationException {
        System.out.println("Added: " + text);
        super.insertString(fb, offset, text, attr);
    }

    @Override
    public void remove(DocumentFilter.FilterBypass fb, int offset, int length)
            throws BadLocationException {
        System.out.println("Removed :" + fb.getDocument().getText(offset, length));
        super.remove(fb, offset, length);
    }

}
