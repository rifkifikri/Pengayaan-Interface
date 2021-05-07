
public class MercedesC300 implements Vehicle{
	public void name() {
		System.out.println("Mercedes Bens C300 AMG");
	}
	
	public void accelerate() {
		System.out.println("Mesin: M274 1.991cc, 4 silinder turbo");
		System.out.println("Accelerasi 0-100 km: 5,9 detik");
		System.out.println("Tenaga : 255 hp, Torsi: 370 Nm");
	}
	public void brake() {
		System.out.println("Rem depan: Cross Drilled Ventilated Disc");
		System.out.println("Rem Belakang: Disc Brake");
		System.out.println("jarak pemgereman: 15,4 meter");
		System.out.println("dilengkapi vitur Active Brake Assist, "
				+ "dan vitur Anti-lock Breaking System(ABS)");
	}
	public void steer() {
		System.out.println("steering: power Steering Electric C-Class, "
				+ "Electronic Power Steering, Tilt Steering "
				+ "dan Telescopic Steering");
	}
}
