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

public class Esercizio6 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int nVecchio = 0;

        System.out.print("Inserisci un numero\n> ");
        int nNuovo = tastiera.nextInt();

        do {
            nVecchio = nNuovo;
            System.out.print("Inserisci un numero\n> ");
            nNuovo = tastiera.nextInt();
        } while (nVecchio != nNuovo);

        System.out.println("Hai inserito due volte consecutive il numero " + nVecchio);
    }
}