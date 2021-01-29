package mavenpackage.DAY1.Abstraction;

abstract class Abstract {

    abstract void transport();

     public void employeeDetails(String name, int id, String type){
        System.out.println("name:"+name);
        System.out.println("id:"+id);
        System.out.println("type:"+type);
    }

   public void transportation(String availability) {
        if (availability.contains("available")) {
            System.out.println("transportation is available for you");
        }
    }}
      class FirstEmployee extends Abstract {

          public void transport() {
              System.out.println("Transport type: car");

          }
      }
      class TestAbstraction{
    public static void main(String []args) {
    FirstEmployee details= new FirstEmployee();
    details.employeeDetails("jana",101,"permanent");
    details.transportation("available");
    details.transport();

    }}