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

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int giorni = 0;
        int giorniPastina = 0;
        int giorniPanino = 0;
        boolean soddisfatto = true;

        System.out.print("Quanti soldi ha Mario?\n> ");
        float soldi = tastiera.nextFloat();

        while ((soldi >= 1) && (soddisfatto)) {
            System.out.println("Mario vuole una pastina o un panino? ");
            System.out.println("(digitare a per pastina b per panino)");
            System.out.print("> ");

            char scelta = tastiera.next().charAt(0);

            switch (scelta) {
                case 'a':
                    soldi = soldi - 1;
                    giorni++;
                    giorniPastina++;
                    break;
                
                case 'b':
                    if (soldi > 1.5) {
                        soldi = soldi - 1.5f;
                        giorni++;
                        giorniPanino++;
                    }
                    break;
            
                default:
                    soddisfatto = false;
                    break;
            }
        }

        System.out.println("Mario ha mangiato per " + giorni + " giorni");
        System.out.println("Mario ha mangiato " + giorniPanino + " panini");
        System.out.println("Mario ha mangiato " + giorniPastina + " pastine");

    }
}