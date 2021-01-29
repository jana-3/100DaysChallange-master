package mavenpackage;


/* A constructor in Java is similar to a method that is invoked when an object of the class is created
-Unlike Java methods, a constructor has the same name as that of the class 
-Rules for creating Java constructor
*There are two rules defined for the constructor
-Constructor name must be the same as its class name
-A Constructor must have no explicit return type
-A Java constructor cannot be abstract, static, final, and synchronized */

/* -There are two types of constructors in Java:
>Default constructor (no-arg constructor)
>Parameterized constructor */
public class ClassRoom {
   
        public String name;
        public int rollNumber;
        // constructor
        ClassRoom() {
          name = "Ram";
          rollNumber=345;
         
        }

        ClassRoom(String name,int rollNumber){
          this.name=name;
          this.rollNumber= rollNumber;
        }
      
        public static void main(String[] args) {
      
          // constructor is invoked while
          // creating an object of the Main class
          ClassRoom obj= new ClassRoom();
          System.out.println("The name is "+obj.name+" RollNumber is " + obj.rollNumber);
          ClassRoom obj1= new ClassRoom("chandru",4545);
          System.out.println("The name is " + obj1.name + " RollNumber is " + obj1.rollNumber);
        }
      }
