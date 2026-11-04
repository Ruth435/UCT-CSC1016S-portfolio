// Ruth-ann Rudolph RDLRUT001
// 11/09/2023
// Represents an Employee from the perspective of time keeping. It records the employee name and ID, and logs sign-ins and sign-outs.

import java.util.*;

public class Employee
{
   private String name;
   private String uid;
   private CalendarTime start;
   private CalendarTime finish;
   private List<Shift> list;
   
   public Employee(String name, String uid) // Create an Employee representing the employee with given name and UID.
   {
      this.name = name;
      this.uid = uid;
      this.list = new ArrayList<Shift>();
   }
   
   public String name() // Obtain this employees name.
   {
      return name;
   }
   
   public String UID() // Obtain this Employees ID.
   {
      return uid;
   }
   
   public void signIn(Date d, Time t) // Record that this employee has begun a shift on the given date and at the given time.
   {
      start = new CalendarTime(d, t);
   }
   
   public void signOut(Date d, Time t) // Record that this employee has completed a shift on the given date and at the given time.
   {
      finish = new CalendarTime(d,t);
      Shift temp = new Shift(start,finish);
      list.add(temp);
      start = null;
      finish = null;
   }
   
   public boolean present() // Determine whether this employee is present i.e. has signed-in and not yet signed-out.
   {
      if(start!= null && finish == null)
      {
         return true;
      }
      return false;
   }
   
   public boolean worked(Date d) // Determine whether this employee worked a shift that at least partly occurred on the given date.
   {
      for (Shift i : list)
      {
         if(i.includesDate(d))
         {
            return true;
         }
      }
      return false;
   }
   
   public boolean worked(Week w) // Determine whether this employee worked at least one shift during the given week
   {
      for (Shift i : list)
      {
         if(i.inWeek(w))
         {
            return true;
         }
      }
      return false;
   }
   
   public List<Shift> get(Date d) // Obtain the shift(s) worked by this employee that at least partly occur on the given date.
   {
      List<Shift> day = new ArrayList<Shift>();
      for (Shift i : list)
      {
         if(i.includesDate(d))
         {
            day.add(i);
         }
      }
      return day;
   }
   
   public List<Shift> get(Week w) // Obtain a list of the shifts worked by this employee during the given week.
   {
      List<Shift> week = new ArrayList<Shift>();
      for (Shift i : list)
      {
         if(i.inWeek(w))
         {
            week.add(i);
         }
      }
      return week;
   }
   
   public Duration hours(Week w) // Returns the total time (hours and minutes) worked during the given week.
   {
      Duration total = new Duration("minute", 0);
      for (Shift i : list)
      {
         if(i.inWeek(w))
         {
            total = total.add(i.length());
         }
      }
      return total;
   }
}