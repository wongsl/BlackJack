

public class Condition{


	public static void show1(int [] main, int [][]hands, int [] handsum, int players, int [] placeholder){
	Play play1 = new Play();
		for(int i = 0; i < players; i++) {
			int hit = 2; // where the hit card is going to be placed
				handsum[i] = hands[0][i] + hands [1][i];
				//System.out.println("hand sum of player 1:" + handsum[i]);
				
					while(handsum[i] < 17){
						if(handsum[i] == 11){
							play1.doubledown(main, hands[hit][i], hit, placeholder[0]); //bet
							break;
						}
						/*if ((handsum [i] == 16) && (hands[0][i] == 8) && (hands [1][i] == 8)){
							play1.split();
						}
						if ((handsum [i] == 14) && (hands[0][i] == 7) && (hands [1][i] == 7)){
							play1.split();
						}*/
					hands[hit][i] = main[placeholder[0]];
							handsum[i] = handsum[i] + hands[hit][i];
							hit++;
							placeholder[0] = placeholder[0] + 1;
					}
		}
	
	}//EO show1

	public static void show2(int [] main, int [][]hands, int [] handsum, int players, int [] placeholder){
		Play play1 = new Play();
		for(int i = 0; i < players; i++) {
			int hit = 2; // where the hit card is going to be placed
				handsum[i] = hands[0][i] + hands [1][i];
					System.out.println(handsum[i]);
					while(handsum[i] < 17){
						if(handsum[i] == 11){
							play1.doubledown(main, hands[hit][i], hit, placeholder[0]);
							break;
						}
						if ((handsum [i] == 16) && (hands[0][i] == 8) && (hands [1][i] == 8)){
							play1.split();
						}
						if ((handsum [i] == 14) && (hands[0][i] == 7) && (hands [1][i] == 7)){
							play1.split();
						}
					
					hands[hit][i] = main[placeholder[0]];
							handsum[i] = handsum[i] + hands[hit][i];
							hit++;
							placeholder[0] = placeholder[0] + 1;
					}
		}
	
	}//EO show2

	
	public static void show3(int [] main, int [][]hands, int [] handsum, int players, int [] placeholder){
		Play play1 = new Play();
		for(int i = 0; i < players; i++) {
			int hit = 2; // where the hit card is going to be placed
				handsum[i] = hands[0][i] + hands [1][i];
				System.out.println(handsum[i]);
					while(handsum[i] < 17){
						if(handsum[i] == 11){
							play1.doubledown(main, hands[hit][i], hit, placeholder[0]);
							break;
						}
						if ((handsum [i] == 16) && (hands[0][i] == 8) && (hands [1][i] == 8)){
							play1.split();
						}
						if ((handsum [i] == 14) && (hands[0][i] == 7) && (hands [1][i] == 7)){
							play1.split();
						}
					hands[hit][i] = main[placeholder[0]];
					handsum[i] = handsum[i] + hands[hit][i];
					hit++;
					placeholder[0] = placeholder[0] + 1;
					}
		}
	
	}//EO show3


	public static void show4(int [] main, int [][]hands, int [] handsum, int players, int [] placeholder){
	Play play1 = new Play();
		for(int i = 0; i < players; i++) {
			int hit = 2; // where the hit card is going to be placed
				handsum[i] = hands[0][i] + hands [1][i];
				System.out.println(handsum[i]);
				if ((handsum [i] == 16) && (hands[0][i] == 8) && (hands [1][i] == 8)){
							play1.split();
						}
						if ((handsum [i] == 14) && (hands[0][i] == 7) && (hands [1][i] == 7)){
							play1.split();
						}
					while(handsum[i] <= 11){
						if(handsum[i] == 11){
							play1.doubledown(main, hands[hit][i], hit, placeholder[0]);
							break;
						}
						else{
							hands[hit][i] = main[placeholder[0]];
							handsum[i] = handsum[i] + hands[hit][i];
							hit++;
							placeholder[0] = placeholder[0] + 1;
						}
					}
				break;
		}
	
	}//EO show4
	
	
	public static void show5(int [] main, int [][]hands, int [] handsum, int players, int [] placeholder){
	Play play1 = new Play();
		for(int i = 0; i < players; i++) {
			int hit = 2; // where the hit card is going to be placed
				handsum[i] = hands[0][i] + hands [1][i];
				System.out.println(handsum[i]);
				if ((handsum [i] == 16) && (hands[0][i] == 8) && (hands [1][i] == 8)){
							play1.split();
						}
						if ((handsum [i] == 14) && (hands[0][i] == 7) && (hands [1][i] == 7)){
							play1.split();
						}
					while(handsum[i] <= 11){
						if(handsum[i] == 11){
							play1.doubledown(main, hands[hit][i], hit, placeholder[0]);
							break;
						}
						else{
						hands[hit][i] = main[placeholder[0]];
						handsum[i] = handsum[i] + hands[hit][i];
						hit++;
						placeholder[0] = placeholder[0] + 1;
						}
					}
				break;
		}
	
	}//EO show5
	
	
	public static void show6(int [] main, int [][]hands, int [] handsum, int players, int [] placeholder){
	Play play1 = new Play();
		for(int i = 0; i < players; i++) {
			int hit = 2; // where the hit card is going to be placed
				handsum[i] = hands[0][i] + hands [1][i];
				System.out.println(handsum[i]);
				if ((handsum [i] == 16) && (hands[0][i] == 8) && (hands [1][i] == 8)){
							play1.split();
						}
						if ((handsum [i] == 14) && (hands[0][i] == 7) && (hands [1][i] == 7)){
							play1.split();
						}
					while(handsum[i] <= 11){
						if(handsum[i] == 11){
							play1.doubledown(main, hands[hit][i], hit, placeholder[0]);
							break;
						}
						else{
						hands[hit][i] = main[placeholder[0]];
						handsum[i] = handsum[i] + hands[hit][i];
						hit++;
						placeholder[0] = placeholder[0] + 1;
						}
					}
				break;
		}
	
	}//EO show6


