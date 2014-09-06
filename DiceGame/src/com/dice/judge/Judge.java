package com.dice.judge;

import com.dice.player.FraudPlayer;
import com.dice.player.Player;
import com.dice.recorder.Recoder;

public class Judge {
	
	//선수등록
	Player player1;
	FraudPlayer player2;
	//점수판
	private int scoreOfPlayer1;
	private int scoreOfPlayer2;
	//Recoder
	Recoder recoder;
	
	public void registerPlayer(String player1Name, String player2Name){
		player1 = new Player(player1Name);
		player2 = new FraudPlayer(player2Name);
		recoder = new Recoder();
	}
	
	public void playGame(){
		
		//주사위를 던진다.
		player1.throwDice();
		player2.throwDice();
		
		//주사위 기록을 확인
		setScoreOfPlayer1(player1.getScore());
		setScoreOfPlayer2(player2.getScore());
	}
	
	public void Result(){
		recoder.storeResult(getPlayers1Name(player1), getPlayers2Name(player2),
							getScoreOfPlayer1(), getScoreOfPlayer2());
	}
	
	public void setScoreOfPlayer1(int score){
		scoreOfPlayer1 = score;
	}
	public int getScoreOfPlayer1(){
		return scoreOfPlayer1;
	}
	public void setScoreOfPlayer2(int score){
		scoreOfPlayer2 = score;
	}
	public int getScoreOfPlayer2(){
		return scoreOfPlayer2;
	}
	public String getPlayers1Name(Player player){
		return player.getName();
	}
	public String getPlayers2Name(FraudPlayer player){
		return player.getName();
	}

}
