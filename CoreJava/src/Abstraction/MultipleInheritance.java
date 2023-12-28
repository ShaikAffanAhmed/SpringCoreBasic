package Abstraction;

//If a class implements multiple interfaces, or an interface extends multiple interfaces, it is known as multiple inheritance.

//interface  MultipleInheritance 
//{
// void print();
//}



//we can have method body in interface. But we need to make it default method
 interface MultipleInheritance
 {
    void draw();
    default void mesg()  //default method
    {
    	System.out.println("default method");
    }
    
}