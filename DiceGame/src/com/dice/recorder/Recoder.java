package com.dice.recorder;

import java.util.ArrayList;

public class Recoder {
	
	private ArrayList<Integer> player1List, player2List;
	int sumOfPlayer1=0, sumOfPlayer2=0;
	private String player1Name, player2Name;
	private int sumOfScore1, sumOfScore2;
	
	public Recoder(){
		//»ý¼ºÀÚ
		player1List = new ArrayList<Integer>();
		player2List = new ArrayList<Integer>();
	}
	
	public void showResult(ArrayList<Integer> playerList1, ArrayList<Integer> playerList2){
		setSumOfScore1(0);
		setSumOfScore2(0);
		
		for(int i=0; i < playerList1.size(); i++){
			setSumOfScore1(getSumOfScore1() + playerList1.get(i));
			setSumOfScore2(getSumOfScore2() + playerList2.get(i));
		}
		
		System.out.println("[" +getPlayer1Name()+ " : " + getSumOfScore1()
							+ getPlayer2Name() + " : " + getSumOfScore2() + "]");
	}
	public void storeResult(String player1Name, String player2Name, int player1Score, int player2Score){
		player1List.add(player1Score);
		player2List.add(player2Score);
		
		setPlayer1Name(player1Name);
		setPlayer2Name(player2Name);
		
		showResult(player1List, player2List);
	}

	public String getPlayer1Name() {
		return player1Name;
	}

	public void setPlayer1Name(String player1Name) {
		this.player1Name = player1Name;
	}
	
	public String getPlayer2Name() {
		return player2Name;
	}

	public void setPlayer2Name(String player2Name) {
		this.player2Name = player2Name;
	}

	public int getSumOfScore1() {
		return sumOfScore1;
	}

	public void setSumOfScore1(int sumOfScore1) {
		this.sumOfScore1 = sumOfScore1;
	}

	public int getSumOfScore2() {
		return sumOfScore2;
	}

	public void setSumOfScore2(int sumOfScore2) {
		this.sumOfScore2 = sumOfScore2;
	}
}
