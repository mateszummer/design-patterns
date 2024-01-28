package mate.szummer.designpatterns.creational.builder.model;

import java.util.Objects;

public class HousePricing {

    private int windowPrice;
    private int doorPrice;
    private int wallPrice;
    private int floorPrice;

    public int getWindowPrice() {
        return windowPrice;
    }

    public void setWindowPrice(int windowPrice) {
        this.windowPrice = windowPrice;
    }

    public int getDoorPrice() {
        return doorPrice;
    }

    public void setDoorPrice(int doorPrice) {
        this.doorPrice = doorPrice;
    }

    public int getWallPrice() {
        return wallPrice;
    }

    public void setWallPrice(int wallPrice) {
        this.wallPrice = wallPrice;
    }

    public int getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(int floorPrice) {
        this.floorPrice = floorPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HousePricing that = (HousePricing) o;
        return windowPrice == that.windowPrice && doorPrice == that.doorPrice && wallPrice == that.wallPrice && floorPrice == that.floorPrice;
    }

    @Override
    public int hashCode() {
        return Objects.hash(windowPrice, doorPrice, wallPrice, floorPrice);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HousePricing{");
        sb.append("windowPrice=").append(windowPrice);
        sb.append(", doorPrice=").append(doorPrice);
        sb.append(", wallPrice=").append(wallPrice);
        sb.append(", floorPrice=").append(floorPrice);
        sb.append('}');
        return sb.toString();
    }
}
