package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CondimentDecoratorTest {

    @Test
    public void testGetDescription() {
        CondimentDecorator condiment = new CondimentDecorator() {
            @Override
            public float cost() {
                return 0;
            }

            @Override
            public String getDescription() {
                return "Test Condiment";
            }
        };
        assertNotNull(condiment.getDescription());
    }
}
