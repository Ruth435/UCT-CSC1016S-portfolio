/**
Ruth-ann Rudolph RLDRUT001
Student inherits from Person object stores age, gender and name, students adds year of study, hobbies, institution name, and program of study
28/09/2023
*/
public class Student extends Person
{
    private int yearOfStudy;
    private String hobbies;
    private String nameOfInstitution;
    private String programOfStudy;

    /** constructor for student, super person stores age, gender and name, students adds year of study, hobbies, institution name, and program of study */  
    public Student(String name, int age,String gender, String nameOfInstitution, String programOfStudy, int yearOfStudy, String hobbies)
    {
      super(name, age, gender);
      this.nameOfInstitution = nameOfInstitution;
      this.programOfStudy = programOfStudy;
      this.yearOfStudy = yearOfStudy;
      this.hobbies = hobbies;
    }
    
    /**copy constructor for student object, uses super person */
    public Student(Student p)
    {
      super(p);
      if (p == null)
      {
         System.out.println("Fatal error.");
         System.exit(0);
      }
      this.nameOfInstitution = p.nameOfInstitution;
      this.programOfStudy = p.programOfStudy;
      this.yearOfStudy = p.yearOfStudy;
      this.hobbies = p.hobbies;
    }
    
    /** returns the year of study as an int */
    public int getYearOfStudy()
    {
      return yearOfStudy;
    }
    
    /** returns the hobbies as a string */
    public String getHobbies()
    {
      return hobbies;
    }
    
    /** returns the name of the institution as a string */
    public String getNameOfInstitution()
    {
      return nameOfInstitution;
    }
    
    /** returns the program of study as a string*/
    public String getProgramOfStudy()
    {
      return programOfStudy;
    }
    
    /** takes in a string and sets hobbies to that value*/
    public void setHobbies(String hobbies)
    {
      this.hobbies = hobbies;
    }
    
    /** takes in a string and sets name of institution to that value*/
    public void setNameOfInstitution(String nameOfInstitution)
    {
      this.nameOfInstitution = nameOfInstitution;
    }
    
    /** takes in a string and sets program of study to that value*/
    public void setProgramOfStudy(String programOfStudy)
    {
      this.programOfStudy = programOfStudy;
    }
    
    /** takes in an int and sets year of study to that value*/
    public void setYearOfStudy(int yearOfStudy)
    {
      this.yearOfStudy = yearOfStudy;
    }
}