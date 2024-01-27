package mate.szummer.designpatterns.creational.abstractfactory;

import mate.szummer.designpatterns.creational.abstractfactory.model.chair.Chair;
import mate.szummer.designpatterns.creational.abstractfactory.model.chair.ModernChair;
import mate.szummer.designpatterns.creational.abstractfactory.model.coffetable.CoffeeTable;
import mate.szummer.designpatterns.creational.abstractfactory.model.coffetable.ModernCoffeeTable;
import mate.szummer.designpatterns.creational.abstractfactory.model.sofa.ModernSofa;
import mate.szummer.designpatterns.creational.abstractfactory.model.sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory{

        @Override
        public Chair createChair(String name) {
            return new ModernChair(name);
        }

        @Override
        public CoffeeTable createCoffeeTable(String name) {
            return new ModernCoffeeTable(name);
        }

        @Override
        public Sofa createSofa(String name) {
            return new ModernSofa(name);
        }
}
