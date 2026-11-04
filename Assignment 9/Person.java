/**
Ruth-ann Rudolph RLDRUT001
Person object stores age, gender and name
28/09/2023
*/
public class Person
{
    private int age;
    private String gender;
    private String name;
    
    /**constructor for person objet name, age, gender*/
    public Person(String name, int age, String gender)
    {
      this.name = name;
      this.age = age;
      this.gender = gender;
    }
    
    /**copy constructor for person object */
    public Person(Person p)
    {
      if (p == null)
      {
         System.out.println("Fatal error.");
         System.exit(0);
      }
      this.name = p.name;
      this.age = p.age;
      this.gender = p.gender;
    }
    
    /**returns age as an integer*/
    public int getAge()
    {
      return age;
    }
    
    /**returns gender as a string*/
    public String getGender()
    {
      return gender;
    }
    
    /**returns name as a string*/
    public String getName()
    {
      return name;
    }
    
    /**takes in int age and sets the persons age to that value*/
    public void setAge(int age)
    {
      this.age = age;
    }
    
    /**takes in String gender and sets the persons gender to that value*/
    public void setGender(String gender)
    {
      this.gender = gender;
    }
    
    /**takes in string name and sets the persons name to that value*/
    public void setName(String name)
    {
      this.name = name;
    }
}