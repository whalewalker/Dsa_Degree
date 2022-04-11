package com.algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomSetWithListTest {

    CustomSetWithList customSetWithList;

    @BeforeEach
    void setup(){
        customSetWithList = new CustomSetWithList();
    }

    @Test
    void canAddElementToSet(){
        customSetWithList.add(3);
        assertEquals(customSetWithList.getContainer().size(), 1);
        assertEquals(customSetWithList.getContainer().get(0), 3);
    }

    @Test
    void canCheckIfElementAlreadyExistInSet(){
       boolean isValid_1 = customSetWithList.exists(3);
        assertFalse(isValid_1);

        customSetWithList.add(3);
        boolean isValid_2 = customSetWithList.exists(3);
        assertTrue(isValid_2);
    }

    @Test
    void canRemoveElementFromSet(){
        customSetWithList.add(3);
        assertEquals(customSetWithList.getContainer().size(), 1);
        assertEquals(customSetWithList.getContainer().get(0), 3);

        customSetWithList.remove(3);
        assertEquals(customSetWithList.getContainer().size(), 0);
    }

    @Test
    void canNotAddElementThatAlreadyExist(){
        customSetWithList.add(3);
        assertEquals(customSetWithList.getContainer().size(), 1);
        assertEquals(customSetWithList.getContainer().get(0), 3);

        customSetWithList.add(3);
        assertEquals(customSetWithList.getContainer().size(), 1);
        assertEquals(customSetWithList.getContainer().get(0), 3);
    }


}