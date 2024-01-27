package mate.szummer.designpatterns.creational.factory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FactoryTest {

    @Test
    public void deliverByTruck() {
        // Given
        Logistics logistics = new RoadLogistics();
        // When
        String delivery = logistics.planDelivery("Truck - 1");
        // Then
        Assertions.assertThat(delivery).isEqualTo("Truck - 1 is delivering by road");
    }

    @Test
    public void deliverByShip() {
        // Given
        Logistics logistics = new SeaLogistics();
        // When
        String delivery = logistics.planDelivery("Ship - 1");
        // Then
        Assertions.assertThat(delivery).isEqualTo("Ship - 1 is delivering by sea");
    }
}
