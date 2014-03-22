package ru.satahippy.learning.design_patterns.observer.currency_rate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

/**
 * Observer for currency rate. Just log out currency value each time it changed.
 */
public class Logger implements Observer
{
	@Override
	public void update(Observable object, Object arg)
	{
		if (object instanceof Currency) {
			showCurrencytRate((Currency)object);
		}
	}

	public void showCurrencytRate(Currency currency)
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date) + " " + currency.getClass().getSimpleName() + ": " + currency.toString());
	}
}
