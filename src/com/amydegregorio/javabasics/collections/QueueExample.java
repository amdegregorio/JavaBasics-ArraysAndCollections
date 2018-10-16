/**
 * 
 */
package com.amydegregorio.javabasics.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * @author AMD
 *
 */
public class QueueExample {

   /**
    * @param args
    */
   public static void main(String[] args) {
      QueueExample ex = new QueueExample();
      ex.demoArrayDeque();
   }
   
   /**
    * Demonstrates the creation and basic usage of an ArrayDeque.
    */
   public void demoArrayDeque() {
      System.out.println("***Demonstrating an ArrayDeque");
      Deque<String> veggies = new ArrayDeque<String>();
      //Add will throw an exception if the capacity is limited and its out of room
      //Our example, is variable capacity
      veggies.add("tomatoes");
      veggies.addFirst("peppers");
      veggies.add("eggplant");
      veggies.add("squash");
      veggies.add("cucumbers");
      veggies.addLast("broccoli");
      //Offer returns false if it can't add because it was out of room
      //But our example ArrayDeque is variable length, so they are functionally identical to
      //the add methods.
      veggies.offer("green beans");
      veggies.offerFirst("beets");
      veggies.offerLast("carrots");
      //As with other collections, the size() method gives the size of the deque
      System.out.println(String.format("Length of veggies: %d", veggies.size()));
      System.out.println();
      
      //Determine if the deque contains a given object
      System.out.println(String.format("Veggies contains 'beets': %b", veggies.contains("beets")));
      System.out.println();
      
      //element() shows but does not remove the first item, throw exception if empty
      System.out.println(String.format("First veggie (element()): %s", veggies.element()));
      System.out.println(String.format("Length of veggies: %d", veggies.size()));
      System.out.println();
      
      //getFirst() same as element()
      System.out.println(String.format("First veggie (getFirst()): %s", veggies.getFirst()));
      System.out.println(String.format("Length of veggies: %d", veggies.size()));
      System.out.println();
      
      //getLast() gets but doesn't remove last item, throws exception if empty
      System.out.println(String.format("Last veggie (getLast()): %s", veggies.getLast()));
      System.out.println(String.format("Length of veggies: %d", veggies.size()));
      System.out.println();
      
      //peek() gets but does not remove the first item, returns null if empty
      System.out.println(String.format("First veggie (peek()): %s", veggies.peek()));
      System.out.println(String.format("Length of veggies: %d", veggies.size()));
      System.out.println();
      
      //peekFirst() gets but does not remove the first item, returns null if empty
      System.out.println(String.format("First veggie (peekFirst()): %s", veggies.peekFirst()));
      System.out.println(String.format("Length of veggies: %d", veggies.size()));
      System.out.println();
      
      //peekLast() gets but doesn't remove last item, returns null if empty
      System.out.println(String.format("Last veggie (peekLast()): %s", veggies.peekLast()));
      System.out.println(String.format("Length of veggies: %d", veggies.size()));
      System.out.println();
      
      //Java 5 and above
      System.out.println("--Iterating using the Enhanced for loop");
      for(String veggie : veggies) {
         System.out.println(veggie);
      }
      System.out.println();
      
      //poll() gets the first item and removes it, returns null if empty
      System.out.println(String.format("First veggie (poll()): %s", veggies.poll()));
      System.out.println(String.format("Length of veggies: %d", veggies.size()));
      System.out.println();
      
      //pollFirst() gets the first item and removes it, returns null if empty
      System.out.println(String.format("First veggie (pollFirst()): %s", veggies.pollFirst()));
      System.out.println(String.format("Length of veggies: %d", veggies.size()));
      System.out.println();
      
      //pollLast() gets the last item and removes it, returns null if empty
      System.out.println(String.format("Last veggie (pollLast()): %s", veggies.pollLast()));
      System.out.println(String.format("Length of veggies: %d", veggies.size()));
      System.out.println();
      
      System.out.println("--Iterating using the iterator");
      for(Iterator<String> it = veggies.iterator(); it.hasNext();) {
         String veggie = it.next();
         System.out.println(veggie);
      }
      System.out.println();
      
      //pop() gets and removes the first item, throws an exception if empty
      System.out.println(String.format("First veggie (pop()): %s", veggies.pop()));
      System.out.println(String.format("Length of veggies: %d", veggies.size()));
      System.out.println();
      
      //iterates starting at the end of the deque
      System.out.println("--Iterating using the descending iterator");
      for(Iterator<String> it = veggies.descendingIterator(); it.hasNext();) {
         String veggie = it.next();
         System.out.println(veggie);
      }
      System.out.println();

      //will throw exception for capacity restrictions
      veggies.push("cabbage");
      
      //Java 8 and above
      System.out.println("--Iterating with forEach");
      veggies.forEach(System.out::println);
   }

}
