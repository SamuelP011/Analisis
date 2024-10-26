package service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EspressoTest {
    private Espresso espresso;

    @BeforeEach
    public void setUp() {
        espresso = new Espresso();
    }

    @Test
    public void testCost() {
        assertEquals(1.99f, espresso.cost());
    }

    @Test
    public void testDescription() {
        assertEquals("Espresso", espresso.getDescription());
    }
}
