import java.util.Vector;

public class DisplayCarVector extends MyFrame{
	public void run() {
		Vector<car> cars=new Vector<car>();
		cars.add(new car(50,50,5,0));
		cars.add(new car(50,100,6,0));
		cars.add(new car(50,150,7,0));
		cars.add(new car(50,200,8,0));
		cars.add(new car(50,250,9,0));
		
		for(int i=0;i<70;i++) {
			clear();
			
			for(int j=0;j<cars.size();j++) {
				cars.get(j).draw(this);
				cars.get(j).move();
			}
			
			sleep(0.1);
		}
	}

}
