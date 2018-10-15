/**
 * 
 */
package com.amydegregorio.javabasics.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author AMD
 *
 */
public class SetExample {

   /**
    * @param args
    */
   public static void main(String[] args) {
      SetExample ex = new SetExample();
      ex.demoHashSet();
   }
   
   /**
    * Demonstrates how to work with a HashSet.
    * 
    */
   public void demoHashSet() {
      System.out.println("***Demonstrates a HashSet");
      Set<String> stringSet = new HashSet<String>();
      System.out.println(String.format("Length of stringSet: %d", stringSet.size()));
      stringSet.add("rose");
      stringSet.add("geranium");
      stringSet.add("tulip");
      stringSet.add("iris");
      stringSet.add("marigold");
      stringSet.add("lily");
      System.out.println(String.format("Length of stringSet: %d", stringSet.size()));
      System.out.println();
      
      System.out.println(String.format("Set contains 'geranium': %b", stringSet.contains("geranium")));
      System.out.println();
      
      //Java 5 and Above
      System.out.println("--Iterating with an enhanced for loop");
      for(String flower: stringSet) {
         System.out.println(flower);
      }
      System.out.println();
      
      stringSet.remove("rose");
      
      System.out.println("--Iterating with an Iterator");
      for(Iterator<String> it = stringSet.iterator(); it.hasNext();) {
         String flower = it.next();
         System.out.println(flower);
      }
      System.out.println();
      
      stringSet.add("zinnia");
      
      //Java 8 and Above
      System.out.println("--Iterating with forEach");
      stringSet.forEach(System.out::println);
      
   }

}
