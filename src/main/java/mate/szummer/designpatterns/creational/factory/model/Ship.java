package mate.szummer.designpatterns.creational.factory.model;

public record Ship(String name) implements Transporter {
    @Override
    public String transport() {
        return name + " is delivering by sea";
    }
}
