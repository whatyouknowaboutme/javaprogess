import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import org.junit.matchers.JUnitMatchers;
public class SimpleLinkedListTest {

   /*check that a linked list created using the 
   constructor (with a list of items passed in as a parameter) 
   contains the items passed in.*/
   /*
   SimpleLinkedList<String> empty = new SimpleLinkedList<String>();
   SimpleLinkedList<String> data1 = new SimpleLinkedList<String>();
   SimpleLinkedList<String> data2 = new SimpleLinkedList<String>();
   
   data1.add("Aadam");
   data1.add("h");
   data1.add("c");
   
   data2.add("Tas");
   data2.add("Hello");
   data2.add("Bye");
   data2.add("Tas");
   data2.add("Hello");
   data2.add("Bye");
   data2.add("Tas");
   data2.add("Hello");
   data2.add("Bye");
   
   data1.trimToSize(2);
   data2.trimToSize(3);
   
   ArrayList<String> arrempty = new ArrayList<String>();
   ArrayList<String> array1 = new ArrayList<String>();
   ArrayList<String> array2 = new ArrayList<String>();
   array1.add("Aadam");
   array1.add("h");
  
   
   array2.add("Tas");
   array2.add("Hello");
   array2.add("Bye");
   
   
   Iterator<String> itempty = empty.iterator();
   Iterator<String> output1 = data1.iterator();
   Iterator<String> output2 = data2.iterator();
   
   ArrayList<String> emptyout = new ArrayList<String>();
   ArrayList<String> out1 = new ArrayList<String>();
   ArrayList<String> out2= new ArrayList<String>();
   
   while (itempty.hasNext())
   {  
      emptyout.add(itempty.next());
   }
   while (output1.hasNext())
   {
      out1.add(output1.next());
   }
   while (output2.hasNext())
   {
      out2.add(output2.next());
   }
          
   assertEquals ( arrempty,emptyout); 
   assertEquals ( array1,out1);
   assertEquals ( array2,out2);
   assertNotEquals(array1,emptyout);
   assertNotEquals(array2,out1);
   assertNotEquals(arrempty,out2);
   assertNotEquals ( out1,emptyout);
 

   
       */ 
   @Test public void TestConstructor() {
   
   SimpleLinkedList<String> empty = new SimpleLinkedList<String>();
   SimpleLinkedList<String> data1 = new SimpleLinkedList<String>();
   SimpleLinkedList<String> data2 = new SimpleLinkedList<String>();
   
   data1.add("Aadam");
   data2.add("Tas");
   data2.add("Hello");
   data2.add("Bye");
   
   ArrayList<String> arrempty = new ArrayList<String>();
   ArrayList<String> array1 = new ArrayList<String>();
   ArrayList<String> array2 = new ArrayList<String>();
   array1.add("Aadam");
   array2.add("Tas");
   array2.add("Hello");
   array2.add("Bye");
   
   Iterator<String> itempty = empty.iterator();
   Iterator<String> output1 = data1.iterator();
   Iterator<String> output2 = data2.iterator();
   
   ArrayList<String> emptyout = new ArrayList<String>();
   ArrayList<String> out1 = new ArrayList<String>();
   ArrayList<String> out2= new ArrayList<String>();
   
   while (itempty.hasNext())
   {  
      emptyout.add(itempty.next());
   }
   while (output1.hasNext())
   {
      out1.add(output1.next());
   }
   while (output2.hasNext())
   {
      out2.add(output2.next());
   }
          
   assertEquals ( arrempty,emptyout); 
   assertEquals ( array1,out1);
   assertEquals ( array2,out2);
   assertNotEquals(array1,emptyout);
   assertNotEquals(array2,out1);
   assertNotEquals(arrempty,out2);
   assertNotEquals ( out1,emptyout);
 
   
   }
 
