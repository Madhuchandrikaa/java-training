package com.atria.day3;

public class EncapsulationDemo {
    public static void main(String[] args) {

        EncapsulationExample obj = new EncapsulationExample(); // ✅ class name corrected
        obj.setAge(20);
        obj.setName("Madhu");
        obj.setSerialNum(100);

        // You don’t need to call getters separately unless you want to print them
        System.out.println("Age: " + obj.getAge());
        System.out.println("Name: " + obj.getName());
        System.out.println("Serial Number: " + obj.getSerialNum());

        // This will print via toString()
        System.out.println(obj);
    }
}
