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
    @Test
    public void doitConvertir40EnXL() {
        ConvertisseurRomain convertisseur = new ConvertisseurRomain();
        String resultat = convertisseur.convertir(40);
        assertThat(resultat).isEqualTo("XL");
    }

    @Test
    public void doitConvertir50EnL() {
        ConvertisseurRomain convertisseur = new ConvertisseurRomain();
        String resultat = convertisseur.convertir(50);
        assertThat(resultat).isEqualTo("L");
    }

    @Test
    public void doitConvertir90EnXC() {
        ConvertisseurRomain convertisseur = new ConvertisseurRomain();
        String resultat = convertisseur.convertir(90);
        assertThat(resultat).isEqualTo("XC");
    }

    @Test
    public void doitConvertir100EnC() {
        ConvertisseurRomain convertisseur = new ConvertisseurRomain();
        String resultat = convertisseur.convertir(100);
        assertThat(resultat).isEqualTo("C");
    }

    @Test
    public void doitConvertir400EnCD() {
        ConvertisseurRomain convertisseur = new ConvertisseurRomain();
        String resultat = convertisseur.convertir(400);
        assertThat(resultat).isEqualTo("CD");
    }

    @Test
    public void doitConvertir500EnD() {
        ConvertisseurRomain convertisseur = new ConvertisseurRomain();
        String resultat = convertisseur.convertir(500);
        assertThat(resultat).isEqualTo("D");
    }

    @Test
    public void doitConvertir900EnCM() {
        ConvertisseurRomain convertisseur = new ConvertisseurRomain();
        String resultat = convertisseur.convertir(900);
        assertThat(resultat).isEqualTo("CM");
    }

    @Test
    public void doitConvertir1000EnM() {
        ConvertisseurRomain convertisseur = new ConvertisseurRomain();
        String resultat = convertisseur.convertir(1000);
        assertThat(resultat).isEqualTo("M");
    }

    @Test
    public void doitConvertir1042EnMXLII() {
        ConvertisseurRomain convertisseur = new ConvertisseurRomain();
        String resultat = convertisseur.convertir(1042);
        assertThat(resultat).isEqualTo("MXLII");
    }

    @Test
    public void doitLancerExceptionPourZeroOuNegatif() {
        ConvertisseurRomain convertisseur = new ConvertisseurRomain();
        assertThatThrownBy(() -> convertisseur.convertir(0))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Le nombre doit être compris entre 1 et 2000");
        
        assertThatThrownBy(() -> convertisseur.convertir(-1))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Le nombre doit être compris entre 1 et 2000");
    }

    @Test
    public void doitLancerExceptionPourNombreSuperieurA2000() {
        ConvertisseurRomain convertisseur = new ConvertisseurRomain();
        assertThatThrownBy(() -> convertisseur.convertir(3001))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Le nombre doit être compris entre 1 et 2000");
    }
}


