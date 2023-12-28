package com.practice;

class Base {
    public void m1() throws NullPointerException {
        System.out.println("Base: m1()");
    }
}
class Derived extends Base {
    public void m1() throws RuntimeException 
    {
        System.out.println("Derived: m1()");
    }
}
 
public class sample1 {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.m1();
    }
}   