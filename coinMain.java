import java.util.*;

public class coinMain {

public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	//Asks the user how many time to flip the coin
	System.out.println("Please enter how many timnes you want to flip a coin: ");
	int flip = scan.nextInt();
	
	//Our number variables for heads and tails
	int numCount = 0; 
	int head = 0;
	int tail = 0;
	
	//The loop that randomizes the amount of heads or tails.
	while(numCount < flip){
		
		int headTails = rand.nextInt(2)+1; //our random heads or tails
		
		if(headTails == 1){
			tail = tail + 1;
		}
		
		else{
			head = 1 + head;
		}
		
		numCount++;
		
	}
	
	System.out.println("Heads:"+ head+" Tails:"+tail);
	
  }
}
