package decorator;

import service.Beverage;

public class Soy extends CondimentDecorator {
    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return 0.15f + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
