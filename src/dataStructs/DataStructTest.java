package dataStructs;

import java.util.*;

public class DataStructTest {
    static void hashMap() {
        Map<Person, Integer> map = new HashMap<>();
        map.put(new Person("Oleg"), 0);
        map.put(new Person("Alex1"), 5);
        for(Map.Entry<Person, Integer> set: map.entrySet()) {
            System.out.println("Key: " + set.getKey() + ", Value: " + set.getValue());
        }
    }
    static void linkedHashMap() {
        Map<Person, Integer> map = new LinkedHashMap<>();
        map.put(new Person("Oleg"), 0);
        map.put(new Person("Alex1"), 5);
        System.out.println(map);
    }
    static void treeMap() {
        Map<Person, Integer> map = new TreeMap<>();
        map.put(new Person("Oleg"), 0);
        map.put(new Person("Alex1"), 5);
        System.out.println(map);
    }
    static void hashSet() {
        Set<String> set = new HashSet<>();
        set.add("Oleg");
        set.add("Content");
        set.add("Alex1");
        set.add("Adios");
        set.remove("Content");
        set.remove(new String("Content"));
        set.remove("UnexistString");
        System.out.println(set);
    }
    static void linkedHashSet() {
        Set<Person> set = new LinkedHashSet<>();
        Person oleg = new Person("Oleg");
        set.add(oleg);
        set.add(oleg.copy());
        System.out.println(set);
    }
    static void treeSet() {
        Set<Person> set = new TreeSet<>();
        Person oleg = new Person("Oleg");
        Person alex1 = new Person("Alex1");
        set.add(oleg);
        set.add(oleg.copy());
        set.add(new Person("Oleg"));
        set.add(alex1);
        for(Person elem: set) {
            System.out.println("[" + elem + "]");
        }
    }
    static void linkedList() {
        List<Person> list = new LinkedList<>();
        Person oleg = new Person("Oleg");
        Person alex1 = new Person("Alex1");
        list.add(oleg);
        list.add(alex1);
        list.add(oleg.copy());
        list.add(oleg);
        list.add(oleg);
        list.add(oleg);
        list.add(oleg);
        list.add(oleg);
        list.remove(7);
        list.remove(alex1);
        list.remove(new Person("Content"));
        System.out.println(list);
    }
    static void arrayList() {
        List<Person> list = new ArrayList<>();
        Person oleg = new Person("Oleg");
        Person alex1 = new Person("Alex1");
        list.add(oleg);
        list.add(alex1);
        list.add(oleg.copy());
        list.add(oleg);
        list.add(oleg);
        list.add(oleg);
        list.add(oleg);
        list.add(oleg);
        list.remove(7);
        list.remove(alex1);
        list.remove(new Person("Content"));
        System.out.println(list);
    }
    public static void main(String[] args) {
        DataStructTest.arrayList();
    }
}
