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

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int malati = 1;
        int giorni = 0;
        
        System.out.println("Inserisci la popolazione\n> ");
        int persone = tastiera.nextInt();
        System.out.println("Inserisci il tasso di contagio\n> ");
        int tasso = tastiera.nextInt();

        while (malati < (persone / 2)) {
            malati = malati + (malati * tasso);
            System.out.println(malati);
            giorni++;
        }

        System.out.println("I giorni neessari per far ammalare almeno la meta' della popolazione sono " + giorni);
    }
}