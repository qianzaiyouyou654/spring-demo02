package com.liusiqi.model;

import java.util.*;

public class Student {

    private String id;

    private String name;

    private Integer age;

    private Date birth;

    private String[] arrays;

    private List<String> list;

    private Map<String, Object> maps;

    private Set<String> sets;

    private Classes classes;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", arrays=" + Arrays.toString(arrays) +
                ", list=" + list +
                ", maps=" + maps +
                ", sets=" + sets +
                ", classes=" + classes +
                '}';
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
