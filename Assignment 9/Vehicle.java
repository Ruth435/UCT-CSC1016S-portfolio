/**
Ruth-ann Rudolph RLDRUT001
Vehicle object stores student owner, number of cylinders and manufacturer
28/09/2023
*/
public class Vehicle
{
    private Student owner;
    private int cylinders;
    private String manufacturer;

    /** copy constructor for vehicle object*/
    public Vehicle(Vehicle v)
    {
      if (v == null)
      {
         System.out.println("Fatal error.");
         System.exit(0);
      }
      this.owner = v.owner;
      this.cylinders = v.cylinders;
      this.manufacturer = v.manufacturer;
    }
    
    /**constructor for vehicle objet student owner, number of cylinders and manufacturer*/
    public Vehicle(int cylinders,String manufacturer, Student owner)
    {
      this.owner = new Student(owner);
      this.cylinders = cylinders;
      this.manufacturer = manufacturer;
    }
      
    /**returns the values of the vehicle object as a string*/
    public String toString()
    {
      return manufacturer + ", " + cylinders + " cylinders, owned by " + owner.getName() +", a " + owner.getAge() + "-year old "+ owner.getGender() +" studying " + owner.getProgramOfStudy() + " at " + owner.getNameOfInstitution() + ". " + owner.getName() +" likes " +owner.getHobbies() +".";
    }
}