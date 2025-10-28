package com.example.data.javaset.map.hash;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author mazouri
 * @create 2021-08-10 23:59
 */
public class Person {
    //用户Id，唯一确定用户
    private String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
