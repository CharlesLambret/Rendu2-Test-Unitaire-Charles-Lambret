package fr.hetic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ConvertisseurRomain convertisseur = new ConvertisseurRomain();

            System.out.println("Entrez un nombre entre 1 et 2000 : ");
            try {
                int nombre = scanner.nextInt();
                String resultat = convertisseur.convertir(nombre);
                System.out.println("Le chiffre romain est : " + resultat);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Veuillez entrer un nombre valide.");
            }
        }
    }
}
