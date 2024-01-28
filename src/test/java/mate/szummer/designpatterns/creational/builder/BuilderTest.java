package mate.szummer.designpatterns.creational.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BuilderTest {

    @Test
    public void buildCastleTest() {
        var director = new HouseBuilderDirector();
        var houseBuildingBuilder = new HouseBuildingBuilder();
        director.buildCastle(houseBuildingBuilder);
        var house = houseBuildingBuilder.getProduct();
        var housePricingBuilder = new HousePricingBuilder();
        director.buildCastle(housePricingBuilder);
        var housePrice = housePricingBuilder.getProduct();
        Assertions.assertEquals("GLASS", house.getWindow().name());
        Assertions.assertEquals("STONE", house.getWall().name());
        Assertions.assertEquals("METAL", house.getDoor().name());
        Assertions.assertEquals(3, house.getNumberOfFloors());
        Assertions.assertEquals(55, housePrice.getWindowPrice());
        Assertions.assertEquals(30, housePrice.getWallPrice());
        Assertions.assertEquals(100, housePrice.getDoorPrice());
        Assertions.assertEquals(300, housePrice.getFloorPrice());
    }

    @Test
    public void buildWoodenHouseTest() {
        var director = new HouseBuilderDirector();
        var houseBuildingBuilder = new HouseBuildingBuilder();
        director.buildWoodenHouse(houseBuildingBuilder);
        var house = houseBuildingBuilder.getProduct();
        var housePricingBuilder = new HousePricingBuilder();
        director.buildWoodenHouse(housePricingBuilder);
        var housePrice = housePricingBuilder.getProduct();
        Assertions.assertEquals("GLASS", house.getWindow().name());
        Assertions.assertEquals("WOOD", house.getWall().name());
        Assertions.assertEquals("WOOD", house.getDoor().name());
        Assertions.assertEquals(1, house.getNumberOfFloors());
        Assertions.assertEquals(55, housePrice.getWindowPrice());
        Assertions.assertEquals(15, housePrice.getWallPrice());
        Assertions.assertEquals(15, housePrice.getDoorPrice());
        Assertions.assertEquals(100, housePrice.getFloorPrice());
    }
}
