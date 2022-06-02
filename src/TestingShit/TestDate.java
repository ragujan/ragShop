package TestingShit;



import java.text.SimpleDateFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class TestDate {
    public static void main(String[] args) {
        String s = "1999-09-45";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    sdf.setLenient(false);
        try {
            System.out.println(sdf.parse(s));
            System.out.println("Ok");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Nope Invalid");
        }
    }
}
