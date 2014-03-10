package ru.satahippy.learning.design_patterns.strategy;

import java.util.ArrayList;

/**
 * Concrete Strategy For Movement
 */
public class LandMovementBehavior implements IMovementBehavior
{
	protected int maxSpeed;

	/**
	 * Each Concrete Strategy  can include own parameters
	 */
	public LandMovementBehavior(int maxSpeed)
	{
		this.maxSpeed = maxSpeed;
	}

	/**
	 * Main Implementation some strategy (algorithm)
	 */
	@Override
	public ArrayList<Point> getWay(Point begin, Point end)
	{
		ArrayList<Point> way = new ArrayList<Point>();
		way.add(begin);

		if (maxSpeed > 0) {
			Point last = begin;
			while (last.x != end.x || last.y != end.y) {
				last = new Point(last.x + randomBetween(Math.min(1, end.x - last.x), Math.min(maxSpeed, end.x - last.x)), last.y + randomBetween(Math.min(1, end.y - last.y), Math.min(maxSpeed, end.y - last.y)));
				way.add(last);
			}
		}

		return way;
	}

	protected int randomBetween(int lower, int upper)
	{
		return (int)(Math.random() * (upper - lower) + lower);
	}
}
