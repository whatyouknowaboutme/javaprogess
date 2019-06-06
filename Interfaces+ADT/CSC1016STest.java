import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class CSC1016STest {

   CSC1016S obj1;
   CSC1016S obj2;
   CSC1016S obj3;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   
   }


   /** A test that always fails. **/
   @Test public void getNameTest() {
      
      obj1 = new CSC1016S ();
      obj1.setName("Person1");
      obj1.setMark ("pracs",0);
      obj1.setMark ("practests",0);
      obj1.setMark ("tests",0);
      obj1.setMark ("exam",0);
      
      
     
      obj2 = new CSC1016S ();
      obj2.setName("Person2");
      obj2.setMark ("pracs",100);
      obj2.setMark ("practests",100);
      obj2.setMark ("tests",100);
      obj2.setMark ("exam",100);
      
      
      obj3 = new CSC1016S ();
      obj3.setName("Person3");
      obj3.setMark ("pracs",18);
      obj3.setMark ("practests",19);
      obj3.setMark ("tests",50);
      obj3.setMark ("exam",60);
      
      Assert.assertEquals( "Person1",obj1.getName());
      Assert.assertNotEquals (obj2.getName(),obj1.getName());     
   }
   
   @Test public void setNameTest()
   {
               obj1 = new CSC1016S ();
      obj1.setName("Person1");
      obj1.setMark ("pracs",0);
      obj1.setMark ("practests",0);
      obj1.setMark ("tests",0);
      obj1.setMark ("exam",0);
      
      
     
      obj2 = new CSC1016S ();
      obj2.setName("Person2");
      obj2.setMark ("pracs",100);
      obj2.setMark ("practests",100);
      obj2.setMark ("tests",100);
      obj2.setMark ("exam",100);
      
      
      obj3 = new CSC1016S ();
      obj3.setName("Person3");
      obj3.setMark ("pracs",18);
      obj3.setMark ("practests",19);
      obj3.setMark ("tests",50);
      obj3.setMark ("exam",60);      
      obj1.setName("Person2");
      Assert.assertEquals("Person2",obj1.getName());
      Assert.assertEquals(  obj2.getName(),obj1.getName());
      Assert.assertNotEquals (obj3.getName(),obj1.getName());      
   }
   
   @Test public void getFinalTest()
   {
               obj1 = new CSC1016S ();
      obj1.setName("Person1");
      obj1.setMark ("pracs",0);
      obj1.setMark ("practests",0);
      obj1.setMark ("tests",0);
      obj1.setMark ("exam",0);
      
      
     
      obj2 = new CSC1016S ();
      obj2.setName("Person2");
      obj2.setMark ("pracs",100);
      obj2.setMark ("practests",100);
      obj2.setMark ("tests",100);
      obj2.setMark ("exam",100);
      
      
      obj3 = new CSC1016S ();
      obj3.setName("Person3");
      obj3.setMark ("pracs",18);
      obj3.setMark ("practests",19);
      obj3.setMark ("tests",50);
      obj3.setMark ("exam",60);
      float delta = (float)0.0001;
      float obj1mark = obj1.getFinal();
      float obj2mark = obj2.getFinal();
      float obj3mark = obj3.getFinal();
   
      Assert.assertEquals(0.0,obj1.getFinal(),delta);
      Assert.assertNotEquals(obj2.getFinal(), obj1.getFinal(), delta);
      
      Assert.assertEquals(100.0,obj2.getFinal(),delta);
      Assert.assertNotEquals(obj1.getFinal(), obj2.getFinal(), delta);
       
      Assert.assertEquals(48.1, obj3.getFinal(),delta);
      Assert.assertNotEquals(obj1.getFinal(), obj3.getFinal(), delta);
   }
      
}
