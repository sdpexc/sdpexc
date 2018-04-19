
public class Facade implements Device {
	public Tuner tuner;
	public CdPlayer cd;
	public DvdPlayer dvd;
	public Projector projector;
	public Amplifier amplifier;
	public Lights light;
public void off(){
	tuner.off();
	cd.off();
	dvd.off();
	projector.off();
	amplifier.off();
	light.off();
}

@Override
public void on() {
	tuner.on();
	cd.on();
	dvd.on();
	projector.on();
	amplifier.on();
	light.on();
	
}


}
	


