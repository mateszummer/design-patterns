package mate.szummer.designpatterns.creational.prototype;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Objects;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.height = rectangle.height;
        this.width = rectangle.width;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
