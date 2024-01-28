package mate.szummer.designpatterns.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SingletonTest {

    @Test
    public void testSingleton() {
        var singleton1 = Singleton.getInstance();
        singleton1.setMyNumber(22);
        var singleton2 = Singleton.getInstance();
        Assertions.assertEquals(22, singleton2.getMyNumber());
        Assertions.assertEquals(singleton1, singleton2);
    }
}
