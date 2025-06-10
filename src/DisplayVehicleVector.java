import java.util.Vector;
public class DisplayVehicleVector extends MyFrame{
	public void run() {
		Vector<Vehicle> vehicles=new Vector<Vehicle>();
		vehicles.add(new car(10,30,10,0));
	    vehicles.add(new car(200,70,-5,0));
		vehicles.add(new Train(10,110,7,0));
		vehicles.add(new Train(200,160,-7,0));
		vehicles.add(new Truck(-30,180,7,0));
		vehicles.add(new Truck(-130,240,10,0));
		
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
