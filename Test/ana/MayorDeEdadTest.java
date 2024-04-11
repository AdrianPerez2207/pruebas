package ana;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MayorDeEdadTest {

    @Test
    void esMayorDeEdad18() throws Exception {
        assertTrue(MayorDeEdad.esMayorDeEdad(18));
    }
    @Test
    void esMayorDeEdadFalso() {
        try {
            assertFalse(MayorDeEdad.esMayorDeEdad(17));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void esMayorDeEdad100() throws Exception {
        assertTrue(MayorDeEdad.esMayorDeEdad(100));
    }
    @Test
    void esMayorDeEdadNegativo() {
        boolean error = false;
        try {
            assertFalse(MayorDeEdad.esMayorDeEdad(-20));
        } catch (Exception e) {
            error = true;
            System.out.println(e.getMessage());
        }
        assertTrue(error);
    }
    @Test
    void esMayorDeEdad0() {
        try {
            assertFalse(MayorDeEdad.esMayorDeEdad(0));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}