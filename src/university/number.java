/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university;

import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class number {

    public static void main(String arg[]) {
        Scanner lc = new Scanner(System.in);
        System.out.println("---- Enter Number ----");
        int number = lc.nextByte();
        int intruction = number % 2;
        String result = intruction == 0 ? "even" : "odd";
        System.out.println(result);
    }
   

}
