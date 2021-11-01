package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @BeforeEach
    public void createList (){
        list = new CustomList(null, new ArrayList<>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(listSize +1, list.getCount());
    }

    @Test
    public void hasCityTest(){
        City harareCity = new City("Harare","Mashonaland");

        assertFalse(list.hasCity(harareCity));
        City city = new City("Calgary","Alberta");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void testDelete(){

        //Add to list

        City city = new City("Calgary","Alberta");
        list.addCity(city);


        //delete and check if deleted
        if (list.hasCity(city)){

            //Comment out this line to check exceptions
            list.deleteCity(city);
            assertFalse(list.hasCity(city));
        }

    }
}
