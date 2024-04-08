import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParImparTest {

    @Test
    void getResult() {
        assertEquals(0, ParImpar.getResult(0, 30, 7));
    }
}