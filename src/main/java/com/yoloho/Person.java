package com.yoloho;

/**
 * Created by zhaolei on 16-6-28.
 */
public class Person implements Comparable<Person> {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        return (this.age > p.age ? 1 : (this.age == p.age ? 0 : -1));
    }

    @Override
    public String toString() {
        return this.name + "--" + this.age;
    }
}
