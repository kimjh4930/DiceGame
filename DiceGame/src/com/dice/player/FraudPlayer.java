package com.dice.player;

import com.dice.dice.Dice;

public class FraudPlayer {
	private String name;
	private int score;
	private String diceMode = "Normal";
	
	Dice fraudDice;
	
	public FraudPlayer(String name){
		this.name = name;
	}
	
	public void throwDice(){
		fraudDice = new Dice();
		setScore(fraudDice.throwDice());
	}
	public String getName(){
		return name;
	}
	public void setScore(int score){
		this.score = score;
	}
	public int getScore(){
		return score;
	}
	public void setDiceMode(String diceMode){
		this.diceMode = diceMode;
	}
	public String getDiceMode(){
		return diceMode;
	}
}