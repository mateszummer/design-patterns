package mate.szummer.designpatterns.creational.abstractfactory;

import mate.szummer.designpatterns.creational.abstractfactory.model.chair.Chair;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AbstractFactoryTest {

    @Test
    public void createModernChairTest() {
        // Given
        FurnitureFactory furnitureFactory = new ModernFurnitureFactory();
        var name = "modern-chair-1";
        // When
        Chair chair = furnitureFactory.createChair(name);
        // Then
        Assertions.assertThat(chair.sitOn()).isEqualTo("sitting on " + name + " modern chair");
    }

    @Test
    public void createVictorianChairTest() {
        // Given
        FurnitureFactory furnitureFactory = new VictorianFurnitureFactory();
        var name = "victorian-chair-1";
        // When
        Chair chair = furnitureFactory.createChair(name);
        // Then
        Assertions.assertThat(chair.sitOn()).isEqualTo("sitting on " + name + " victorian chair");
    }

    @Test
    public void createModernSofaTest() {
        // Given
        FurnitureFactory furnitureFactory = new ModernFurnitureFactory();
        var name = "modern-sofa-1";
        // When
        var sofa = furnitureFactory.createSofa(name);
        // Then
        Assertions.assertThat(sofa.lieOn()).isEqualTo("lying on " + name + " modern sofa");
    }

    @Test
    public void createVictorianSofaTest() {
        // Given
        FurnitureFactory furnitureFactory = new VictorianFurnitureFactory();
        var name = "victorian-sofa-1";
        // When
        var sofa = furnitureFactory.createSofa(name);
        // Then
        Assertions.assertThat(sofa.lieOn()).isEqualTo("lying on " + name + " victorian sofa");
    }

    @Test
    public void createModernCoffeeTableTest() {
        // Given
        FurnitureFactory furnitureFactory = new ModernFurnitureFactory();
        var name = "modern-coffee-table-1";
        // When
        var coffeeTable = furnitureFactory.createCoffeeTable(name);
        // Then
        Assertions.assertThat(coffeeTable.drinkCoffee())
                .isEqualTo("drinking coffee at " + name + " modern coffee table");
    }

    @Test
    public void createVictorianCoffeeTableTest() {
        // Given
        FurnitureFactory furnitureFactory = new VictorianFurnitureFactory();
        var name = "victorian-coffee-table-1";
        // When
        var coffeeTable = furnitureFactory.createCoffeeTable(name);
        // Then
        Assertions.assertThat(coffeeTable.drinkCoffee())
                .isEqualTo("drinking coffee at " + name + " victorian coffee table");
    }
}
