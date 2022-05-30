/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtilRag;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class BasicValidator {

    public static boolean emptyCheck(String s) {
        boolean state = false;
        if (s.isBlank()) {
            state = true;
        }
        return state;
    }

    public static boolean emptyCheck(String s, String placeholder) {
        boolean state = false;
        if (s.isBlank()) {
            state = true;
        }
        if (s.equals(placeholder)) {
            state = true;
        }
        return state;
    }

    public static boolean phoneNumber(String number) {

        boolean state = false;
        if (!(Pattern.compile("((^0(7)[1-24-66-8])[0-9]{7})").matcher(number).matches())) {
            state = true;
        }

        return state;
    }

    public static boolean email(String email) {
        boolean state = false;
        if (!(Pattern.compile("^[a-zA-Z0-9.]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$").matcher(email).matches())) {
            state = true;
        }

        return state;
    }

    public static boolean price(String price) {
        boolean state = false;
        if (!(Pattern.compile("^[a-zA-Z0-9.]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$").matcher(price).matches())) {
            state = true;
        }
        return state;
    }
}
