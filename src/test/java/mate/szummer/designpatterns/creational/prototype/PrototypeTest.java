package mate.szummer.designpatterns.creational.prototype;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PrototypeTest {

    @Test
    public void cloneRectangleTest() {
        var rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        var rectangleClone = rectangle.clone();
        Assertions.assertThat(rectangle).isEqualTo(rectangleClone);
    }

    @Test
    public void cloneCircleTest() {
        var circle = new Circle();
        circle.setRadius(10);
        var circleClone = circle.clone();
        Assertions.assertThat(circle).isEqualTo(circleClone);
    }
}
