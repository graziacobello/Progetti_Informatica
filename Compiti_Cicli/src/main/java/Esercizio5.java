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

public class Esercizio5 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int turno = 1, offerta1 = 0, offerta2 = 0;
        int offerta;

        do {
            if (turno == 1) {
                System.out.print("Fa l'offerta il primo compratore\n> ");
            } else {
                System.out.print("Fa l'offerta il secondo compratore\n> ");
            }

            offerta = tastiera.nextInt();

            if (turno == 1) {
                offerta1 = offerta;
                turno++;
            } else {
                offerta2 = offerta;
                turno = turno - 1;
            }
        } while (offerta != 0);

        if (turno == 1) {
            System.out.println("Vince l'offerta di " + offerta1);
        } else {
            System.out.println("Vince l'offerta di " + offerta2);
        }
    }
}