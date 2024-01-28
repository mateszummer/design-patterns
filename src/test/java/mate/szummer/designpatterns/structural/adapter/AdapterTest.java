package mate.szummer.designpatterns.structural.adapter;

import mate.szummer.designpatterns.structural.adapter.model.Product;
import mate.szummer.designpatterns.structural.adapter.model.ProductAdapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdapterTest {

    @Test
    public void testAdapter() {
        var postOffice = new PostOffice();
        var product = new Product("p1");
        var adapter = new ProductAdapter(product);
        var result = postOffice.sendPackage(adapter.pack());
        Assertions.assertEquals("Sending package: PackagedProduct{name='p1', weight=2}", result);
    }
}
