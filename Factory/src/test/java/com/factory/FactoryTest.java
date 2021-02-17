package com.factory;

import com.factory.animals.Animal;
import com.factory.solution.AnimalFactory;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    @Test
    void testShorthairs() throws Exception {
        Animal b_cat = AnimalFactory.getInstance().createAnimal( "British Shorthair");
        assert(b_cat.kind.equals("Cat"));
        Animal a_cat = AnimalFactory.getInstance().createAnimal( "American Shorthair");
        assert(a_cat.kind.equals("Cat"));
    }

    @Test
    void testBeage() throws Exception {
        Animal dog = AnimalFactory.getInstance().createAnimal( "Beagle");
        assert(dog.kind.equals("Dog"));
    }
}
