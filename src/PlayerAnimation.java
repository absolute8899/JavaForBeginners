
public class PlayerAnimation extends MyFrame{
	public void run() {
		car player = new car(100,200,0,0);
		addKeyListener(player);
		while(true) {
			clear();
			player.draw(this);
			player.move();
			sleep(0.01);
		}
	}

}
