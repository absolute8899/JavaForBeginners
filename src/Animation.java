
public class Animation extends MyFrame{
	public void run() {
		int x=170;
		while(x>=30) {
			clear();
			setColor(0,128,0);
			fillRect(x,80,10,100);
			x-=5;
			sleep(0.1);
		}
	}

}
