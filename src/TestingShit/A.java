package TestingShit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */

import java.awt.TextField;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

class IntegerRangeDocumentFilter extends DocumentFilter {

    RangeSample overallJTextVariable;

    public IntegerRangeDocumentFilter() {

    }

    public IntegerRangeDocumentFilter(RangeSample rs) {
        overallJTextVariable = rs;

    }

    @Override
    public void insertString(DocumentFilter.FilterBypass fb, int offset, String string,
            AttributeSet attr) throws BadLocationException {
        System.out.println("insert string" + string);

        super.insertString(fb, offset, string, attr);
    }

    @Override
    public void remove(DocumentFilter.FilterBypass fb, int offset, int length)
            throws BadLocationException {
        System.out.println("remove");
        //System.out.println(overallJTextVariable.getText());
        super.remove(fb, offset, length);
    }

    @Override
    public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text,
            AttributeSet attrs) throws BadLocationException {

        String s = overallJTextVariable.textFieldOne.getText() + text;

        if (s.length() == 3) {
            if (!Pattern.compile("^07([1-24-55-8])").matcher(s).matches()) {

                String rep = s.substring(0, 2);
                System.out.println(rep + " No");
                System.out.println("HEY STOP");
                overallJTextVariable.textFieldOne.setText("");//this works but 
             //  overallJTextVariable.textFieldOne.setText("07");//this won't work
                overallJTextVariable.setJFText();  
             super.replace(fb, offset, length, "", attrs);
            } else {

            }
        }
        super.replace(fb, offset, length, text, attrs);
    }
}

class RangeSample {

    JTextField textFieldOne = new JTextField();

    public static void main(String args[]) {
        RangeSample rs = new RangeSample();
        JFrame frame = new JFrame("Range Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Document textDocOne = rs.textFieldOne.getDocument();
        DocumentFilter filterOne = new IntegerRangeDocumentFilter(rs);
        ((AbstractDocument) textDocOne).setDocumentFilter(filterOne);
        frame.add(rs.textFieldOne);

        frame.setSize(250, 150);
        frame.setVisible(true);
    }

    public void setJFText() {
        
            this.textFieldOne.setText("HEY");
    }
}

class MyDocumentFilter extends DocumentFilter {

}
