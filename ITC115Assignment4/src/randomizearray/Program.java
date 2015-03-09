package randomizearray;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

 public static void main(String[] args) {
  Program p = new Program();
  p.createArray();

 }
 
 private void createArray(){
  ArrayList<Item> myArray = new ArrayList<Item>();
  Item i = new Item("1.png");
  Item i2 =new Item("2.png");
  Item i3 =new Item("3.png");
  Item i4=new Item("4.png");
  Item i5=new Item("5.png");
  myArray.add(i);
  myArray.add(i2);
  myArray.add(i3);
  myArray.add(i4);
  myArray.add(i5);
  
  shuffle(myArray);
 }
 
 private void shuffle(ArrayList<Item> list){
  Collections.shuffle(list);
  
  for(Item i: list){
   System.out.println(i.getName());
  }
 }

}
