import java.util.Random;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main
{
	public static void main(String[ ] args)
		{
			
			int players = 1;
			int decks = 1;
			int shuffles = 0;
			int size, count= 0;
			int bet = 1;
			Shuffle shuffle1 = new Shuffle();
			PrintMenu printmenu1 = new PrintMenu();
			Deck deck1 = new Deck();

			Condition condition = new Condition();
			
			
						
			players = printmenu1.players(players);
			decks = printmenu1.decks(decks);
			shuffles = printmenu1.shuffles(shuffles, players, decks);
           
			size = 52 * decks; 
			int [] temp = {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7,
			 			7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10,
			 			10, 10, 10, 10, 10, 10, 10, 10, 1, 1, 1, 1};
			int [] main = new int[size];
			int [][] hands = new int [8][8]; // 8 = how many a hand can hold 7 = players + dealer
			int [] handsum = new int [8];
			int [] placeholder = new int [1];
			
			deck1.initDeck(main, temp, decks);
			//deck1.displayDeck(main);
			
			/*
			int[][] main = new int[rows][cols];
			initDeck(main, decks);*/
			
			
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			

			//while(count < shuffles){
			shuffle1.shuffleDeck(main, decks);
			//deck1.displayDeck(main);

				while((placeholder[0] < size-52 )||((decks == 1) && (placeholder[0] < 35))){ //Enter game switch cases
				deck1.dealDeck(main, hands, players, placeholder);
			
				switch(hands[0][players]){
					case 2:
							condition.show10(main, hands, handsum, players, placeholder);
							deck1.displayhands(hands, players);
							System.out.println("placeholder = " + placeholder[0]);
							break;
					case 3:
							condition.show10(main, hands, handsum, players, placeholder);
							deck1.displayhands(hands, players);
							System.out.println("placeholder = " + placeholder[0]);
							break;
					case 4:
							condition.show10(main, hands, handsum, players, placeholder);
							deck1.displayhands(hands, players);
							System.out.println("placeholder = " + placeholder[0]);
							break;
					case 5:
							condition.show10(main, hands, handsum, players, placeholder);
							deck1.displayhands(hands, players);
							System.out.println("placeholder = " + placeholder[0]);
							break;
					case 6:
							condition.show10(main, hands, handsum, players, placeholder);
							deck1.displayhands(hands, players);
							System.out.println("placeholder = " + placeholder[0]);
							break;
					case 7:
							condition.show10(main, hands, handsum, players, placeholder);
							deck1.displayhands(hands, players);
							System.out.println("placeholder = " + placeholder[0]);
							break;
					case 8:
							condition.show10(main, hands, handsum, players, placeholder);
							deck1.displayhands(hands, players);
							System.out.println("placeholder = " + placeholder[0]);
							break;
					case 9:
							condition.show10(main, hands, handsum, players, placeholder);
							deck1.displayhands(hands, players);
							System.out.println("placeholder = " + placeholder[0]);
							break;
					case 10:
							condition.show10(main, hands, handsum, players, placeholder);
							deck1.displayhands(hands, players);
							System.out.println("placeholder = " + placeholder[0]);
							break;
					case 1:
							condition.show1(main, hands, handsum, players, placeholder);
							deck1.displayhands(hands, players);
							System.out.println("placeholder = " + placeholder[0]);
							break;
					default: break;
					
			}
			deck1.displayDeck(main);
			
			
		}	//EO while loop for switch statement
			//count++;
			//} 
			
        }
        

    
  /*  
        
    static void shuffleDeck(int[] [] arr, int decks){
    	int row, col;
   		Random rand = new Random(System.currentTimeMillis());
    	for(int card = 1; card < 52; card++) {
    		row = rand.nextInt(4);
    		col = rand.nextInt(13);
    			if(arr[row][col] == 0){
    				arr[row][col] = card;
    			}
    			else{
    				while(arr[row][col] !=0) {
    					row = rand.nextInt(4);
    					col = rand.nextInt(13);
    				}
    				arr[row][col] = card;
    			}
    	}
    } 
    */
    

}

