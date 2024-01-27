package mate.szummer.designpatterns.creational.abstractfactory.model.chair;

public record VictorianChair(String name) implements Chair {

    @Override
    public String sitOn() {
        return "sitting on " + name + " victorian chair";
    }
}
