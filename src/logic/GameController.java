package logic;

import entity.Player;

public class GameController {
	private static Player player1,player2;
	private static GameMap gameMap;
	
	public static void initializeMap() {
		player1 = new Player("Good",3,1);
		player2 = new Player("Nut",3,1);
		gameMap = new GameMap();
	}
	public boolean isWin() {
		if(player1.l)
	}
	
}
