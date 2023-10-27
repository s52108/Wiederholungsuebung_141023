package Uebung_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutoTest {
    @Test
    public void testAuto() {
        Auto auto = new Auto("BMW", "M3", 2020);

        // Teste die start() Methode
        auto.start();
        assertTrue(auto.getMotorStatus(), "Das Auto sollte gestartet sein.");

        // Teste die stop() Methode
        auto.stop();
        assertFalse(auto.getMotorStatus(), "Das Auto sollte gestoppt sein.");
    }
}

