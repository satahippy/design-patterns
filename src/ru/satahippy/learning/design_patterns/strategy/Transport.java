package ru.satahippy.learning.design_patterns.strategy;

import java.util.ArrayList;

public abstract class Transport
{
	protected IMovementBehavior movementBehavior;

	public Transport()
	{
	}

	public Transport(IMovementBehavior movementBehavior)
	{
		this.movementBehavior = movementBehavior;
	}

	public void setMovementBehavior(IMovementBehavior movementBehavior)
	{
		this.movementBehavior = movementBehavior;
	}

	public abstract void display();

	public void move(Point begin, Point end)
	{
		move(movementBehavior.getWay(begin, end));
	}

	public void move(ArrayList<Point> way)
	{
		for (Point point : way) {
			System.out.println("Move to " + point);
		}
	}

}
