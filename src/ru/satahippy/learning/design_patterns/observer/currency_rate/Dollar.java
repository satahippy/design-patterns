package ru.satahippy.learning.design_patterns.observer.currency_rate;

import java.util.Observable;

/**
 * Dollar currency
 */
public class Dollar extends Currency
{
	public Dollar(double rate)
	{
		super("$", rate);
	}
}
