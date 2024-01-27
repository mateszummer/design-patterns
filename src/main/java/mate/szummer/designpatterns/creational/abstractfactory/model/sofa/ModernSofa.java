package mate.szummer.designpatterns.creational.abstractfactory.model.sofa;

public record ModernSofa(String name) implements Sofa {

    @Override
    public String lieOn() {
        return "lying on " + name + " modern sofa";
    }
}
