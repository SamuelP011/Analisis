package decorator;

import service.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
