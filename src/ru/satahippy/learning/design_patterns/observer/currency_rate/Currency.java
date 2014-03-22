package ru.satahippy.learning.design_patterns.observer.currency_rate;

import java.util.Observable;
import java.util.Observer;

/**
 * Basic class for currencies.
 */
public class Currency extends Observable
{
	protected String sign;
	protected double rate;

	public Currency(String sign, double rate)
	{
		this.sign = sign;
		this.rate = rate;
	}

	public void setRate(double rate)
	{
		this.rate = rate;
		setChanged();
		notifyObservers();
	}

	public double getRate()
	{
		return rate;
	}

	public String toString()
	{
		return sign + " = " + rate;
	}
}
