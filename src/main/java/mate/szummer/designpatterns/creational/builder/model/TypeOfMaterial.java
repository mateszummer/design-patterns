package mate.szummer.designpatterns.creational.builder.model;

public enum TypeOfMaterial {
    WOOD(15),
    STONE(30),
    GLASS(55),
    METAL(100);

    private final int price;

    TypeOfMaterial(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
