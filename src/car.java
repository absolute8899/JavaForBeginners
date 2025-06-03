
public class car {
	int x,y,vx,vy;
	public car(int x,int y,int vx,int vy) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame frame) {
		frame.fillOval(x+10,y+30,30,30);
		frame.fillOval(x+90,y+30,30,30);
		frame.fillRect(x,y,120,30);
		frame.fillRect(x+25,y-40,80,40);

	}
	public void move() {
		x+=vx;
		//y+=vy;
	}

}

