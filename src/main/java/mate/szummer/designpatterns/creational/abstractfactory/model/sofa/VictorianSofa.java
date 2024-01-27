package mate.szummer.designpatterns.creational.abstractfactory.model.sofa;

public record VictorianSofa(String name) implements Sofa {

    @Override
    public String lieOn() {
        return "lying on " + name + " victorian sofa";
    }
}
