package mate.szummer.designpatterns.structural.adapter.model;

public class ProductAdapter extends PackagedProduct {

    private Product product;

    public ProductAdapter(Product product) {
        this.product = product;
    }

    public PackagedProduct pack() {
        setName(product.name());
        setWeight(product.name().length());
        return this;
    }
}
