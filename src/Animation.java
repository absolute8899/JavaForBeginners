
public class Animation extends MyFrame{
	public void run() {
		int y=100;
		while(y<=200) {
			clear();
			setColor(0,128,0);
			fillRect(30,y,10,100);
			y-=5;
			sleep(0.1);
		}
	}

}
