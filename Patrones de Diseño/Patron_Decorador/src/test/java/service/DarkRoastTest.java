package service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DarkRoastTest {
    private DarkRoast darkRoast;

    @BeforeEach
    public void setUp() {
        darkRoast = new DarkRoast();
    }

    @Test
    public void testCost() {
        assertEquals(0.99f, darkRoast.cost());
    }

    @Test
    public void testDescription() {
        assertEquals("Dark Roast Coffee", darkRoast.getDescription());
    }
}
