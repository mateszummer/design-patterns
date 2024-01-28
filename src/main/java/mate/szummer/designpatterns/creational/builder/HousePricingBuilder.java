package mate.szummer.designpatterns.creational.builder;


import mate.szummer.designpatterns.creational.builder.model.*;

public class HousePricingBuilder implements HouseBuilder{

    private HousePricing housePricing;

    public HousePricingBuilder(){
        this.housePricing = new HousePricing();
    }

    @Override
    public void setWindow(TypeOfMaterial typeOfMaterial){
        this.housePricing.setWindowPrice((typeOfMaterial.getPrice()));
    }

    @Override
    public void setWall(TypeOfMaterial typeOfMaterial){
        this.housePricing.setWallPrice((typeOfMaterial.getPrice()));
    }

    @Override
    public void setDoor(TypeOfMaterial typeOfMaterial){
        this.housePricing.setDoorPrice((typeOfMaterial.getPrice()));
    }

    @Override
    public void setNumberOfFloors(int numberOfFloors){
        this.housePricing.setFloorPrice(numberOfFloors * 100);
    }

    public HousePricing getProduct(){
        var pricing = this.housePricing;
        this.housePricing = new HousePricing();
        return pricing;
    }
}
