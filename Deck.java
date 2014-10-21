import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Random;


public class Deck{
	public static void initDeck(int [] arr, int [] init, int decks){
    	for(int i = 0; i < decks; i++){
    		for(int j = 0; j < 52; j++){
    			arr[j + 52 * i] = init[j];
    		}
    	}
    }
    
    public static void displayDeck(int [] arr){
    	for(int i = 0; i < arr.length; i++){
    	System.out.print(arr[i] + " ");
    	}
    }
  
    public static void dealFirstHand(int [] arr, int [][] hands, int players, int [] placeholder ){ 
    	
    	for(int i = 0; i < 2; i++){
    		for(int j = 0; j < players + 1; j++){   //players + dealer
    			hands[i][j] = arr[placeholder[0]];
				placeholder[0] = placeholder[0] + 1;
    		}	
    	}
    	
		System.out.println("Dealer is showing " + hands[0][players]);
		System.out.println("placeholder is " + placeholder[0]);
    	displayhands(hands, players);
    }
    
    public static void dealDeck(int [] arr, int [][] hands, int players, int [] placeholder ){ 
    	
    	for(int i = 0; i < 2; i++){
    		for(int j = 0; j < players + 1; j++){   //players + dealer
    			hands[i][j] = arr[placeholder[0]];
				placeholder[0] = placeholder[0] + 1;
    		}	
    	}
    	for(int i = 2; i < 8; i++){
    		for(int j = 2; j < 8; j++){   //players + dealer
    			hands[i][j] = 0;

    		}	
    	}
    	
		System.out.println("Dealer is showing " + hands[0][players]);
		System.out.println("placeholder is " + placeholder[0]);
    //	displayhands(hands, players);
    }
    
     public static void displayhands(int [][] arr, int players){
    	
    	for(int i = 0; i < 8; i++){
    		System.out.println(" ");
    		for(int j = 0; j < 7; j++)
    			System.out.print(arr[i][j] + "\t");
    	}
    }
    
    
    
    
    
    
}
    