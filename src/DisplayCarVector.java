import java.util.Vector;

public class DisplayCarVector extends MyFrame{
	public void run() {
		Vector<car> cars=new Vector<car>();
		int r=5;
		cars.add(new car(50,50,5,0));
		cars.add(new car(50,100,6,0));
		cars.add(new car(50,150,7,0));
		cars.add(new car(50,200,8,0));
		cars.add(new car(50,250,9,0));
		
		for(int i=0;i<1000;i++) {
			clear();
			
			for(int j=0;j<cars.size();j++) {
				cars.get(j).draw(this);
				cars.get(j).move();
				//if(cars.get(j).r >= 69){
				//	cars.get(j).p = 0;
				//}
			}
			
			sleep(0.1);
		}
	}

}
