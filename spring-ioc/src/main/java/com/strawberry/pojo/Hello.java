package com.strawberry.pojo;

public class Hello {
    private String name;

    public Hello(String name) {
        this.name = name;
        System.out.println("Hello的有参构造器");
    }

    public Hello() {
        System.out.println("Hello的无参构造器");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name=" + name);
    }
}
