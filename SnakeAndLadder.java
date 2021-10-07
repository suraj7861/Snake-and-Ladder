import java.util.*;
public class SnakeAndLadder{
public static void main(String[] args){

	System.out.println("Lets play");
	// call playerOption method
	playerOption();
   }
public static int rollDice(){
	//genetates random number for die value
	Random rand = new Random();
	//declare and initialize dice 
	int dice = rand.nextInt(6) + 1;
	return dice;
    }
public static void playerOption(){

	//declare and initialize players position 
	int player1_Position = 0, player2_Position = 0;
	int player1Counter = 0;
	int player2Counter = 0;
	//use check1 fo who is playing, we start with the player1
	boolean check1 = true;
	
	while(player1_Position < 100 && player2_Position < 100){

	//random values for option
	int check = (int) (Math.random() * 10) % 3 + 1;
	System.out.println("check "+check);
	int dice = rollDice();
	System.out.println("Dice number "+dice);

	//use switch case to chose players option
	switch(check){
		//case for no play
		case 1:
			//if for player 1
			if(check1){
				System.out.println("player 1 is not playing "+player1_Position);
				check1 = false;
				player1Counter++;
			}
			// else for player 2
			else{
				System.out.println("player 2 is not playing "+player2_Position);
				check1 = true;
				 player2Counter++;
			}
			break;	

		// case for players position after play
		case 2:
			//if statment for player 1
			if(check1) {
				 //check palyer 1 position <= 100
				 if((player1_Position + dice) <= 100)
				{
					player1_Position = player1_Position + dice;

					//player 1 position should not greate than 100
					if(player1_Position > 100) {
						player1_Position -= dice;
					} 
				}
				check1 = false;
				player1Counter++;
			System.out.println("The position of player1  is  "+player1_Position);
			}
			// else statment for player 2
			else
			{
				//check palyer 2 position <= 100
				if ((player2_Position + dice) <= 100) {
					player2_Position = player2_Position + dice;
					//player 2 position should not greate than 100
					if(player2_Position > 100) {
                                                player2_Position -= dice;
                                        }
				}
				check1 = true;
				player2Counter++;
				System.out.println("Position of the player2 is "+ player2_Position);
					
			}
			break;
		//case for snake , players postion 
		default:
			//if statment for player 1
			if(check1) {
				 player1_Position = player1_Position - dice;
				 //check palyer 1 position should not be less than 0
                                 if(player1_Position < 0)
                                {
                                        player1_Position = 0;
                                }
				check1 = false;
				player1Counter++;
                        System.out.println("The position of player1  is  "+player1_Position);
                        }
			// else statment for player 2
                        else
                         {
                                 player2_Position = player2_Position - dice;
				 //check palyer 1 position should not be less than 0
                                 if(player2_Position < 0)
                                {
                                        player2_Position = 0;
                                }
				check1 = true;
				player2Counter++;
                        }
			break;
		}
			System.out.println("player 1 position is : "+player1_Position);
			System.out.println("player 2 position is : "+player2_Position); 
      	      }
	   
		//if conition for who is win!
                if(player1_Position == 100)
                {
                        System.out.println("Player1 is winner ");
                }
                else
                {
                        System.out.println("Player2 is Winner");

                }
		System.out.println("total Couter for Player 1 to win game : "+player1Counter++);
                System.out.println("total Couter for Player 2 to win game : "+player2Counter++);
     }
}
