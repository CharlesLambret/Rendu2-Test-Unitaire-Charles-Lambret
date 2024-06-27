package fr.hetic;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ConvertisseurRomainTest {

    @Test
    public void doitConvertir1EnI() {
        ConvertisseurRomain convertisseur = new ConvertisseurRomain();
        String resultat = convertisseur.convertir(1);
        assertThat(resultat).isEqualTo("I");
    }
}
