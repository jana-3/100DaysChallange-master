package mavenpackage;

interface SampleInterface{

    void transport();

    void employeeDetails(String name, int id, String type);

    void transportation(String availability);
}
      class SecondEmployee implements SampleInterface {

      public void transport() {
           System.out.println("Transport type: car");

       }

          public void employeeDetails(String name, int id, String type) {
              System.out.println("name:"+name);
              System.out.println("id:"+id);
              System.out.println("type:"+type);
          }

         public void transportation(String availability) {
              if (availability.contains("available")) {
                  System.out.println("transportation is available for you");
              }
          }

       public static void main(String[] args) {
           SecondEmployee details= new SecondEmployee();
           details.employeeDetails("secondemployee",102,"permanent");
           details.transportation("available");
           details.transport();

       }}

    

