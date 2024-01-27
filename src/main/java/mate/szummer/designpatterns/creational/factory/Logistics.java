package mate.szummer.designpatterns.creational.factory;

import mate.szummer.designpatterns.creational.factory.model.Transporter;

public abstract class Logistics {

    protected abstract Transporter createTransporter(String name);

    public String planDelivery(String name) {
        Transporter transporter = createTransporter(name);
        return transporter.transport();
    }
}
