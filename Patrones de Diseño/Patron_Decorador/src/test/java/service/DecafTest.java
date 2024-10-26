package service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecafTest {
    private Decaf decaf;

    @BeforeEach
    public void setUp() {
        decaf = new Decaf();
    }

    @Test
    public void testCost() {
        assertEquals(1.05f, decaf.cost());
    }

    @Test
    public void testDescription() {
        assertEquals("Decaf Coffee", decaf.getDescription());
    }
}
