package Abstract;

import Entities.Gamer;

public interface GamerManagerInterface {
	void register(Gamer gamer);
	
	void multipleRegister(Gamer[] gamers);
	
	void unregister(Gamer gamer);
	
	void multipleUnregister(Gamer[] gamers);
	
	void updateInformation(Gamer gamer);
	
	void showGamerProperties(Gamer gamer);
}
