package mate.szummer.designpatterns.creational.builder;

import mate.szummer.designpatterns.creational.builder.model.*;

public class HouseBuildingBuilder implements HouseBuilder{

        private House house;

        public HouseBuildingBuilder(){
            this.house = new House();
        }

        @Override
        public void setWindow(TypeOfMaterial typeOfMaterial){
            house.setWindow(new HouseWindow(typeOfMaterial.toString()));
        }

        @Override
        public void setWall(TypeOfMaterial typeOfMaterial){
            house.setWall(new HouseWall(typeOfMaterial.toString()));
        }

        @Override
        public void setDoor(TypeOfMaterial typeOfMaterial){
            house.setDoor(new HouseDoor(typeOfMaterial.toString()));
        }

        @Override
        public void setNumberOfFloors(int numberOfFloors){
            house.setNumberOfFloors(numberOfFloors);
        }

        public House getProduct(){
            var house = this.house;
            this.house = new House();
            return house;
        }
}
