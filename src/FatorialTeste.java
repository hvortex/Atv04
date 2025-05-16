import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FatorialTeste {

    @Test
    public void testFatorialDeZero() {
        assertEquals(1, Fatorial.calcular(0));
    }

    @Test
    public void testFatorialDeUm() {
        assertEquals(1, Fatorial.calcular(1));
    }

    @Test
    public void testFatorialDeCinco() {
        assertEquals(120, Fatorial.calcular(5));
    }

    @Test
    public void testFatorialDeDez() {
        assertEquals(3628800, Fatorial.calcular(10));
    }

    @Test
    public void testFatorialNumeroNegativo() {
        Exception excecao = assertThrows(IllegalArgumentException.class, () -> {
            Fatorial.calcular(-3);
        });
        assertEquals("Número não pode ser negativo.", excecao.getMessage());
    }
}