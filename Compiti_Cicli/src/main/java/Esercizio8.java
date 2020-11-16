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

public class Esercizio8 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        boolean annoDuplicazione = true;
        int anni = 0;

        System.out.print("Inserisci il valore iniziale della popolazione\n> ");
        float popolazione = tastiera.nextFloat();
        System.out.print("Inserisci un valore da raggiungere\n> ");
        int valoreDaRaggiungere = tastiera.nextInt();

        while (popolazione < valoreDaRaggiungere) {
            if (annoDuplicazione == true) {
                popolazione = popolazione * 2;
            } else {
                popolazione = popolazione * 2 / 3;
            }
            anni++;
        }

        System.out.println("La popolazione ha impiegato " + anni + " anni per raggiungere " + valoreDaRaggiungere);

    }
}