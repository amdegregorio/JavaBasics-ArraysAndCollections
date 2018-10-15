/**
 * 
 */
package com.amydegregorio.javabasics.collections;

import java.util.Arrays;

/**
 * @author AMD
 *
 */
public class ArrayExample {

   /**
    * Runs the array examples.
    * 
    * @param args (not used)
    */
   public static void main(String[] args) {
      ArrayExample ex = new ArrayExample();
      ex.demoPrimitiveArrayDefinedInline();
      ex.demoStringArray();
   }
   
   /**
    * <p>Creates an array of integers with an inline declaration and shows basic usage.</p>
    * <p>Exercises the array by showing how to access and change individual positions,
    * how to display the length and how to iterate over each item in the array.</p>
    */
   public void demoPrimitiveArrayDefinedInline() {
      System.out.println("***Demonstrating a primitive array defined inline.");
      int[] arrNums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
      
      System.out.println(String.format("Number at position %d: %d", 0, arrNums[0]));
      System.out.println(String.format("Length of numbers array: %d", arrNums.length));
      
      System.out.println();
      
      for (int i = 0; i < arrNums.length; i++) {
         System.out.println(String.format("Number at position %d: %d", i, arrNums[i]));
      }
      
      arrNums[0] = 20;
      arrNums[5] = 2 * 9;
      System.out.println();
      
      for (int i = 0; i < arrNums.length; i++) {
         System.out.println(String.format("Number at position %d: %d", i, arrNums[i]));
      }
      System.out.println();
      System.out.println();
   }
   
   /**
    * <p>Creates an array of Strings with a new statement and the size</p>
    * <p>Exercises the array by showing how to access and change individual positions,
    * how to display the length and how to iterate over each item in the array.</p>
    * <p>Demonstrates two ways to copy the existing array into a larger array</p>
    */
   public void demoStringArray() {
      System.out.println("***Demonstrating a String array defined with a length.");
      String[] arrString = new String[5];
      
      System.out.println(String.format("Length of string array: %d", arrString.length));
      
      arrString[0] = "red";
      arrString[1] = "blue";
      arrString[2] = "yellow";
      arrString[3] = "green";
      arrString[4] = "orange";
      
      for (int i = 0; i < arrString.length; i++) {
         System.out.println(String.format("String at position %d: %s", i, arrString[i]));
      }
      System.out.println();
      
      //Should (and does) throw ArrayIndexOutofBoundException
      //arrString[5] = "purple";
      
      //Resize the array using System.arraycopy
      String[] arrColors = new String[6];
      System.arraycopy(arrString, 0, arrColors, 0, arrString.length);
      arrColors[5] = "purple";
      System.out.println(String.format("Length of arrColors array: %d", arrColors.length));
      for (int i = 0; i < arrColors.length; i++) {
         System.out.println(String.format("Colors array at position %d: %s", i, arrColors[i]));
      }
      System.out.println();
      
      //Resize the array using Arrays.copyOf (uses System.arraycopy)
      String[] arrColors2 = Arrays.copyOf(arrString, 6);
      arrColors2[5] = "purple";
      System.out.println(String.format("Length of arrColors2 array: %d", arrColors2.length));
      for (int i = 0; i < arrColors2.length; i++) {
         System.out.println(String.format("Colors array 2 at position %d: %s", i, arrColors2[i]));
      }
      System.out.println();
   }

}
