
package Assignment1;

/**
 *
 * @author sujit
 */
    
abstract class Vehicle {
	public abstract void start();
	public abstract void stop();
}








public class Absclass {

	public static void main(String[] args) {
		// create an objects
		Motorcycle bike = new Motorcycle();
		Car car = new Car();
		
		// call methods
		bike.start();
		bike.stop();
		
		car.start();
		car.stop();
	}
}

    

