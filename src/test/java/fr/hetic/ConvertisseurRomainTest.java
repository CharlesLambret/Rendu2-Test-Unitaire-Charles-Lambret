package fr.hetic;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ConvertisseurRomainTest {

    @Test
    public void doitConvertir2EnII() {
        ConvertisseurRomain convertisseur = new ConvertisseurRomain();
        String resultat = convertisseur.convertir(2);
        assertThat(resultat).isEqualTo("II");
    }

    @Test
    public void doitConvertir6EnVI() {
        ConvertisseurRomain convertisseur = new ConvertisseurRomain();
        String resultat = convertisseur.convertir(6);
        assertThat(resultat).isEqualTo("VI");
    }

    @Test
    public void doitConvertir13EnXIII() {
        ConvertisseurRomain convertisseur = new ConvertisseurRomain();
        String resultat = convertisseur.convertir(13);
        assertThat(resultat).isEqualTo("XIII");
    }

    @Test
    public void doitConvertir30EnXXX() {
        ConvertisseurRomain convertisseur = new ConvertisseurRomain();
        String resultat = convertisseur.convertir(30);
        assertThat(resultat).isEqualTo("XXX");
    }
}
