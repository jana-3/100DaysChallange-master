package mavenpackage.Encapsulation;
// The whole idea behind encapsulation is to hide the implementation details from users

// Encapsulated code should have following characteristics:
/* Everyone knows how to access it.
Can be easily used regardless of implementation details.
There shouldn’t any side effects of the code, to the rest of the application. */

// If a data member is private it means it can only be accessed within the same class
// By providing only a setter or getter method, you can make the class read-only or write-only. 

/* A example of encapsulation is the class of java.util.Hashtable. 
User only knows that he can store data in the form of key/value pair in a Hashtable and 
that he can retrieve that data in the various ways. But the actual implementation like,
 how and where this data is actually stored, is hidden from the user. User can simply use 
 Hashtable wherever he wants to store Key/Value pairs without bothering about
  its implementation */
public class Encapsulation {
    private String sportsType;
    private String atheletName;

    public String getSportsType(){
        return sportsType;
        
    }

    public void setSportsType(String sportsType){
         this.sportsType = sportsType;
    }

    public String getAtheleName(){
        return atheletName;
        
    }

    public void setAtheleName(String atheletName){
         this.atheletName = atheletName;
    }

    
}
          
        

