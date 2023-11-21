/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipotensblma;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Hipotensblma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.print("a kenarını giriniz");
        a = scanner.nextInt();
        System.out.print("b kenarı giriniz");
        b = scanner.nextInt();
        System.out.print(Math.sqrt(a*a + b*b));
    }
    
}
