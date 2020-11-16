/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Davide
 */
import java.util.Scanner;

public class Esercizio7 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int a = 0, b = 0, c = 0;

        b = tastiera.nextInt();
        c = tastiera.nextInt();

        if (b + c != 10) {
            do {
                a = b;
                b = c;
                c = tastiera.nextInt();
            } while ((c + b != 10) && (a != c));
        }
    }
}