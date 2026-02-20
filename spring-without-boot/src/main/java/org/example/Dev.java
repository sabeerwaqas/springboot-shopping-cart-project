package org.example;

public class Dev {

    private int age;
    private Laptop laptop;

    public Dev() {
        System.out.println("Dev Constructor");
    }

    public Dev(int age) {
        this.age = age;
        System.out.println("Dev created");
    }

    public void build() {
        System.out.println("Working on the awesome project");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop(){
        return laptop;
    }

    public void setLaptop(Laptop laptop){
        this.laptop = laptop;
    }
}
