/**Ruth-ann Rudolph RDLRUT001
09/19/2023
The NumberUtils class contains a collection of routines for working with integers. */

public class NumberUtils 
{
   /** A private, empty-bodied constructor prevents NumberUtil objects from being created. */
   private NumberUtils()
   {
   
   }
   
   /** Given a number that is n digits in length, maps the digits to an array length n. */
   public static int[] toArray(int number) 
   {
      String temp = number + "";
      int len = temp.length();
      int[] split = new int[len];
      for (int i = 0; i < len; i++)
      {
         split[i] = Character.getNumericValue(temp.charAt(i));
      }
      return split;
   }
   
   /** Given two numbers, count the quantity of matching digits those with the same value and position. */
   public static int countMatches(int numberA, int numberB) 
   {
      int[] a = toArray(numberA); //converts number to array
      int[] b = toArray(numberB); //converts number to array
      int count = 0;
      for (int i = 0; i < b.length; i++)
      {
         if(a[i] == b[i])
         {
            count++;
         }
      }
      return count;
   }
   
   /** Count the quantity of digits that two numbers have in common, regardless of position. */
   public static int countIntersect(int numberA, int numberB)
   {
      int[] a = toArray(numberA); //converts number to array
      int[] b = toArray(numberB); //converts number to array
      int count = 0;
      for (int i = 0; i < b.length; i++) //loop for array a
      {
         for(int j = 0; j < b.length; j++) //inner loop compares each b to the current a number
         {
            if(a[i] == b[j])
            {
               count++;
            }
         }
      }
      return count;
   }
}