package mavenpackage;
// The Java throw keyword is used to explicitly throw an exception.
// We can throw either checked or uncheked exception in java by throw keyword.
// The throw keyword is mainly used to throw custom exception
public class ExceptionHandlingThrow {
  
        static void validate(int age){  
          if(age<18)  
           throw new ArithmeticException("You are not eligible to vote");  
          else  
           System.out.println("welcome to vote");  
        }  
        public static void main(String args[]){  
           validate(12);  
           System.out.println("Your Voter id is available");  
       }  
     }  

