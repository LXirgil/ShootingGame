
public class GameFrame extends MyFrame{
	public void run() {
		addKeyListener(GameWorld.player);
		while(true) {
			clear();
			GameWorld.player=new Player(100,300,0,0);
			GameWorld.player.draw(this);
			sleep(0.03);
		}
	}
}
