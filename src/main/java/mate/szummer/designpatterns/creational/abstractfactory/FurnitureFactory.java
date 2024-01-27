package mate.szummer.designpatterns.creational.abstractfactory;

import mate.szummer.designpatterns.creational.abstractfactory.model.chair.Chair;
import mate.szummer.designpatterns.creational.abstractfactory.model.coffetable.CoffeeTable;
import mate.szummer.designpatterns.creational.abstractfactory.model.sofa.Sofa;

public interface FurnitureFactory {
    public Chair createChair(String name);
    public Sofa createSofa(String name);
    public CoffeeTable createCoffeeTable(String name);
}
