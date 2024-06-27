package fr.hetic;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConvertisseurRomain convertisseur = new ConvertisseurRomain();

        System.out.println("Entrez un nombre entre 1 et 3000 : ");
        int nombre = scanner.nextInt();

        try {
            String resultat = convertisseur.convertir(nombre);
            System.out.println("Le chiffre romain est : " + resultat);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
