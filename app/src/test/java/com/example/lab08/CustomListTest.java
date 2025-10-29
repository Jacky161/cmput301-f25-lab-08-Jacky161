package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");

        // Return false if city does not exist
        assertFalse(list.deleteCity(calgary));
        list.addCity(calgary);

        // Return true if city exists
        assertTrue(list.deleteCity(calgary));

        // Return false if city does not exist
        assertFalse(list.deleteCity(calgary));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");

        assertEquals(list.countCities(), 0);
        list.addCity(calgary);
        assertEquals(list.countCities(), 1);
        list.addCity(edmonton);
        assertEquals(list.countCities(), 2);
        list.deleteCity(edmonton);
        assertEquals(list.countCities(), 1);
        list.deleteCity(calgary);
        assertEquals(list.countCities(), 0);
    }
}
