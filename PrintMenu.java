import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class PrintMenu{

    public static int players(int players){
     		
     		System.out.println("Enter how many players (up to 6)");
            Scanner input = new Scanner(System.in);
       		players = input.nextInt();
       		while(players > 6){
       		System.out.println("Enter how many players (up to 6)");
    		players = input.nextInt();
       		}
       		return players;
	}
    public static int decks(int decks){   		
            System.out.println("Enter how many decks");  
            Scanner input = new Scanner(System.in);
       		decks = input.nextInt();
       		while(decks > 6){
       		System.out.println("Enter how many decks (up to 6)");
    		decks = input.nextInt();
       		}
       		return decks; 
    }
    public static int shuffles(int shuffles, int players, int decks){
       		System.out.println("Playing with " + players + " players and " + decks + " decks");  
       		
       		System.out.println("Enter how many shuffles");  
       		Scanner input = new Scanner(System.in);
       		shuffles = input.nextInt();
       		
       		System.out.println("You will run through " + shuffles + " times");
			
			return shuffles;
    }
       
}
    