package service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseBlendTest {
    private HouseBlend houseBlend;

    @BeforeEach
    public void setUp() {
        houseBlend = new HouseBlend();
    }

    @Test
    public void testCost() {
        assertEquals(0.89f, houseBlend.cost());
    }

    @Test
    public void testDescription() {
        assertEquals("House Blend Coffee", houseBlend.getDescription());
    }
}
