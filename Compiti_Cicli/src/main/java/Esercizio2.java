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

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int giorni = 0;

        System.out.print("Inserisci il numero di ammalati\n> ");
        int ammalati = tastiera.nextInt();
        System.out.print("Inserisci la percentuale di guarigione\n> ");
        int percentuale = tastiera.nextInt();
        
        while (ammalati >= 100) {
            giorni++;
            ammalati = ammalati - (ammalati * percentuale / 100);
            System.out.println("Giorno: " + giorni + " | Ammalati: " + ammalati);
        }

        System.out.println("Sono stati necessari " + giorni + " giorni");
    }
}