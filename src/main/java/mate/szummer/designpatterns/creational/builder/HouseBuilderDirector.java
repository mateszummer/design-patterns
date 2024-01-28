package mate.szummer.designpatterns.creational.builder;

import mate.szummer.designpatterns.creational.builder.model.TypeOfMaterial;

public class HouseBuilderDirector {

    public void buildCastle(HouseBuilder builder) {
        builder.setWindow(TypeOfMaterial.GLASS);
        builder.setWall(TypeOfMaterial.STONE);
        builder.setDoor(TypeOfMaterial.METAL);
        builder.setNumberOfFloors(3);
    }

    public void buildWoodenHouse(HouseBuilder builder) {
        builder.setWindow(TypeOfMaterial.GLASS);
        builder.setWall(TypeOfMaterial.WOOD);
        builder.setDoor(TypeOfMaterial.WOOD);
        builder.setNumberOfFloors(1);
    }
}
