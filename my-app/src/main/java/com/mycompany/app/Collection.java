package com.mycompany.app;

import java.util.ArrayList;
import java.util.ListIterator;

public class Collection {

    private ArrayList<String> collection = new ArrayList<String>();

    private ArrayList<String> perfect = new ArrayList<String>();

    public void trimToSize() {  // не понятно

        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");
        collection.add("bbb");
        collection.add("fff");

        collection.trimToSize();

        System.out.println(collection);

    }

    public void ensureCapacity() {  //не поятно

    }

    public void size() {

        collection.add("Германия");
        collection.add("Франция");
        collection.add("Великобритания");
        collection.add("Испания");
        collection.add("Италия");

        collection.size();

        System.out.print(collection.size());
    }

    public void isEmpty() {

        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");
        collection.add("bbb");
        collection.add("fff");

        collection.isEmpty();

        System.out.println(collection.isEmpty());
    }

    public void contains() {

        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");
        collection.add("bbb");
        collection.add("fff");

        collection.contains("mmm");

        System.out.println(collection.contains("mmm"));

    }

    public void indexOff() {

        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");
        collection.add("bbb");
        collection.add("fff");

        collection.indexOf("bbb");

        System.out.println(collection.indexOf("bbb"));

    }

    public void lastIndexOff() {

        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");
        collection.add("bbb");
        collection.add("fff");

        collection.lastIndexOf("bbb");

        System.out.println(collection.lastIndexOf("bbb"));

    }

    public void clones() {  // не понятно

    }

    public void toArray() {  // не понятно

    }

    public void toArrayT() {  // не понятно

    }

    public void get() {

        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");
        collection.add("bbb");
        collection.add("fff");

        collection.get(2);

        System.out.print(collection.get(2));
    }

    public void set() {

        collection.add("Германия");
        collection.add("Франция");
        collection.add("Великобритания");
        collection.add("Испания");

        collection.set(2, "Португалия");

        System.out.println(collection);
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

    public void removeRange() {  // отложить на потом

        collection.add("Германия");
        collection.add("Франция");
        collection.add("Великобритания");
        collection.add("Испания");
        collection.add("Италия");

        //((Collection)collection).removeRange(1, 2);

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

        collection.retainAll(collection);  // почему выделяет collectoon а perfect не выделяет?

        System.out.println(perfect);
    }

    public void listIteratorPosition() {  //не понятно

        collection.add("Германия");
        collection.add("Франция");
        collection.add("Португалия");
        collection.add("Великобритания");
        collection.add("Испания");
        collection.add("Италия");

        ListIterator<String> listIter = collection.listIterator();

        while(listIter.hasNext()){

            System.out.println(listIter.next());
        }
    }

    public void listIterator() {  // не понятно

    }

    public void iterator() {  // не понятно

    }

    public void subList() {

        collection.add("Германия");
        collection.add("Франция");
        collection.add("Португалия");
        collection.add("Великобритания");
        collection.add("Испания");
        collection.add("Италия");

        collection.subList(2, 4).clear();

        System.out.println(collection);
    }
}
