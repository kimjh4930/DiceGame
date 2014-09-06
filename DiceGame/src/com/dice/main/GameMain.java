package com.dice.main;

import java.util.Scanner;

import com.dice.judge.Judge;


public class GameMain {
	private static Scanner scan;

	public static void main(String args[]){
		
		String player1Name, player2Name;
		int times;
		
		scan = new Scanner(System.in);
		System.out.print("1st Player Name : ");
		player1Name = scan.nextLine();
		System.out.print("2nd Palyer Name : ");
		player2Name = scan.nextLine();
		System.out.print("game set : ");
		times = scan.nextInt();		//����Ƚ��
		
		Judge judge = new Judge();
		
		judge.registerPlayer(player1Name, player2Name);			//�������, �̸����� ���
		
		int index=0;
		
		while(index != times){
			judge.playGame();
			judge.Result();
			index++;
		}	
	}
}
