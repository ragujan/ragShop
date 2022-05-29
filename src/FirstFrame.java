
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
import java.awt.*;
import javax.swing.*; 
import java.awt.Color;
import javax.swing.JPanel;

public class FirstFrame extends JFrame {


    //FirstFrame properties

    public FirstFrame(){

        setTitle ("Stacker");
        setSize (380,650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setUndecorated (true);
        setResizable(false);
        setVisible (true);

    }
public static void main (String[] args){
        new FirstFrame();
    }
}
