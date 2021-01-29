package mavenpackage.DAY3.Inheritance;
// Inheritance is an important pillar of OOP
// It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class.

// Super Class: The class whose features are inherited is known as super class(or a base class or a parent class).
// Sub Class: The class that inherits the other class is known as sub class(or a derived class, extended class, or child class)
// Reusability: Inheritance supports the concept of “reusability”
// The keyword used for inheritance is extends.


    public  class Bajaj {

      String Model;

      public void Type() {
        System.out.println("Two Wheeler");
      }
    }

    class VehicleType extends Bajaj {
      
        public void Model() {
          System.out.println("Model is " + Model);
        }
      }
      
      class Main {
          
        public static void main(String[] args) {
      
          VehicleType Vehicle= new VehicleType();
          Vehicle.Model = "Pulsar";
          Vehicle.Type();
          Vehicle.Model();
      
        }
      }

