package decorator;

import service.Beverage;

public class Milk extends CondimentDecorator {
    private final Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return 0.30f + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
