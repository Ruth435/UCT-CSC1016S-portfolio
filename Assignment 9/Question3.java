/**
Ruth-ann Rudolph RLDRUT001
gets the details of a car object and returns the values in a readable format
28/09/2023
*/
import java.util.Scanner;
public class Question3
{
   public static void main (String [] args)
   {
      //gets the inforamtion for the car and owner
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the vehicle manufacturer:");
      String carName = input.nextLine();
      System.out.println("Enter the name of the vehicle owner:");
      String owner = input.nextLine();
      System.out.println("Enter the owner's gender:");
      String gender = input.nextLine();
      System.out.println("Enter the owner's programme of study:");
      String programOfStudy = input.nextLine();
      System.out.println("Enter the owner's Institution name:");
      String institution = input.nextLine();
      System.out.println("Enter the owner's hobbies:");
      String hobbies = input.nextLine();
      System.out.println("Enter the owner's age:");
      int age = input.nextInt();
      System.out.println("Enter the number of cylinders in the engine:");
      int cylinders = input.nextInt();
      System.out.println("Enter the car seating capacity:");
      int seats = input.nextInt();
      System.out.println("Enter the weight of the car:");
      double weight = input.nextDouble();
      Student student = new Student(owner, age, gender, institution, programOfStudy, 1, hobbies);//makes the student object
      Car car = new Car(cylinders, carName, student, seats, weight);//makes the car object
      System.out.println(car.toString());//prints the car details
   }
}