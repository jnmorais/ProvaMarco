package ProvaMarco;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EscolaTest {

    Escola escola = new Escola();

    @Test
    void testReprovado() {
        assertEquals("Reprovado", escola.Vernota(3));
    }

    @Test
    void testRecuperacao() {
        assertEquals("Em recuperação", escola.Vernota(5));
    }

    @Test
    void testPassou() {
        assertEquals("Passou de ano", escola.Vernota(6));
    }

    @Test
    void testNotaInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            escola.Vernota(-1);
        });
    }
}
