

import java.util.ArrayList;


public class Sensor implements Subject{
	
	private ArrayList<Observer> observers;
	private double temperatura;
	private double pressione;
	
	public Sensor(){
		observers = new ArrayList<Observer>();
		temperatura=0.0;
		pressione=0.0;
	}
	
	
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int obsID = observers.indexOf(o);
		observers.remove(obsID);
	}

	@Override
	public void notifyObservers() {
		for(int i=0; i<observers.size(); i++)
			observers.get(i).update(temperatura, pressione);
		
	}
	
	public void setTemperature(double t){
		this.temperatura=t;
		this.notifyObservers();
	}
	
	public void setPressure(double p){
		this.pressione=p;
		this.notifyObservers();
	}

}
