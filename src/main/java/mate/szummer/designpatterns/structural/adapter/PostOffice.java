package mate.szummer.designpatterns.structural.adapter;

import mate.szummer.designpatterns.structural.adapter.model.PackagedProduct;

public class PostOffice {

    public String sendPackage(PackagedProduct packagedProduct){
        return "Sending package: " + packagedProduct;
    }
}
