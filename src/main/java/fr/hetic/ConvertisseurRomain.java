package fr.hetic;

public class ConvertisseurRomain {

    public String convertir(int nombre) {
        StringBuilder resultat = new StringBuilder();

        while (nombre >= 10) {
            resultat.append("X");
            nombre -= 10;
        }
        while (nombre >= 5) {
            resultat.append("V");
            nombre -= 5;
        }
        while (nombre >= 1) {
            resultat.append("I");
            nombre -= 1;
        }

        return resultat.toString();
    }
}
