import java.util.Random;

public class Shuffle{
 
    public static void shuffleDeck(int [] arr, int decks){
    
    Deck deck1 = new Deck();
    
    int position;
    int [] tempdeck = new int [52 * decks];
    Random rand = new Random(System.currentTimeMillis());
    	//deck1.displayDeck(arr);

    	for(int card = 0; card < 52 * decks; card++){
    		position = rand.nextInt(52 * decks);
    			if(tempdeck[position] == 0){
    				tempdeck[position] = arr[card];	
    			}
    			else{
    				while(tempdeck[position] !=0) {
    				position = rand.nextInt(52 * decks);
    				}
    				tempdeck[position] = arr[card];
    			
    				
					/*System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
    				deck1.displayDeck(tempdeck);*/
    			}
    	}
    	for(int card = 0; card < 52 * decks; card++){
    		arr[card] = tempdeck[card];
    	}
    /*System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
    deck1.displayDeck(arr);*/
    	
    }
}


 /*   public static void shuffleCard(int [] arr, int decks){
    int position;
    int tempdeck = new int [52 * decks];
    Random rand = new Random(System.currentTimeMillis());
    
    	for(int card = 0; card < 52 * decks; card++){
    		position = rand.nextInt(52 * decks);
    			if(tempdeck[position] == 0){
    				tempdeck[position] = arr[card];	
    			}
    			else{
    				while(tempdeck[position] !=0) {
    				position = rand.nextInt(52 * decks);
    				}
    				tempdeck[position] = arr[card];
    	}
    	for(card = 0; card < 52 * decks; card++){
    		arr[card] = tempdeck[card];
    	}
    
    
    	}
    }
}
*/
