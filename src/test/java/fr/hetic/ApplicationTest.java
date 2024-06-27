package fr.hetic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ApplicationTest {

    private final ByteArrayOutputStream sortie = new ByteArrayOutputStream();
    private final PrintStream ancienneSortie = System.out;
    private final ByteArrayInputStream entree = new ByteArrayInputStream("5\n".getBytes());
    private final ByteArrayInputStream entreeInvalide = new ByteArrayInputStream("-1\n".getBytes());

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(sortie));
        System.setIn(entree);
    }

    @AfterEach
    public void tearDown() {
        System.setOut(ancienneSortie);
        System.setIn(System.in);
    }

    @Test
    public void testConversionValide() {
        Application.main(new String[]{});
        assertThat(sortie.toString()).contains("Le chiffre romain est : V");
    }

    @Test
    public void testConversionInvalide() {
        System.setIn(entreeInvalide);
        Application.main(new String[]{});
        assertThat(sortie.toString()).contains("Le nombre doit être compris entre 1 et 3000");
    }
}
