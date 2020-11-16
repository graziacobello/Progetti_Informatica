package com.company.progetto_distributore;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Davide
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroCaramelle;
        float prezzoCaramelle;

        while (true) {
            System.out.print("Inserisci il numero di caramelle\n> ");
            numeroCaramelle = input.nextInt();

            if (numeroCaramelle > 0) {
                break;
            } else {
                System.out.println("Perfavore inserisci un valore positivo.");
            }
        }

        while (true) {
            System.out.print("Inserisci il prezzo di una caramella\n> ");
            prezzoCaramelle = input.nextFloat();

            if (prezzoCaramelle > 0) {
                break;
            } else {
                System.out.println("Perfavore inserisci un valore positivo.");
            }
        }

        int numeroDiCaramelleDaComprare;
        boolean caramelleInStock = true;
        float soldiDellUtente;
        float prezzoTotale, resto;

        while (caramelleInStock) {
            System.out.print("Quante caramelle vuoi comprare?\n> ");
            numeroDiCaramelleDaComprare = input.nextInt();

            if (numeroDiCaramelleDaComprare > 0 && numeroCaramelle >= numeroDiCaramelleDaComprare) {
                prezzoTotale = numeroDiCaramelleDaComprare * prezzoCaramelle;

                while (true) {
                    System.out.println("Totale per " + numeroDiCaramelleDaComprare + " caramelle: " + prezzoTotale + "€");
                    System.out.print("Inserire l'importo da pagare\n> ");
                    soldiDellUtente = input.nextFloat();

                    if (soldiDellUtente >= prezzoTotale) {
                        resto = soldiDellUtente - prezzoTotale;
                        numeroCaramelle -= numeroDiCaramelleDaComprare;
                        System.out.println("Il tuo resto ammonta a " + resto + "€");

                        if (numeroCaramelle == 0) {
                            System.out.println("Caramelle finite.");
                            caramelleInStock = false;
                        }

                        break;
                    } else {
                        System.out.println("Non hai abbastanza soldi.");
                    }
                }
            } else if (numeroDiCaramelleDaComprare <= 0) {
                System.out.println("Numero non valido, perfavore inserisci un numero positivo.");
            } else {
                System.out.println("Caramelle insufficienti.");
            }
        }
    }
}
