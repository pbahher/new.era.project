package com.mycompany.app;

import org.junit.Test;

public class CollectionTest {

    static Collection collection = new Collection();

    @Test
    public void trimToSize() {
        collection.trimToSize();
    }

    @Test
    public void ensureCapacity() {
        collection.ensureCapacity();
    }

    @Test
    public void size() {
        collection.size();
    }

    @Test
    public void isEmpty() {
        collection.isEmpty();
    }

    @Test
    public void contains() {
        collection.contains();
    }

    @Test
    public void indexOff() {
        collection.indexOff();
    }

    @Test
    public void lastIndexOff() {
        collection.lastIndexOff();
    }

    @Test
    public void clones() {
        collection.clones();
    }

    @Test
    public void toArray() {
        collection.toArray();
    }

    @Test
    public void toArrayT() {
        collection.toArrayT();
    }

    @Test
    public void get() {
        collection.get();
    }

    @Test
    public void set() {
        collection.set();
    }

    @Test
    public void add() {
        collection.add();
    }

    @Test
    public void addPosition() {
        collection.addPosition();
    }

    @Test
    public void removePosition() {
        collection.removePosition();
    }

    @Test
    public void remove() {
        collection.remove();
    }

    @Test
    public void clear() {
        collection.clear();
    }

    @Test
    public void addAll() {
        collection.addAll();
    }

    @Test
    public void addAllPosition() {
        collection.addAllPosition();
    }

    @Test
    public void removeRange() {
        collection.removeRange();
    }

    @Test
    public void removeAll() {
        collection.removeAll();
    }

    @Test
    public void retainAll() {
        collection.retainAll();
    }

    @Test
    public void listIteratorPosition() {
        collection.listIteratorPosition();
    }

    @Test
    public void listIterator() {
        collection.listIterator();
    }

    @Test
    public void iterator() {
        collection.iterator();
    }

    @Test
    public void subList() {
        collection.subList();
    }
}
