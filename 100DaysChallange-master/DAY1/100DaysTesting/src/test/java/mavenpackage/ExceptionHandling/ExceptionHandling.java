package mavenpackage.ExceptionHandling;
// Types of exceptions
/* Checked Exception
Unchecked Exception
Error */

// The classes which directly inherit Throwable class except RuntimeException, Checked exceptions are checked at compile-time.
// The classes which inherit RuntimeException, Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
// Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc
public class ExceptionHandling {

        public static void main(String[] args) {  
              
               try{    
                    int a[]=new int[5];    
                    a[5]=30/0;    
                   }    
                   catch(ArithmeticException e)  
                      {  
                       System.out.println("Arithmetic Exception occurs");  
                      }    
                   catch(ArrayIndexOutOfBoundsException e)  
                      {  
                       System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                      }    
                   catch(Exception e)  
                      {  
                       System.out.println("Parent Exception occurs");  
                      }             
                   
        }  
    }  
    

