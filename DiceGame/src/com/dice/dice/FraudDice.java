package com.dice.dice;

import java.util.Random;

public class FraudDice {
	
	private int numOfDice;
	
	Random random = new Random();
	
	public int throwDice(){
		int dice;
		
		dice = random.nextInt(6) + 1;
		
		return dice;
	}
	
	public void setDice(int numOfDice){
		this.numOfDice = numOfDice;
	}
	public int getDice(){
		return numOfDice;
	}

}
