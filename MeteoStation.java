
public class MeteoStation {
	
	public static void main(String [] args){
		
		Sensor s = new Sensor();
		
		Observer o1 = new Device(0.0, 0.0);
		Observer o2 = new Device(0.0, 0.0);	
		
		s.addObserver(o1);
		
		s.setTemperature(17.5);
		
		s.addObserver(o2);
		
		s.setPressure(1015.2);
		
		
	}
	
}
