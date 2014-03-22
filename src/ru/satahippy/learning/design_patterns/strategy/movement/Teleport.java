package ru.satahippy.learning.design_patterns.strategy.movement;

/**
 * implementation of Transport with fixed movement behavior
 */
public class Teleport extends Transport
{
	public Teleport()
	{
		super();
		this.movementBehavior = new TeleportMovementBehavior();
	}

	/**
	 * disable dynamic change movement behavior
	 */
	public void setMovementBehavior(IMovementBehavior movementBehavior)
	{
	}

	public void display()
	{
		System.out.println("Here comes teleport!");
	}

}
