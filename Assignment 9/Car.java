/**
Ruth-ann Rudolph RLDRUT001
car inherits from the Vehicle object which stores student owner, number of cylinders and manufacturer, car adds capacity and wieght
28/09/2023
*/
public class Car extends Vehicle
{
    private int capacity;
    private double weight;

    /**copy constructor for car, uses super vehicle*/
    public Car(Car c)
    {
      super(c);
      if (c == null)
      {
         System.out.println("Fatal error.");
         System.exit(0);
      }
      this.capacity = c.capacity;
      this.weight = c.weight;
    }
    
    /**constructor for car objet uses super vehicle which storesstudent owner, number of cylinders and manufacturer, car adds capacity and weight*/
    public Car(int numCylinders, String maker, Student owner, int capacity, double weight)
    {
      super(numCylinders, maker, owner);
      this.capacity = capacity;
      this.weight = weight;
    }

    /**returns the variables of car as a string, uses super vehicle*/
    public String toString()
    {
      return super.toString() + "\nThe car is a " + capacity + "-seater weighing " + weight + " kg";
    }
}