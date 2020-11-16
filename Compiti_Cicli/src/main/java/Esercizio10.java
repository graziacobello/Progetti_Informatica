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

public class Esercizio10 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int secondi = 0;

        System.out.print("Inserisci il livello iniziale del lavandino\n> ");
        int livello = tastiera.nextInt();
        System.out.print("Inserisci la capacita' del lavandino\n> ");
        int capacita = tastiera.nextInt();
        System.out.print("Inserisci quanti cl il lavandino riesce a scaricare al secondo\n> ");
        int x = tastiera.nextInt();
        System.out.print("Inserisci quanti cl cadono nel lavandino ogni 3 secondi dal rubinetto\n> ");
        int y = tastiera.nextInt();

        while ((secondi < 20) && (livello < capacita) && (livello > 0)) {
            secondi++;
            livello = livello - x;
            if (secondi % 3 == 0) {
                livello = livello + y;
            }
            if (livello < 0) {
                livello = 0;
            }
            System.out.println(secondi + "s - " + livello + " cl");
        }

        if (livello == 0) {
            System.out.println("Lavello svuotato");
        }

        if (livello >= capacita) {
            System.out.println("Lavello riempito/ha tracimato");
        }
    }
}