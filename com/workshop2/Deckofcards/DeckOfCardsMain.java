package com.workshop2.Deckofcards;

public class DeckOfCardsMain {


	public static void main(String[] args) {
		 DeckOfCardsGame deckOfCardsGame = new DeckOfCardsGame();
	        deckOfCardsGame.welcome();
	        deckOfCardsGame.deckOfCards();
	        deckOfCardsGame.noOfPlayers();
	        int player = 2;
			deckOfCardsGame.sequenceOfPlay(player);
	        DeckOfCardsGame.toshuffle();
	    

	}

}
