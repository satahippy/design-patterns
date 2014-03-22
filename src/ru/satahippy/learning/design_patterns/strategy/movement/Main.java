package ru.satahippy.learning.design_patterns.strategy.movement;


/**
 * Strategy Design Pattern Example
 * IMovementBehavior is a Strategy Interface. LandMovementBehavior, AirMovementBehavior, TeleportMovementBehavior implements this interface. These are Concrete Strategies.
 * Transport is a Abstract Context. Car, Airplane, Teleport it child. Each of these has it own way to work with strategy.
 */
public class Main
{
	public static void main(String[] args)
	{
		Point start = new Point(0, 0);
		Point finish = new Point(20, 40);

		// standard usecase
		Transport car = new Car(new LandMovementBehavior(5));
		car.display();
		car.move(start, finish);

		// default behavior
		Transport plain = new Airplane(10);
		plain.display();
		plain.move(start, finish);

		// fixed behavior
		Transport teleport = new Teleport();
		teleport.display();
		teleport.move(start, finish);
	}
}
