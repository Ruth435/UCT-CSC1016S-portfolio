import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class TestOfTime {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
    /** Check that a Time object does actually store the time value 
   provided as a parameter during creation (by calling toString) **/
   @Test public void Time1() {
      Time t = new Time("03:25:04");
      String result = t.toString();
      Assert.assertEquals(result, "03:25:04");
   }
   
   /** Check that subtracting an earlier Time from a later Time produces 
   a Duration of the correct length. **/
   @Test public void Time2() {
      Time t1 = new Time("03:25");
      Time t2 = new Time("04:25");
      Duration d = t2.subtract(t1);
      long r = d.intValue("minute");
      String result = "" + r;
      Assert.assertEquals(result, "60");
   }
   
   /** Check that subtracting a Time from itself produces a zero 
   Duration. **/
   @Test public void Time3() {
      Time t1 = new Time("03:25");
      Duration d = t1.subtract(t1);
      long result = d.intValue("millisecond");
      Assert.assertEquals(result, 0);
   }
   
   /** Check that the intValue method works with a parameter of 
   millisecond **/
   @Test public void Duration1() {
      Duration d = new Duration(3600000);
      long result = d.intValue("millisecond");
      Assert.assertEquals(result, 3600000);
   }
   
   /** Check that the intValue method works with a parameter of 
   second **/
   @Test public void Duration2() {
      Duration d = new Duration(3600000);
      long result = d.intValue("second");
      Assert.assertEquals(result, 3600);
   }
   
   /** Check that the intValue method works with a parameter of 
   minute **/
   @Test public void Duration3() {
      Duration d = new Duration(3600000);
      long result = d.intValue("minute");
      Assert.assertEquals(result, 60);
   }
   
   /** Check that the intValue method works with a parameter of 
   hour **/
   @Test public void Duration4() {
      Duration d = new Duration(3600000);
      long result = d.intValue("hour");
      Assert.assertEquals(result, 1);
   }
   
}
