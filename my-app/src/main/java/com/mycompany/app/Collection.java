package com.mycompany.app;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {

    private ArrayList<String> collection = new ArrayList<String>();

    private ArrayList<String> perfect = new ArrayList<String>();

    public void trimToSize() {

    }

    public void ensureCapacity() {

    }

    public void size() {

    }

    public void isEmpty() {

    }

    public void contains() {

    }

    public void indexOff() {

    }

    public void lastIndexOff() {

    }

    public void clones() {

    }

    public void toArray() {

    }

    public void toArrayT() {

    }

    public void get() {

    }

    public void set() {

    }

    public void add() {
        
        collection.add("Германия");
        collection.add("Франция");
        collection.add("Великобритания");
        collection.add("Испания");

        System.out.println(collection);
    }

    public void addPosition() {

        collection.add("Германия");
        collection.add("Франция");
        collection.add("Великобритания");
        collection.add("Испания");
        collection.add(1, "Италия");

        System.out.println(collection.get(1));
    }

    public void removePosition() {

        collection.add("Германия");
        collection.add("Франция");
        collection.add("Великобритания");
        collection.add("Испания");
        collection.add("Италия");

        collection.remove(collection.get(2));

        System.out.println(collection);
    }

    public void remove() {

        collection.add("Германия");
        collection.add("Франция");
        collection.add("Великобритания");
        collection.add("Испания");
        collection.add("Италия");

        collection.remove("Италия");

        System.out.println(collection);
    }

    public void clear() {

        collection.add("Германия");
        collection.add("Франция");
        collection.add("Великобритания");
        collection.add("Испания");
        collection.add("Италия");

        collection.clear();

        System.out.println(collection);
    }

    public void addAll() {

        collection.add("Германия");
        collection.add("Франция");
        collection.add("Великобритания");
        perfect.add("Испания");
        perfect.add("Италия");

        collection.addAll(perfect);

        System.out.println(collection);

    }

    public void addAllPosition() {

        collection.add("Германия");
        collection.add("Франция");
        collection.add("Великобритания");
        perfect.add("Испания");
        perfect.add("Италия");

        collection.addAll(2,perfect);

        System.out.println(collection);
    }

    public void removeRange() {

        collection.add("Германия");
        collection.add("Франция");
        collection.add("Великобритания");
        collection.add("Испания");
        collection.add("Италия");

        //collection.removeAll(1, 3);  //как задать промежуток?

        System.out.println(collection);
    }

    public void removeAll() {

        collection.add("Германия");
        collection.add("Франция");
        perfect.add("Великобритания");
        collection.add("Испания");
        perfect.add("Италия");

        collection.removeAll(perfect);

        System.out.println(collection);
    }

    public void retainAll() {

        collection.add("Германия");
        perfect.add("Франция");
        perfect.add("Великобритания");
        collection.add("Испания");
        perfect.add("Италия");

        collection.retainAll(collection);

        System.out.println(perfect);
    }

    public void listIteratorPosition() {

    }

    public void listIterator() {

    }

    public void iterator() {

    }

    public void subList() {

    }
}
