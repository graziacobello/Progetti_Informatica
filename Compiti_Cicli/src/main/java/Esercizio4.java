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

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int inseriti = 0;
        int precedente;

        System.out.print("Inserisci un nuovo numero\n> ");
        int nuovo = tastiera.nextInt();

        inseriti++;

        do {
            precedente = nuovo;
            System.out.print("Inserisci un nuovo numero\n> ");
            nuovo = tastiera.nextInt();
            inseriti++;
        } while (nuovo >= precedente);

        System.out.println("Sono stati inseriti " + inseriti + " numeri");

    }
}