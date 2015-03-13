package arraysandloops;

import java.util.Random;

public class LoopsAndRandoms {
 
 final int SIZE = 25;
 final int MAXRANDOM = 500;

 public static void main(String[] args) {
	 LoopsAndRandoms p = new LoopsAndRandoms();
  p.createArrays();

 }//end main

 //Let's get a set of random numbers
 private int getRandom() {
  Random r = new Random();
  int number = r.nextInt(MAXRANDOM);
  return number;
 }//end random

 private void createArrays() {
  int[] odder = new int[SIZE];
  int[] evener = new int[SIZE];
  populateArrays(odder,evener);
 }//end createArrays

 private int populateArrays(int[] odd, int[] even) {
  int oddCounter = 0, evenCounter = 0;

  for (int i = 0; i < SIZE; i++) {

   int num = getRandom();
            
   //this writes the numbers to
   //the large array if they are
   //greater than 250
   //otherwise it writes them to
   //the smaller array
   if (num % 2 == 1) {
    odd[oddCounter] = num;
    oddCounter++;
   }//end if
   else {
    even[evenCounter] = num;
    evenCounter++;
   }//end else

  }//end for
  displayArrays(odd, even);
return evenCounter;

 }//end populateArrays
 
 private void displayArrays(int[] odd, int[] even){
	 System.out.println("There are " + even.length + "random even numbers");
  for(int i = 0; i<25; i++){
   if(odd[i] != 0){
    System.out.println(even[i]);
  }//end if
   
   
  }//end for
  System.out.println("There are " + odd.length + " random odd numbers");
  int x=0;
   while(x < odd.length){
    if(odd[x] != 0){
     System.out.println(odd[x]);
     x++;
    }//end if
   }//end while
   
   
  
 }

}//end class
