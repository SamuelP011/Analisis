package Patron;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
    private final List<Object> items;

    public ConcreteAggregate() {
        this.items = new ArrayList<>();
    }

    public void addItem(Object item) {
        items.add(item);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(items);
    }
}