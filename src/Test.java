
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author acer
 */
public class Test {

    public static void main(String[] args) {
//        Pattern p = Pattern.compile("0777111444");
//        Matcher m = p.matcher("(^0)7([1-24-55-8]){8}");
        Pattern p = Pattern.compile("([0-9]{10})");
        Matcher m = p.matcher("0777111444");
        Boolean b = m.matches();
        if (m.matches()) {
            System.out.println("TTT");
        }
    }
}
