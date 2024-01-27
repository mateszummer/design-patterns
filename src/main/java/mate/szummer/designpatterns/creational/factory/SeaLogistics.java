package mate.szummer.designpatterns.creational.factory;

import mate.szummer.designpatterns.creational.factory.model.Ship;
import mate.szummer.designpatterns.creational.factory.model.Transporter;

public class SeaLogistics extends Logistics{
    @Override
    protected Transporter createTransporter(String name) {
        return new Ship(name);
    }
}
