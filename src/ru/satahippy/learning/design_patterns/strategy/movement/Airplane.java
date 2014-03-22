package ru.satahippy.learning.design_patterns.strategy.movement;

/**
 * implementation of Transport with default movement behavior
 */
public class Airplane extends Transport
{
	public Airplane()
	{
		super();
	}

	public Airplane(int speed)
	{
		super();
		setMovementBehavior(new AirMovementBehavior(speed));
	}

	public Airplane(IMovementBehavior movementBehavior)
	{
		super(movementBehavior);
	}

	public void display()
	{
		System.out.println("Here comes airplane!");
	}

}
