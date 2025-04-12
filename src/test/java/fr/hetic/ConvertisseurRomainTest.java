package fr.hetic;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Map;

public class ConvertisseurRomainTest {

    private static final Map<Integer, String> TEST_CASES = Map.ofEntries(
        Map.entry(2, "II"),
        Map.entry(6, "VI"),
        Map.entry(13, "XIII"),
        Map.entry(30, "XXX"),
        Map.entry(40, "XL"),
        Map.entry(50, "L"),
        Map.entry(90, "XC"),
        Map.entry(100, "C"),
        Map.entry(400, "CD"),
        Map.entry(500, "D"),
        Map.entry(900, "CM"),
        Map.entry(1000, "M")
    );

    @Test
    public void checkConvertionValeur() {
        ConvertisseurRomain convertisseur = new ConvertisseurRomain();
        TEST_CASES.forEach((entier, romain) -> {
            String resultat = convertisseur.convertir(entier);
            assertThat(resultat).isEqualTo(romain);
        });
    }

    @Test
    public void checkExceptions() {
        ConvertisseurRomain convertisseur = new ConvertisseurRomain();
        assertThatThrownBy(() -> convertisseur.convertir(0))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Le nombre doit être compris entre 1 et 2000");

        assertThatThrownBy(() -> convertisseur.convertir(-1))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Le nombre doit être compris entre 1 et 2000");
        assertThatThrownBy(() -> convertisseur.convertir(3001))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Le nombre doit être compris entre 1 et 2000");
    }

}