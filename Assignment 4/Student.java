//Ruth-ann Rudolph RDLRUT001
//15/08/2023
//Question 3 - assignment 4, class to model a student's name, composed of a first name, middle name and last name

public class Student
{
   private String firstName;
   private String middleName;
   private String lastName;
   
   public void setNames(String first, String middle, String last)
   {
      firstName = first;
      middleName = middle;
      lastName = last;
   }
   
   //method returns the full name of the student, middle name as just an initial
   public String getFullName()
   {
      return firstName + " " + middleName.charAt(0) + ". " + lastName;
   }
}