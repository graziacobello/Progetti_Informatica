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

public class Esercizio9 {
    public static void main() {
        Scanner tastiera = new Scanner(System.in);
        int anni = 0;

        System.out.print("Inserisci il saldo iniziale\n> ");
        float saldo = tastiera.nextInt();
        System.out.print("Inserisci l'interesse\n> ");
        float interesse = tastiera.nextInt();
        System.out.print("Inserisci la soglia da raggiungere\n> ");
        float soglia = tastiera.nextInt();

        while (saldo < soglia) {
            anni++;
            saldo = saldo + (saldo * interesse / 100);
            System.out.println("Anni: " + anni + " | Saldo: " + saldo);
        }

        System.out.println("Ci sono voluti " + anni + " anni per raggiungere o superare " + soglia);
    
    }
}       