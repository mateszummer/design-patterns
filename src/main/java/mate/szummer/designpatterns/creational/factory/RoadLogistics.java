package mate.szummer.designpatterns.creational.factory;

import mate.szummer.designpatterns.creational.factory.model.Transporter;
import mate.szummer.designpatterns.creational.factory.model.Truck;

public class RoadLogistics extends Logistics {
    @Override
    protected Transporter createTransporter(String name) {
        return new Truck(name);
    }
}
