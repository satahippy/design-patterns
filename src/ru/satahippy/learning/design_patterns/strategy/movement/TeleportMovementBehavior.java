package ru.satahippy.learning.design_patterns.strategy.movement;

import java.util.ArrayList;

/**
 * Concrete Strategy For Movement
 */
public class TeleportMovementBehavior implements IMovementBehavior
{
	public TeleportMovementBehavior()
	{
	}

	/**
	 * Main Implementation some strategy (algorithm)
	 */
	@Override
	public ArrayList<Point> getWay(Point begin, Point end)
	{
		ArrayList<Point> way = new ArrayList<Point>();

		way.add(begin);
		way.add(end);

		return way;
	}
}
