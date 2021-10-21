package com.workshop2.Deckofcards;
import java.util.ArrayList;
import java.util.Scanner;

public class DeckOfCardsGame {
	    public static final Scanner scanner = new Scanner(System.in);
	    public ArrayList<String> cardsDeck = new ArrayList<>();

	        /*
	        Simply created a Welcome Message Method without any return type.
	        */
	    public void welcome() {
	        System.out.println("Welcome to the gaming world of Deck of Cards");
	    }

	        /*
	        In this method we have initialized the size of cards.
	        In this I have created String type array of Suits and Ranks to store its value and initialize it.
	        In this we are printing the size of card.
	        In this method we are also printing all the possible combination of card.
	        */
	        public void deckOfCards() {
	        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"};
	        int numOfCards = suits.length * ranks.length;
	        System.out.println("\nNumber of cards in the deck is : " + numOfCards);
	        for (int i = 0; i < ranks.length; i++) {       // First we have to itterate for loop for ranks starting from index 0.
	            for (int j = 0; j < suits.length; j++) {   // Now we have to ittreate the suits for all the indexes of ranks
	                cardsDeck.add(ranks[i] + "----->" + suits[j]);
	            }
	        }
	        toDisplay(cardsDeck);
	    }

	        /*
	        Created a display method to print the array list of cardsDeck.
	        We are using for-each loop to print all the element of ArrayList.
	        We are storing all the elements of cardsDeck arraylist in element.
	        */
	        public static void toDisplay(ArrayList<String> cardsDeck) {
	        System.out.println("\nCards in Deck:");
	        for (String element : cardsDeck) {
	            System.out.println(element);
	        }
	        System.out.println();
	    }

	        /*
	        In this we have to define no of players should be minimum 2 and maximum 4.
	        So we have use if condition to define no of players.
	        If no of player is not within the range then it will again call this method.
	        */
	        public void noOfPlayers() {
	        System.out.print("\nEnter number of players minimum 2 , maximum 4 : ");
	        int player = scanner.nextInt();
	        if (player >= 2 && player <= 4) {
	            System.out.println("\n" + player + " players will play the game");
	            sequenceOfPlay(player);
	        } else {
	            System.out.println("Please enter number of players in the Range");
	            noOfPlayers();
	        }
	        scanner.close();
	    }

	        /*
	         method we have defined the sequence of the player.
	        We are iterating the loop till player input.
	        */
	    public void sequenceOfPlay(int player) {
	        System.out.println("\nSequence of cards are below : ");
	        for (int i = 1; i <= player; i++) {
	            System.out.println("\nPlayer " + i + " Getting card..");
	        }
	    }
	
	   
	    }
	

