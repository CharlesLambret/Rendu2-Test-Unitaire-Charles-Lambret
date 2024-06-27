package fr.hetic;

public class ConvertisseurRomain {

    public String convertir(int nombre) {
        StringBuilder resultat = new StringBuilder();

        int[] valeurs = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symboles = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < valeurs.length; i++) {
            while (nombre >= valeurs[i]) {
                resultat.append(symboles[i]);
                nombre -= valeurs[i];
            }
        }

        return resultat.toString();
    }
}
