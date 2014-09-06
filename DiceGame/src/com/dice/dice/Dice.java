package com.dice.dice;

import java.util.Random;

public class Dice {
	
	private int numOfDice;
	
	Random random = new Random();
	
	public int throwDice(){
		int dice;
		
		dice = random.nextInt(6) + 1;	// 1~6까지의 임의의 수를 산출해서 dice에 대입
		
		return dice;
	}
	
	public void setDice(int numOfDice){
		this.numOfDice = numOfDice;
	}
	
	public int getDice(){
		return numOfDice;
	}

}
