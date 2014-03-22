package ru.satahippy.learning.design_patterns.strategy.movement;

/**
 * Simple implementation of Transport
 */
public class Car extends Transport
{
	public Car()
	{
		super();
	}

	public Car(IMovementBehavior movementBehavior)
	{
		super(movementBehavior);
	}

	public void display()
	{
		System.out.println("Here comes car!");
	}

}
