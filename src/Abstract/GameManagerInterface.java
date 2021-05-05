package Abstract;

import Entities.Game;

public interface GameManagerInterface {
	void addGame(Game game);
	
	void addMultipleGame(Game[] games);
	
	void deleteGame(Game game);
	
	void deleteMultipleGame(Game[] games);
	
	void showGameProperties(Game game);
}
