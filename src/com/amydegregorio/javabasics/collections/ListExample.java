/**
 * 
 */
package com.amydegregorio.javabasics.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author AMD
 *
 */
public class ListExample {

   /**
    * @param args
    */
   public static void main(String[] args) {
      ListExample ex = new ListExample();
      ex.demoArrayList();
      ex.demoSortingArray();
   }
   
   /**
    * Demonstrates the following ArrayList operations
    * <ul>
    *   <ol>Creating an ArrayList</ol>
    *   <ol>Adding at the end</ol>
    *   <ol>Adding a specific index </ol>
    *   <ol>Getting the length</ol>
    *   <ol>Getting a value</ol>
    *   <ol>Replacing a value at a specific index</ol>
    *   <ol>Removing a value</ol>
    *   <ol>Four ways to iterate over a list</ol>
    * </ul>
    */
   public void demoArrayList() {
      System.out.println("***Demonstrates an ArrayList");
      List<String> stringList = new ArrayList<String>();
      System.out.println(String.format("Length of stringList: %d", stringList.size()));
      stringList.add("Apples");
      stringList.add("Oranges");
      stringList.add("Pears");
      stringList.add("Grapes");
      stringList.add("Blueberries");
      stringList.add("Blackberries");
      stringList.add(1, "Bananas");
      
      System.out.println(String.format("Length of stringList: %d", stringList.size()));
      System.out.println();
      System.out.println(String.format("Values at position %d of stringList: %s", 1, stringList.get(1)));
      System.out.println();
      
      //For loop for iterating over a list
      System.out.println("--Iterating with a for loop");
      for (int i = 0; i < stringList.size(); i++) {
         System.out.println(String.format("Fruit at position %d: %s", i, stringList.get(i)));
      }
      System.out.println();
      
      //Change position four (Grapes) to Strawberries
      stringList.set(4, "Strawberries");
      
      //Enhanced for loop (Java 5 and on)
      System.out.println("--Iterating with an advanced for loop");
      for (String fruit : stringList) {
         System.out.println(String.format("Fruit: %s", fruit));
      }
      System.out.println();
      
      stringList.remove("Pears");
      
      System.out.println("--Iterating with an iterator");
      for (Iterator<String> it = stringList.iterator(); it.hasNext();) {
         String fruit = it.next();
         System.out.println(String.format("Fruit: %s", fruit));
         if (fruit.equals("Oranges")) {
            it.remove();
         }
      }
      System.out.println();
      
      //Java 8 and above only - using collection stream() utility
      System.out.println("--Iterating using the collection stream() utility");
      stringList.forEach((fruit) -> {
         System.out.println(String.format("Fruit: %s", fruit)); 
      });
      System.out.println();
   }
   
   /**
    * Demonstrates how to sort an ArrayList of String by alphabetical order (case insensitive).
    */
   public void demoSortingArray() {
      System.out.println("***Demonstrates an Sorting a list");
      List<String> listToSort = new ArrayList<String>();
      listToSort.add("Tangerines");
      listToSort.add("Watermelon");
      listToSort.add("Blueberries");
      listToSort.add("Dragonfruit");
      listToSort.add("Strawberries");
      listToSort.add("Oranges");
      listToSort.add("Apples");
      listToSort.add("Bananas");
      listToSort.add("Kiwis");
      
      listToSort.sort(String.CASE_INSENSITIVE_ORDER);
      for (String fruit : listToSort) {
         System.out.println(String.format("Fruit: %s", fruit));
      }
   }

}
