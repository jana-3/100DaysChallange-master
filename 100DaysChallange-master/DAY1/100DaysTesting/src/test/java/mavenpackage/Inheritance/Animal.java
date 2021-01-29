package mavenpackage.Inheritance;
// Inheritance is an important pillar of OOP
// It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class.

// Super Class: The class whose features are inherited is known as super class(or a base class or a parent class).
// Sub Class: The class that inherits the other class is known as sub class(or a derived class, extended class, or child class)
// Reusability: Inheritance supports the concept of “reusability”
// The keyword used for inheritance is extends.


    public  class Animal {

        String name;
        public void eat() {
          System.out.println("I can eat");
        }
      }
      class Dog extends Animal {
      
        public void display() {
          System.out.println("My name is " + name);
        }
      }
      
      class Main {
          
        public static void main(String[] args) {
      
          Dog labrador = new Dog();
          labrador.name = "Tommy";
          labrador.display();
          labrador.eat();
      
        }
      }

