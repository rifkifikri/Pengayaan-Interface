
public class MainTest {
	public static void main(String[] args) {
		System.out.println("\n===========================UJI INTERFACE CLASS DRIVER============================");
		Vehicle honda= new HondaAccord();//membuat object mobil
		
		//membuat object user atau driver
		Driver suryatno= new Driver(honda);
		
		suryatno.nama();
		suryatno.akselerasi();
		suryatno.stop();
		suryatno.steering();
		suryatno.drive();
		System.out.println("==============================================================");
		
		Vehicle mercy= new MercedesC300();//membuat object jenis mobil
		
		//membuat object user atau driver
		Driver suprapto= new Driver(mercy);
		
		suprapto.nama();
		suprapto.akselerasi();
		suprapto.stop();
		suprapto.steering();
		suprapto.drive();
		System.out.println("\n===========================UJI INTERFACE CLASS HondaAccord============================");
		HondaAccord accord= new HondaAccord();
		
		accord.name();
		accord.accelerate();
		accord.brake();
		accord.steer();
		System.out.println("\n===========================UJI INTERFACE CLASS MercedesC300============================");
		
		MercedesC300 bens= new MercedesC300();
		
		bens.name();
		bens.accelerate();
		bens.brake();
		bens.steer();
	}
}
