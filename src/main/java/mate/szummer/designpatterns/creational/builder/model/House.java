package mate.szummer.designpatterns.creational.builder.model;

import java.util.Objects;

public class House {
    private HouseWindow window;
    private HouseWall wall;
    private HouseDoor door;
    private Integer numberOfFloors;

    public HouseWindow getWindow() {
        return window;
    }

    public HouseWall getWall() {
        return wall;
    }

    public HouseDoor getDoor() {
        return door;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setWindow(HouseWindow window) {
        this.window = window;
    }

    public void setWall(HouseWall wall) {
        this.wall = wall;
    }

    public void setDoor(HouseDoor door) {
        this.door = door;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(window, house.window) &&
                Objects.equals(wall, house.wall) &&
                Objects.equals(door, house.door) &&
                Objects.equals(numberOfFloors, house.numberOfFloors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(window, wall, door, numberOfFloors);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("House{");
        sb.append("window=").append(window);
        sb.append(", wall=").append(wall);
        sb.append(", door=").append(door);
        sb.append(", numberOfFloors=").append(numberOfFloors);
        sb.append('}');
        return sb.toString();
    }
}