   @Test  public void TestIndex()
   {
   SimpleLinkedList<String> empty = new SimpleLinkedList<String>();
   SimpleLinkedList<String> data1 = new SimpleLinkedList<String>();
   SimpleLinkedList<String> data2 = new SimpleLinkedList<String>();
   
   data1.add("Aadam");
   data2.add("Tas");
   data2.add("Hello");
   data2.add("Bye");
   data2.add("Hello");
  
   assertEquals (-1,empty.indexOf("h"));
   assertEquals(0,data1.indexOf("Aadam"));
   assertEquals(0,data2.indexOf("Tas"));
   assertEquals(1,data2.indexOf("Hello"));
   assertEquals(2,data2.indexOf("Bye"));
   assertNotEquals(-1,data2.indexOf("Hello"));
   assertNotEquals (0,empty.indexOf("h"));
   }
   
   @Test public void TestInsert()
   {
      SimpleLinkedList<String> empty = new SimpleLinkedList<String>();
   SimpleLinkedList<String> data1 = new SimpleLinkedList<String>();
   SimpleLinkedList<String> data2 = new SimpleLinkedList<String>();
   
   data1.add("Aadam");
   data2.add("Tas");
   data2.add("Hello");
   data2.add("Bye");
   
   data1.insert(0,"Iman");
   data2.insert(1,"Dog");
   data2.insert (2, "ME");
   
   ArrayList<String> arrempty = new ArrayList<String>();
   ArrayList<String> array1 = new ArrayList<String>();
   ArrayList<String> array2 = new ArrayList<String>();
   array1.add(0,"Iman");
   array1.add("Aadam");
   
   array2.add("Tas");
   array2.add("Hello");
   array2.add("Bye");
   array2.add(1,"Dog");
   array2.add(2,"ME");
   
   Iterator<String> itempty = empty.iterator();
   Iterator<String> output1 = data1.iterator();
   Iterator<String> output2 = data2.iterator();
   
   ArrayList<String> emptyout = new ArrayList<String>();
   ArrayList<String> out1 = new ArrayList<String>();
   ArrayList<String> out2= new ArrayList<String>();
   
      while (itempty.hasNext())
   {  
      emptyout.add(itempty.next());
   }
   while (output1.hasNext())
   {
      out1.add(output1.next());
   }
   while (output2.hasNext())
   {
      out2.add(output2.next());
   }
          
   assertEquals ( arrempty,emptyout); 
   assertEquals ( array1,out1);
   assertEquals ( array2,out2);
   assertNotEquals(array1,emptyout);
   assertNotEquals(array2,out1);
   assertNotEquals(arrempty,out2);
   assertNotEquals ( out1,emptyout);
   }
      
 @Test public void TestTrimToSize ()
 {
   SimpleLinkedList<String> empty = new SimpleLinkedList<String>();
   SimpleLinkedList<String> data1 = new SimpleLinkedList<String>();
   SimpleLinkedList<String> data2 = new SimpleLinkedList<String>();
   
   data1.add("Aadam");
   data1.add("h");
   data1.add("c");
   
   data2.add("Tas");
   data2.add("Hello");
   data2.add("Bye");
   data2.add("Tas");
   data2.add("Hello");
   data2.add("Bye");
   data2.add("Tas");
   data2.add("Hello");
   data2.add("Bye");
   
   data1.trimToSize(2);
   data2.trimToSize(3);
   
   ArrayList<String> arrempty = new ArrayList<String>();
   ArrayList<String> array1 = new ArrayList<String>();
   ArrayList<String> array2 = new ArrayList<String>();
   array1.add("Aadam");
   array1.add("h");
  
   
   array2.add("Tas");
   array2.add("Hello");
   array2.add("Bye");
   
   
   Iterator<String> itempty = empty.iterator();
   Iterator<String> output1 = data1.iterator();
   Iterator<String> output2 = data2.iterator();
   
   ArrayList<String> emptyout = new ArrayList<String>();
   ArrayList<String> out1 = new ArrayList<String>();
   ArrayList<String> out2= new ArrayList<String>();
   
   while (itempty.hasNext())
   {  
      emptyout.add(itempty.next());
   }
   while (output1.hasNext())
   {
      out1.add(output1.next());
   }
   while (output2.hasNext())
   {
      out2.add(output2.next());
   }
          
   assertEquals ( arrempty,emptyout); 
   assertEquals ( array1,out1);
   assertEquals ( array2,out2);
   assertNotEquals(array1,emptyout);
   assertNotEquals(array2,out1);
   assertNotEquals(arrempty,out2);
   assertNotEquals ( out1,emptyout);
 

  }
}
