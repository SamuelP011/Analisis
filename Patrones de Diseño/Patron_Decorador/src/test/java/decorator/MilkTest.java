package decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.Espresso;
import service.Beverage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MilkTest {
    private Beverage beverage;

    @BeforeEach
    public void setUp() {
        beverage = new Milk(new Espresso());
    }

    @Test
    public void testCost() {
        assertEquals(2.29f, beverage.cost());
    }

    @Test
    public void testDescription() {
        assertEquals("Espresso, Milk", beverage.getDescription());
    }
}
