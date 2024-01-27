package mate.szummer.designpatterns.creational.abstractfactory.model.coffetable;

public record ModernCoffeeTable(String name) implements CoffeeTable {

        @Override
        public String drinkCoffee() {
            return "drinking coffee at " + name + " modern coffee table";
        }
}
