import java.util.*;
public class SnakeAndLadder{
public static void main(String[] args){

	System.out.println("Lets play");
	rollDice();
	playerOption();

   }
public static int rollDice(){
	Random rand = new Random();
	int dice = rand.nextInt(6) + 1;
	return dice;
    }
public static void playerOption(){
	int position = 0;
	int counter = 0;

	while(position < 100){
	//random values for option
	int check =(int)(Math.random() * 10) % 3 + 1;
	System.out.println("check "+check);
	int dice=rollDice();
	System.out.println("Dice number "+dice);
	counter++;
	switch(check){
		//case for no play
		case 1:
			System.out.println("player is not playing "+position);
			break;	
		// case for player position after play
		case 2:
			position = position + dice;
			if(position > 100){
				position = position - dice;
			}
			System.out.println("player is playing "+position);
			break;
		//case for snake , player postion 
		default:
			position = position - dice; 
			if(position < 0){
				position = 0;
			}
			System.out.println("player is  "+position); 
      		}
	   }
                        System.out.println("total Couter to win game : "+counter);
     }
}
