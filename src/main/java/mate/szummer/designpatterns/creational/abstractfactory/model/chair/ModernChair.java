package mate.szummer.designpatterns.creational.abstractfactory.model.chair;

public record ModernChair(String name) implements Chair {

    @Override
    public String sitOn() {
        return "sitting on " + name + " modern chair";
    }
}
