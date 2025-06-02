
public class DisplayFaceObject extends MyFrame{
	public void run() {
		Face face1=new Face(50,50,10,5);
		Face face2=new Face(200,100,-10,-5);
		for(int i=0; i<30; i++) {
			clear();
			face1.draw(this);
			face2.draw(this);
			face1.move();
			face2.move();
			sleep(0.1);
		}
		
//		Face face2=new Face(200,50);
//		face2.x=250;
//		face2.y=80;
//		face2.draw(this);
//		
//		Face face3=new Face(120,120);
//		face3.x=200;
//		face3.y=150;
//		face3.draw(this);
	}

}
