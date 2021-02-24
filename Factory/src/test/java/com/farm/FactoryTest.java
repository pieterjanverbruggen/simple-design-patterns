package com.farm;

import com.farm.animals.Animal;
import com.farm.factory.AnimalFactory;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    @Test
    void testShorthairs() throws Exception {
        Animal b_cat = AnimalFactory.createAnimal( "British Shorthair");
        assert(b_cat.kind.equals("Cat"));
        Animal a_cat = AnimalFactory.createAnimal( "American Shorthair");
        assert(a_cat.kind.equals("Cat"));
    }

    @Test
    void testBeagle() throws Exception {
        Animal dog = AnimalFactory.createAnimal( "Beagle");
        assert(dog.kind.equals("Dog"));
    }
}
