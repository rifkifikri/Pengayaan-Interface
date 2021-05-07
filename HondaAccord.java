
public class HondaAccord implements Vehicle{
	public void name() {
		System.out.println("Honda Accord");
	}
	
	public void accelerate() {
		System.out.println("Accelerasi: 2.494CC 4 silinder Dual VVTi");
		System.out.println("Tenaga : 190 dk, Torsi: 260 Nm");
	}
	public void brake() {
		System.out.println("Rem depan: Cross Drilled Ventilated Disc");
		System.out.println("Rem Belakang: Disc Brake");
		System.out.println("jarak pemgereman: 38,4 meter");
		System.out.println("dilengkapi vitur Anti-lock Breaking System(ABS)"
				+ " dan Electronic Breake-forcw System(EBD)");
	}
	public void steer() {
		System.out.println("steering: Electronic Power Steering, Tilt Steering "
				+ "dan Telescopic Steering");
	}
}
