package com.snackeladder.basic;

import java.util.Random;
public class Snakeandladder {
	
   public static void main(String[] args) {
		/*
		 * Variable defining player position in game
		 */
		int position = 0;
		int position2 = 0;
		int count_dieRoll = 0;
		int chance = 1;
		final int NO_PLAY = 1;
		final int LADDER = 2;
		final int SNAKE = 3;
  /*
   *  Random Class Object to generate Die Number between 1-6
   */
    Random random = new Random();
    
	System.out.println("Player 1 Start position is = "+position);
	System.out.println("Player 2 Start position is = "+position2);

	
	while(position != 100) {
		
		if(chance %2 == 0) {
			System.out.println("Player 1 Chance");
			int dieno = random.nextInt(6)+1;
			   System.out.println("Die Number="+dieno);
			   
			   count_dieRoll++;
			   
			  int option =  random.nextInt(3)+1;
			 System.out.println("The Player Option Number= "+option);
			   switch(option){
			  case NO_PLAY:
				 System.out.println("Option = NO_PLAy");
				  position = position;
				  break;
			  case LADDER:
				  System.out.println("OPtion = LADDER"); 
				  position = position + dieno;
				 if(position > 100) {
					  position = position - dieno;
				  }
				 chance--;
				  break;
			  case SNAKE:
				  System.out.println("Option = Snake"); 
				  position = position - dieno;
				  if(position < 0) {
					  position = 0;
			   }
				  
				  break;
			   }
				  System.out.println("New position for player 1= "+position);
				
				  
					  }
		else {
		
			System.out.println("Player 2 Chance");
      int dieno = random.nextInt(6)+1;
      System.out.println("Die Number="+dieno);
   
   count_dieRoll++;
   
  int option =  random.nextInt(3)+1;
 System.out.println("The Player Option Number= "+option);
   switch(option){
  case NO_PLAY:
	 System.out.println("Option = NO_PLAy");
	  position2 = position2;
	  break;
  case LADDER:
	  System.out.println("OPtion = LADDER"); 
	  position2 = position2 + dieno;
	 if(position2> 100) {
		  position2 = position2 - dieno;
	  }
	 chance--;
	  break;
  case SNAKE:
	  System.out.println("Option = Snake"); 
	  position2 = position2 - dieno;
	  if(position2 < 0) {
		  position2 = 0;
   }
	  break;
   }
	  System.out.println("New position for plyer 2 = "+position2);
	 
	  
		  }
		chance++;
	}
	System.out.println("Total Count of Die Roll to Win the Game ="+count_dieRoll);
	}

}


