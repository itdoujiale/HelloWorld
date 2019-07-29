package doannotation;

import ao.Fruit;
import factory.AppleListFactory;
import org.junit.Test;

import java.util.List;

public class DoAnnotationTest {

    @Test
    public void testAnnotation() {
        User user = UserFactory.create();
        System.out.println(user);

    }
}
