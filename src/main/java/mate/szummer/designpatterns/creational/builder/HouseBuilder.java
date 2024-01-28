package mate.szummer.designpatterns.creational.builder;

import mate.szummer.designpatterns.creational.builder.model.House;
import mate.szummer.designpatterns.creational.builder.model.TypeOfMaterial;

public interface HouseBuilder {

    public void setWall(TypeOfMaterial typeOfMaterial);
    public void setDoor(TypeOfMaterial typeOfMaterial);
    public void setWindow(TypeOfMaterial typeOfMaterial);
    public void setNumberOfFloors(int numberOfFloors);

}
