package mavenpackage.Encapsulation;
public class EncapsulationData {

    public static void main(String args[]) {
           //creating instance of Account class  
           Encapsulation sports=new Encapsulation();  
    //setting values through setter methods  
    sports.setSportsType("Cricket");  
    sports.setAtheleName("Dhoni");  
   
    //getting values through getter methods  
    System.out.println(sports.getSportsType()+" "+sports.getAtheleName());  
}  
        
    }
    

