package fr.hetic;

public class ConvertisseurRomain {

    public String convertir(int nombre) {
        if (nombre <= 0 || nombre > 2000) {
            throw new IllegalArgumentException("Le nombre doit être compris entre 1 et 2000");
        }

        StringBuilder resultat = new StringBuilder();
        
        resultat.append("M".repeat(nombre / 1000));
        nombre %= 1000;

        if (nombre >= 900) {
            resultat.append("CM");
            nombre -= 900;
        }

        resultat.append("D".repeat(nombre / 500));
        nombre %= 500;

        if (nombre >= 400) {
            resultat.append("CD");
            nombre -= 400;
        }

        resultat.append("C".repeat(nombre / 100));
        nombre %= 100;

        if (nombre >= 90) {
            resultat.append("XC");
            nombre -= 90;
        }

        resultat.append("L".repeat(nombre / 50));
        nombre %= 50;

        if (nombre >= 40) {
            resultat.append("XL");
            nombre -= 40;
        }

        resultat.append("X".repeat(nombre / 10));
        nombre %= 10;

        if (nombre >= 9) {
            resultat.append("IX");
            nombre -= 9;
        }

        resultat.append("V".repeat(nombre / 5));
        nombre %= 5;

        if (nombre >= 4) {
            resultat.append("IV");
            nombre -= 4;
        }

        resultat.append("I".repeat(nombre));

        return resultat.toString();
    }
}
