package Concrete;

import Abstract.GameManagerInterface;
import Entities.Game;

public class GameManager implements GameManagerInterface{

	@Override
	public void addGame(Game game) {
		System.out.println("Oyun eklendi");
		System.out.println("Eklenen oyun bilgileri:");
		showGameProperties(game);
	}

	@Override
	public void addMultipleGame(Game[] games) {
		for(Game game : games) {
		System.out.println("Oyun eklendi");
		System.out.println("Eklenen oyun bilgileri:");
		showGameProperties(game);
		}
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println("Oyun silindi");
		System.out.println("Silinen oyun bilgileri:");
		showGameProperties(game);
	}

	@Override
	public void deleteMultipleGame(Game[] games) {
		for(Game game : games) {
		System.out.println("Oyun silindi");
		System.out.println("Silinen oyun bilgileri:");
		showGameProperties(game);	
		}
	}

	@Override
	public void showGameProperties(Game game) {
		System.out.println("\tGame name: " + game.getName()
							+"\n\tGame producer: " + game.getProducer()
							+"\n\tGame publisher: " + game.getPublisher()
							+"\n\tGame release date: " + game.getReleaseDate()
							+"\n\tGame price: " + game.getPrice()
							+"\n\tGame stock amount: " + game.getStockAmount());
	}
}
