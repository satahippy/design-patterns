package ru.satahippy.learning.design_patterns.observer.currency_rate;

/**
 * Observer impliment examples using java api (java.util.Observable and java.util.Observer).
 * Currency is a basic class for Dollar, Ruble and Yuan.
 */
public class Main
{
	public static int updatePeriod = 1000;
	public static double minRateAdd = -5;
	public static double maxRateAdd = 5;

	public static void main(String[] args)
	{
		Dollar dollar = new Dollar(5);
		Currency ruble = new Currency("р.", 30);

		Logger logger = new Logger();
		dollar.addObserver(logger);
		ruble.addObserver(logger);

		Notifier rubNorifier = new Notifier(ruble, Notifier.MODE_MORE, 50, "Oh my god! The ruble is fall!");
		Notifier dolNorifier = new Notifier(dollar, Notifier.MODE_LESS, 0, "What's going on?!");

		simulateRateLife(dollar);
		simulateRateLife(ruble);
	}

	protected static Thread simulateRateLife(final Currency currency)
	{
		Thread thread = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				try {
					while (true) {
						currency.setRate(currency.getRate() + getRateAdd());
						Thread.sleep(updatePeriod);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();

		return thread;
	}


	protected static double getRateAdd()
	{
		return Math.random() * (maxRateAdd - minRateAdd) + minRateAdd;
	}
}