import java.util.Vector;
public class DisplayVehicleVector extends MyFrame{
	public void run() {
		Vector<Vehicle> vehicles=new Vector<Vehicle>();
		vehicles.add(new car(10,30,3,0));
	    vehicles.add(new car(200,100,-5,0));
		vehicles.add(new Train(10,150,7,0));
		vehicles.add(new Train(200,250,-7,0));
		vehicles.add(new Truck(10,200,7,0));
		vehicles.add(new Truck(200,300,-7,0));
		
		for(int i=0;i<100;i++) {
			clear();
			for(int j=0;j<vehicles.size();j++){
				vehicles.get(j).draw(this);
				vehicles.get(j).move();
			}
			sleep(0.1);
		}
	}

}
