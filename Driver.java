
public class Driver {
	private Vehicle vehicle;
	 
		public Driver(Vehicle vehicle) {
			this.vehicle=vehicle;
		}
		void drive() {
			System.out.println("Driver");
		}
		void nama() {
			this.vehicle.name();
		}
		
		void akselerasi() {
			this.vehicle.accelerate();
		}
		void stop() {
			this.vehicle.brake();
		}
		void steering() {
			this.vehicle.steer();
		}
}