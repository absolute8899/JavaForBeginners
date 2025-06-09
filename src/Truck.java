
public class Truck extends Vehicle{

	public Truck(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public void draw(MyFrame frame) {
		frame.fillRect(x+50,y+100,150,40);
		frame.fillRect(x+160,y+60,40,40);
		frame.fillOval(x+170,y+135,20,20);
		frame.fillOval(x+80,y+135,20,20);
		frame.fillOval(x+60,y+135,20,20);
	}
		
	

}
