import java.util.Vector;

public class DisplayCarVector extends MyFrame{
	public void run() {
		Vector<car> cars=new Vector<car>();
		cars.add(new car(50,50,1,0));
		cars.add(new car(50,160,2,0));
		cars.add(new car(50,270,3,0));
		cars.add(new car(50,380,4,0));
		cars.add(new car(50,490,5,0));
		
		for(int i=0;i<100;i++) {
			clear();
			
			for(int j=0;j<cars.size();j++) {
				cars.get(j).draw(this);
				cars.get(j).move();
			}
			
			sleep(0.1);
		}
	}

}
