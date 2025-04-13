package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MaaltijdOverzicht {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Persoon> personen = new ArrayList<>();

        System.out.print("Hoeveel gezinsleden zijn er? ");
        int aantal = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < aantal; i++) {
            System.out.print("Wat is je naam?: ");
            String naam = scanner.nextLine();
            Gezinslid gezinslid = new Gezinslid(naam);

            System.out.print("Welke dagen eet je mee? (enter voor alle dagen of bijv: maandag, dinsdag): ");
            String dagen = scanner.nextLine();
            gezinslid.voegEetDagenToe(dagen);

            personen.add(gezinslid);
        }

        System.out.print("Zijn er gasten? (ja/nee): ");
        String gastenAntwoord = scanner.nextLine();

        if (gastenAntwoord.equalsIgnoreCase("ja")) {
            System.out.print("Hoeveel gasten zijn er? ");
            int aantalGasten = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < aantalGasten; i++) {
                System.out.print("Wat is je naam?: ");
                String naam = scanner.nextLine();
                Gast gast = new Gast(naam);

                System.out.print("Welke dagen eet je mee? (enter voor alle dagen of bijv: maandag, dinsdag): ");
                String dagen = scanner.nextLine();
                gast.voegEetDagenToe(dagen);

                personen.add(gast);
            }
        }

        System.out.println("\nWeekoverzicht:");
        String[] dagenVanDeWeek = {"maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag", "zondag"};
        for (String dag : dagenVanDeWeek) {
            System.out.print(dag + ": ");
            boolean iemandEetMee = false;
            for (Persoon persoon : personen) {
                if (persoon.eetMee(dag)) {
                    System.out.print(persoon.getNaam() + " ");
                    iemandEetMee = true;
                }
            }
            if (!iemandEetMee) {
                System.out.print("Niemand");
            }
            System.out.println();
        }

        scanner.close();
    }
}
