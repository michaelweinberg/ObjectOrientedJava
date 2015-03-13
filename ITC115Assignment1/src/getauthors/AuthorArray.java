package getauthors;

import java.util.Scanner;



public class AuthorArray 
{
	@SuppressWarnings("unused")
	 Scanner scan = new Scanner(System.in);
	
	//declare author variable and array
	public String author;
	
	

	String[][] books = {
	   		 {"Lord Jim", "Nostromo","Heart of Darkness"},
	   		 {"The Sound and The Fury", "As I Lay Dying","Absalom, Absalom"},
	   		 {"For Whome the Bell Tolls", "The Sun Also Rises", "The Old Man and the Sea"},
	   		 {"Howard's End","A Passage to India","A Room With a View"}
	    };
	 
	

	public void getBooks(){
		  System.out.println("Enter the author- Conrad, Faulkner, Hemmingway or Forster");
		  String author = scan.next().trim().toLowerCase();  
		  System.out.println(author);
		  
		  switch (author) {
		case "conrad":
			System.out.println("These are the books we have by Conrad");
			System.out.println(books[0][0]);
			System.out.println(books[0][1]);
			System.out.println(books[0][2]);
			break;
		case "faulkner":
		  System.out.println("These are the books we have by Faulkner");
		  System.out.println("These are the books we have by Conrad");
			System.out.println(books[1][0]);
			System.out.println(books[1][1]);
			System.out.println(books[1][2]);
			break;
		case "hemmingway":
		  System.out.println("These are the books we have by Hemmingway");
		  System.out.println(books[2][0]);
			System.out.println(books[2][1]);
			System.out.println(books[2][2]);
			break;
		case "forster":
		  System.out.println("These are the books we have by Forster");
		  System.out.println(books[3][0]);
			System.out.println(books[3][1]);
			System.out.println(books[3][2]);
			break;	
		default:
			System.out.println("That author is not in our system");
			break;
		}
	
		  
		 }
	
	
	
	
}