package service;

import lombok.Getter;

public abstract class Beverage {
    @Getter
    protected String description = "Unknown Beverage";

    public abstract float cost();

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return getDescription() + " $" + cost();
    }
}
