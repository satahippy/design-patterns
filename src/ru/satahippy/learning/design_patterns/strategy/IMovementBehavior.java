package ru.satahippy.learning.design_patterns.strategy;

import java.util.ArrayList;

/**
 * Interface for all strategies
 */
public interface IMovementBehavior
{
	public ArrayList<Point> getWay(Point begin, Point end);
}
