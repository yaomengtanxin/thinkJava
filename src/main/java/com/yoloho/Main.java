package com.yoloho;

import sun.plugin.javascript.navig.Array;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.*;
import java.util.Iterator;

/**
 * Hello world!
 *
 */
class Main
{


    public static void main( String[] args )
    {

       /* setMap(Main.<String, String>getMap());
        CoffeeGenertor genertor = new CoffeeGenertor(4);
        for (Coffee coffee : genertor) {
            System.out.println(coffee);
        }*/

        /*Map<String, String> map1 = getMap();
        Map<Double, String> map2 = getMap();
        System.out.println(map1.getClass().equals(map2.getClass()));
        MyArray<Integer>[] myArrays = (MyArray<Integer>[])new Object[2];
        for (MyArray<Integer> m : myArrays) {
            System.out.println(m.getClass().getSimpleName());
        }*/
        /*List<? extends Fruit> flist = new ArrayList<Apple>();
        flist.get(0);*/
      /*  Integer a=100,b=100;
        Integer c=1000,d=1000;
        System.out.println(a==b);
        System.out.println(c==d);*/
       /* Person[] array = {new Person("张三", 12), new Person("李四", 32), new Person("王五", 16)};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));*/
        String[] strArray = StringGenertor.getString(new String[10],4);

    }

    public static class StringGenertor {
        private static char[] chars = {'a','b','c','d','e','S','G','E','H'};
        private static Random r = new Random(chars.length);
        public static String[] getString( String[] strArray, int size) {
            for (int i=0; i<strArray.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j=0; j< size; j++) {
                    sb.append(chars[r.nextInt()]);
                }
                strArray[i] = sb.toString();
            }
        return strArray;
        }
    }

    public static <K, V> Map<K, V> getMap() {
        return new HashMap<K, V>();
    }

    public static void setMap(Map<String, String> map) {}
    public static <E,T> List<E> getList(T t) {return null;}

    static class MyArray<T> {
        private T[] arr;
        MyArray() {
            this.arr = (T[])new Object[2];
        }
    }


    static class Reader<T> {
        T  read(List<? extends T> list) {
            return list.get(0);
        }
    }
    static void f3() {
        Reader<Fruit> fr = new Reader<>();
        Fruit f = fr.read(new ArrayList<Fruit>());
        Fruit f2 = fr.read(new ArrayList<Apple>());
    }

}
class Fruit{}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class Oragle extends Fruit{}


