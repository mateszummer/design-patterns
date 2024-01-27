package mate.szummer.designpatterns.creational.abstractfactory;

import mate.szummer.designpatterns.creational.abstractfactory.model.chair.VictorianChair;
import mate.szummer.designpatterns.creational.abstractfactory.model.coffetable.VictorianCoffeeTable;
import mate.szummer.designpatterns.creational.abstractfactory.model.sofa.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory{

    @Override
    public VictorianSofa createSofa(String name) {
        return new VictorianSofa(name);
    }

    @Override
    public VictorianCoffeeTable createCoffeeTable(String name) {
        return new VictorianCoffeeTable(name);
    }

    @Override
    public VictorianChair createChair(String name) {
        return new VictorianChair(name);
    }
}
