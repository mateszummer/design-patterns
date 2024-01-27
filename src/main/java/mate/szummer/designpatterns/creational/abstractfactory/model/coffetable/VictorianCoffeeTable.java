package mate.szummer.designpatterns.creational.abstractfactory.model.coffetable;

public record VictorianCoffeeTable(String name) implements CoffeeTable {

        @Override
        public String drinkCoffee() {
            return "drinking coffee at " + name + " victorian coffee table";
        }
}
