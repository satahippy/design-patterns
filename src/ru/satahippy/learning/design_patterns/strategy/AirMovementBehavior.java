package ru.satahippy.learning.design_patterns.strategy;

import java.util.ArrayList;

/**
 * Concrete Strategy For Movement
 */
public class AirMovementBehavior implements IMovementBehavior
{
	protected int speed;

	/**
	 * Each Concrete Strategy  can include own parameters
	 */
	public AirMovementBehavior(int speed)
	{
		this.speed = speed;
	}

	/**
	 * Main Implementation some strategy (algorithm)
	 */
	@Override
	public ArrayList<Point> getWay(Point begin, Point end)
	{
		ArrayList<Point> way = new ArrayList<Point>();
		way.add(begin);

		if (speed > 0) {
			Point last = begin;
			while (last.x != end.x) {
				int newX = Math.min(end.x, last.x + speed);
				int newY = (int)((newX - begin.x) * (end.y - begin.y) / (end.x - begin.x)) + begin.y;
				last = new Point(newX, newY);
				way.add(last);
			}
		}

		return way;
	}
}
