package ru.satahippy.learning.design_patterns.observer.currency_rate;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Observer for currency rate. Watch currency and notify if its rate more or less needed value.
 */
public class Notifier implements Observer
{
	final static int MODE_MORE = 0;
	final static int MODE_LESS = 1;

	protected Currency currency;
	protected int mode;
	protected double rate;
	protected String text;

	public Notifier(Currency currency, int mode, double rate, String text)
	{
		this.currency = currency;
		this.mode = mode;
		this.rate = rate;
		this.text = text;
		currency.addObserver(this);
	}

	@Override
	public void update(Observable object, Object arg)
	{
		if (object == currency && shouldShowNotify()) {
			showNotify();
			currency.deleteObserver(this);
		}
	}

	protected boolean shouldShowNotify()
	{
		if (mode == MODE_MORE && currency.getRate() > rate) {
			return true;
		}
		if (mode == MODE_LESS && currency.getRate() < rate) {
			return true;
		}
		return false;
	}

	protected void showNotify()
	{
		System.out.println(text);
		Toolkit.getDefaultToolkit().beep();
	}
}