package com.mycompany.app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by pbahher on 12/8/16.
 */
public class MyCollelectionTest {

    //написать 50 тестов на методы коллекции ArrayList
    private static ArrayList<String> collection = new ArrayList<String>();

    @Before
    public void beforeTest() {

    }

    @After
    public void afterTest() {
        collection.clear();
    }

    @Test
    public void addTest() {
        collection.add("sss");
        assertEquals(1, collection.size());
    }

    @Test
    public void getTest2() {
        collection.add("sss");
        collection.add("ccc");
        assertEquals("sss", collection.get(0));
        assertEquals("ccc", collection.get(1));
    }

    @Test
    public void addAllTest1() {
        ArrayList elements = new ArrayList();
        elements.add("a");
        elements.add("b");
        elements.add("c");
        elements.add("d");
        elements.add("e");

        collection.addAll(elements);
        assertEquals(5, collection.size());
    }

    @Test
    public void addAllTest2() {
        collection.add("sss");

        ArrayList elements = new ArrayList();
        elements.add("a");
        elements.add("b");
        elements.add("c");
        elements.add("d");
        elements.add("e");

        collection.addAll(elements);
        assertEquals(6, collection.size());
    }

    @Test
    public void addAllTest3() {
        collection.add("sss");

        ArrayList elements = new ArrayList();
        elements.add("a");
        elements.add("b");
        elements.add("c");
        elements.add("d");
        elements.add("e");

        collection.addAll(elements);
        assertEquals(true, collection.contains("d"));
    }

    @Test
    public void containsTest() {
        collection.add("d");

        assertEquals(true, collection.contains("d"));
    }

    @Test
    public void containsAllTest() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");

        ArrayList elements = new ArrayList();
        elements.add("a");
        elements.add("b");
        elements.add("c");
        elements.add("d");
        elements.add("e");

        assertEquals(true, collection.containsAll(elements));
    }

    @Test
    public void clearTest() {
        collection.add("sss");
        collection.clear();

        assertEquals(0, collection.size());
    }

    @Test
    public void retainAllTest() {
        collection.add("sss");

        ArrayList<String> copy = new ArrayList<String>();
        copy.add("sss");

        assertFalse(collection.retainAll(copy));
    }

    @Test
    public void subListTest() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");
        collection.add("f");

        ArrayList elements = new ArrayList();
        elements.add("b");
        elements.add("c");

        assertEquals(elements, collection.subList(1, 3));
    }

    @Test
    public void lastIndexOfTest() {
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("1");
        collection.add("5");
        collection.add("1");

        int index = collection.lastIndexOf("1");

        assertEquals(5, index);
    }

    @Test
    public void cloneTest() {
        assertEquals(collection, collection.clone());
    }

    @Test
    public void setTest() {
        collection.add("a");
        collection.add("b");

        collection.set(1, "a");
        collection.set(0, "b");

        assertEquals("a", collection.get(1));
        assertEquals("b", collection.get(0));
    }

    @Test
    public void sizeTest() {
        collection.add("a");
        collection.add("b");
        collection.add("c");

        assertEquals(3, collection.size());
    }

    @Test
    public void removeTest() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");

        assertEquals("c", collection.remove(2));
        assertEquals(3, collection.size());
    }

    @Test
    public void removeObjTest() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");

        assertEquals(true, collection.remove("c"));
        assertEquals(3, collection.size());
    }

    @Test
    public void removeAllTest() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");

        List<String> remove = new ArrayList();
        remove.add("a");
        remove.add("b");
        remove.add("c");
        remove.add("d");

        assertEquals(true, collection.removeAll(remove));
        assertEquals(1, collection.size());
    }

    @Test
    public void isEmptyTest() {
        assertEquals(true, collection.isEmpty());
    }

    @Test
    public void toArrayTest() {
        collection.add("a");
        collection.add("b");
        collection.add("c");

        String [] elements = collection.toArray(new String[collection.size()]);

        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }

        assertEquals(3, elements.length);
    }

    @Test
    public void trimToSizeTest() {    //todo recheck
        ArrayList<String> lll = new ArrayList<String>(100);

        lll.add("a");
        lll.add("b");
        lll.add("c");
        lll.add("d");
        lll.trimToSize();

        assertEquals(4, collection.size());
    }

    @Test
    public void indexOf() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");

        assertEquals(2, collection.indexOf("c"));
    }

    @Test
    public void ensureCapacityTest() {
        ArrayList elements = new ArrayList(2);
        elements.add("a");
        elements.add("b");
        elements.add("c");
        elements.add("d");
        elements.ensureCapacity(2);

        assertEquals(4, elements.size());
    }

    @Test
    public void iteratorTest() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");
        collection.add("f");
        collection.add("g");

        Iterator<String> iterator = collection.iterator();

        assertEquals("a", iterator.next());
        assertEquals("b", iterator.next());
        assertEquals("c", iterator.next());
    }

}
