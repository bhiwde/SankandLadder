package com.snackeladder.basic;

import java.util.Random;
public class Snakeandladder {
   public static void main(String[] args) {
		/*
		 * Variable defining player position in game
		 */
		int position = 0;
		
		final int NO_PLAY = 1;
		final int LADDER = 2;
		final int SNAKE = 3;
  /*
   *  Random Class Object to generate Die Number between 1-6
   */
    Random random = new Random();
	System.out.println("Player 1 Start position is = "+position);
	
    int dieno = random.nextInt(6)+1;
   System.out.println("Die Number="+dieno);
   
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
	  break;
  case SNAKE:
	  System.out.println("Option = Snake"); 
	  position = position - dieno;
	  if(position < 0) {
		  position = 0;
   }
	  break;
   }
	  System.out.println("New position= "+position);
	  
		  }
	}




