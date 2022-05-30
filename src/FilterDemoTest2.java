
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author acer
 */
public class FilterDemoTest2 {

    public static void main(String[] args) {
        JTextField jt = new JTextField();
        FilterDemoTest2 fdt2 = new FilterDemoTest2();
        fdt2.m(jt);
    }

    public void m(JTextField jt) {

        JFrame jf = new JFrame();
        jf.setLayout(new BorderLayout());

        String[] labels = {"Player Name: ", "Initial Chips: "};
        String[] filters = {"^[0-9][A-Za-z0-9_ ]*$"};
        final int numPairs = labels.length;
        jt = createFilteredField(filters[0]);
        jf.add(jt);

        // Create and associate the field inputs and labels and regex filters
//        for (int i = 0; i < numPairs; i++) {
//            JLabel label = new JLabel(labels[i], JLabel.TRAILING);
//            fieldPanel.add(label);
//            JTextField textField = createFilteredField(filters[i]);
//            label.setLabelFor(textField);
//            fieldPanel.add(textField);
//            jLabels.add(label);
//            jTextFields.add(textField);
//        }
        //jf.add(borderPanel);
        jf.setSize(300, 300);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);

    }

    public JTextField createFilteredField(String regex) {
        JTextField field = new JTextField(12);
        AbstractDocument document = (AbstractDocument) field.getDocument();
        final int maxCharacters = 20;
        document.setDocumentFilter(new DocumentFilter() {

            @Override
            public void remove(FilterBypass fb, int offset, int length) throws
                    BadLocationException {
                String text = fb.getDocument().getText(0, fb.getDocument().getLength());
                String newText = text.substring(0, offset) + text.substring(offset + length);
                if (newText.matches(regex) || newText.length() == 0) {
                    super.remove(fb, offset, length);
                }
            }

            public void replace(FilterBypass fb, int offset, int length,
                    String _text, AttributeSet attrs) throws BadLocationException {
                System.out.println("////////");
                System.out.println("REPLACE STRING");
                String text = fb.getDocument().getText(0, fb.getDocument().getLength());
                System.out.println("text is " + text);
                System.out.println("fb.getDocument().getLendth is " + fb.getDocument().getLength());
                System.out.println("length is " + length);
                System.out.println("offset is " + offset);
                System.out.println("text substring 0,offset value is " + text.substring(0, offset));
                System.out.println("parameter _text is " + _text);
                
                System.out.println("substring offset + length is " + text.substring(offset + length));
                String newText = text.substring(0, offset) + _text + text.substring(offset + length);
                System.out.println("newText is " + newText);
                if (newText.length() <= maxCharacters && newText.matches(regex)) {
                    super.replace(fb, offset, length, _text, attrs);
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }

            @Override
            public void insertString(FilterBypass fb, int offset, String string,
                    AttributeSet attr) throws BadLocationException {
                System.out.println("INSERT STRING");
                String text = fb.getDocument().getText(0, fb.getDocument().getLength());
                String newText = text.substring(0, offset) + string + text.substring(offset);
                if ((fb.getDocument().getLength() + string.length()) <= maxCharacters
                        && newText.matches(regex)) {
                    super.insertString(fb, offset, string, attr);
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });
        return field;
    }
}
