package com.dice.player;

import com.dice.dice.Dice;

public class Player {
	private String name;
	private int score;
	
	Dice dice;
	
	public Player(String name){
		this.name = name;
	}
	
	public void throwDice(){
		//�ֻ����� ��� ������.
		dice = new Dice();
		//������ ����
		setScore(dice.throwDice());
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

}
