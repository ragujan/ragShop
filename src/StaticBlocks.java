/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class StaticBlocks {

    static {
        System.out.println("HYE");
    }

    public static void main(String[] args) {
        System.out.println("main");
        if (args.length > 0) {
            System.out.println(args[1] + " " + args[0]);
        }

    }

    static {
        System.out.println("after");
        String[] args = {"abc", "ccc"};
        main(args);
    }
}
