
public class car extends Vehicle{
	public car(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public void draw(MyFrame frame) {
		frame.fillOval(x+10,y+25,15,15);
		frame.fillOval(x+35,y+25,15,15);
		frame.fillRect(x,y+15,60,15);
		frame.fillRect(x+10,y,40,20);

	}
}