	public static void show7(int [] main, int [][]hands, int [] handsum, int players, int [] placeholder){
		Play play1 = new Play();
		for(int i = 0; i < players; i++) {
			int hit = 2; // where the hit card is going to be placed
				handsum[i] = hands[0][i] + hands [1][i];
				System.out.println(handsum[i]);
					while(handsum[i] < 17){
						if(handsum[i] == 11){
							play1.doubledown(main, hands[hit][i], hit, placeholder[0]);
							break;
						}
						/*if ((handsum [i] == 16) && (hands[0][i] == 8) && (hands [1][i] == 8)){
							play1.split();
						}
						if ((handsum [i] == 14) && (hands[0][i] == 7) && (hands [1][i] == 7)){
							play1.split();
						}*/
					hands[hit][i] = main[placeholder[0]];
					handsum[i] = handsum[i] + hands[hit][i];
					hit++;
					placeholder[0] = placeholder[0] + 1;
					}
		}	
	}//EO show7

	public static void show8(int [] main, int [][]hands, int [] handsum, int players, int [] placeholder){
		Play play1 = new Play();
		for(int i = 0; i < players; i++) {
			int hit = 2; // where the hit card is going to be placed
				handsum[i] = hands[0][i] + hands [1][i];
				System.out.println(handsum[i]);
					while(handsum[i] < 17){
						if(handsum[i] == 11){
							play1.doubledown(main, hands[hit][i], hit, placeholder[0]);
							break;
						}
						/*if ((handsum [i] == 16) && (hands[0][i] == 8) && (hands [1][i] == 8)){
							play1.split();
						}
						if ((handsum [i] == 14) && (hands[0][i] == 7) && (hands [1][i] == 7)){
							play1.split();
						}*/
					hands[hit][i] = main[placeholder[0]];
					handsum[i] = handsum[i] + hands[hit][i];
					hit++;
					placeholder[0] = placeholder[0] + 1;
					}
		}	
	}//EO show8
	
	public static void show9(int [] main, int [][]hands, int [] handsum, int players, int [] placeholder){
		Play play1 = new Play();
		for(int i = 0; i < players; i++) {
			int hit = 2; // where the hit card is going to be placed
				handsum[i] = hands[0][i] + hands [1][i];
				System.out.println(handsum[i]);
					while(handsum[i] < 17){
						if(handsum[i] == 11){
							play1.doubledown(main, hands[hit][i], hit, placeholder[0]);
							break;
						}
						/*if ((handsum [i] == 16) && (hands[0][i] == 8) && (hands [1][i] == 8)){
							play1.split();
						}
						if ((handsum [i] == 14) && (hands[0][i] == 7) && (hands [1][i] == 7)){
							play1.split();
						}*/
					hands[hit][i] = main[placeholder[0]];
					handsum[i] = handsum[i] + hands[hit][i];
					hit++;
					placeholder[0] = placeholder[0] + 1;
					}
		}	
	}//EO show9

	public static void show10(int [] main, int [][]hands, int [] handsum, int players, int [] placeholder){
		Deck deck1 = new Deck();
		Play play1 = new Play();
		for(int i = 0; i < players; i++) {
			int hit = 2; // where the hit card is going to be placed
				handsum[i] = hands[0][i] + hands [1][i];
				//System.out.println("handsum of player is =" + handsum[i]);
					while(handsum[i] < 17){
						if(handsum[i] == 11 && hands[2][i] == 0){
							play1.doubledown(main, hands[hit][i], hit, placeholder[0]);
							break;
						}
						/*if ((handsum [i] == 16) && (hands[0][i] == 8) && (hands [1][i] == 8)){
							play1.split();
						}
						if ((handsum [i] == 14) && (hands[0][i] == 7) && (hands [1][i] == 7)){
							play1.split();
						}*/
						else{
							hands[hit][i] = main[placeholder[0]];
							handsum[i] = handsum[i] + hands[hit][i];
							hit++;
							placeholder[0] = placeholder[0] + 1;
							//play1.hit(main, handsum[i], hands[hit][i], hit, placeholder);
							//System.out.println("hit = " + hit);
							//System.out.println("i = " + i);
							//System.out.println("placeholder = " + placeholder[0]);
						}
					}
		}

	} //EO show10





} //EOF