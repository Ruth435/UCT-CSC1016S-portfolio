// Ruth-ann Rudolph RDLRUT001
// 11/09/2023
// An object of this class represents a work shift. A shift begins on a given date at a given time and ends on a given date at a given time.

public class Shift
{
   private CalendarTime start;
   private CalendarTime finish;
   
   public Shift(CalendarTime start, CalendarTime finish) // Create a Shift object representing a shift worked between the given date times.
   {
      this.start = start;
      this.finish = finish;
   }
   
   public CalendarTime start() // Obtain the start date and time for this shift.
   {
      return start;
   }
   
   public CalendarTime finish()// Obtain the end date and time for this shift.
   {
      return finish;
   }
   
   public boolean inWeek(Week w) // Determine whether this shift occurred within the given week.
   {
      if(w.includes(start.date()))
      {
         return true;
      }
      return false;
   }
   
   public boolean includesDate(Date date) // Determine whether this shift at least partly occurred on the given date.
   {
      if(start.date().compareTo(date) == 0 || finish.date().compareTo(date) == 0)
      {
         return true;
      }
      return false;
   }
   
   public Duration length() // Obtain the length of this shift.
   {
      return finish.subtract(start);
   }
   
   public String toString() // Obtain a string representation of this shift of the form "<date>%:<time>-<date>%:<time>".
   {
      return start + " - " + finish;
   }
}