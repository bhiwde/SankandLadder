package com.snackeladder.basic;

import java.util.Random;

public class Snakeandladder {

	public static void main(String[] args) {
		/*
		 * Variable defining player position in game
		 */
		int position = 0;
		
	System.out.println("Player 1 Start position is = "+position);
  /*
   *  Random Class Object to generate Die Number between 1-6
   */
    Random random = new Random();
     int dieno = random.nextInt(6)+1;
  System.out.println(" Die Number:"+dieno);
  position = position + dieno;
  System.out.println("New Position After Rolling Die:"+position);
	}

}


