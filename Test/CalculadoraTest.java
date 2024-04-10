import ana.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void suma() {
        assertEquals(50, Calculadora.suma(20, 30));
    }

    @Test
    void resta() {
        assertEquals(10, Calculadora.resta(30, 20));
    }

    @Test
    void producto() {
        assertEquals(50, Calculadora.producto(5, 10));
    }

    @Test
    void division() {
        assertEquals(10, Calculadora.division(20, 2));
    }
}