
public class Device implements Observer{

	private static int globalID = 0;
	int observerID;
	double temperature;
	double pressure;
	
	public Device (double t, double p){
		this.temperature = t;
		this.pressure = p;
		observerID = ++globalID;
	}
	
	
	@Override
	public void update(double temperatura, double pressione) {
		System.out.println("Station " + observerID + 
					"\nTemperature: " + temperatura 
					+ "\nPressure: " + pressione + "\n" );
	}

}
