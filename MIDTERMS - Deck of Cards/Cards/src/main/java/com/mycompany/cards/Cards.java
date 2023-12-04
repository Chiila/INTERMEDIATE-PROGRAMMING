package com.mycompany.cards;

import java.util.Scanner;
import java.util.Random;

public class Cards {
    
	public static void main(String[] args) {
		Menu();
	}
	public static void Menu () {
		Scanner in = new Scanner(System.in);
		
		System.out.println("DUDAY AND ESTER'S RANDOM CARDS");
		System.out.println("-----------------------------");
		System.out.println("Do you want to play cards?");
		System.out.println("[Start]");
		System.out.println("[Exit]");
		
		System.out.println("------------------------------");
		String pick = in.next().toLowerCase();
		
		if(pick.equals("start")) {
			Cards.Start();
		}
		else if (pick.equals("exit")) {
			System.exit(0);
		}
		else {
			System.out.println("None of the choices,try again");
			Cards.Menu();
		}
	}
	public static void Start () {
		Scanner in = new Scanner(System.in);
		
		System.out.println("------------------------------");
		System.out.println("Ready to pick your cards?");
		
		System.out.println("[Play]");
		System.out.println("[Cancel]");
		System.out.println("[Exit}");
		
		System.out.println("------------------------------");
		String pick = in.next();
		
		if(pick.equals("play")) {
			Cards.Shuffle();
		}
		else if (pick.equals("cancel")) {
			Cards.Menu();
		}
		else if (pick.equals("exit")) {
			System.exit(0);
		}
		else {
			System.out.println("None of the choices, try again");
			Cards.Start();
		}
	}
	public static void Shuffle() {
		String[] SUITS = {"Clubs", "Hearts", "Spades", "Diamonds"};
		String[] ROWS = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9","10", "Jack", "Queen", "King"};
		Random shfl = new Random();
		
		System.out.println("------------------------------");
			for (int i = 0; i < 4; i++){
				int S = shfl.nextInt(SUITS.length);
				int R = shfl.nextInt(ROWS.length);
            
				System.out.println(ROWS [R] + " of " + SUITS [S]);
		}
			System.out.println("------------------------------");
			Cards.Replay(); 
	}
	public static void Replay() {
		
		System.out.println("------------------------------");
		System.out.println("Want to play again?");
		
		System.out.println("[Yes]");
		System.out.println("[No]");
		
		System.out.println("------------------------------");
		Scanner in = new Scanner(System.in);
		String pick = in.next().toLowerCase();
		
		if(pick.equals("yes")) {
			System.out.println("------------------------------");
			System.out.println("Shuffling...TADAHHH!");
			Cards.Shuffle();
		}
		else if (pick.equals("no")) {
			System.out.println("Thank you, don't play again.");
			System.exit(0);
		}
		else {
			System.out.println("[ERROR] Choose YES or NO only");
		}
	}
}