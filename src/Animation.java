
public class Animation extends MyFrame{
	public void run() {
		int x=30;
		while(true) {
			clear();
			setColor(0,128,0);
			fillRect(x,80,10,100);
			x+=5;
			if(x>200) {
				break;
			}
			sleep(0.1);
		}
	}

}
