package ru.satahippy.learning.design_patterns.factory_method.recruit_agency.workers;

/**
 * Concrete Worker
 */
public class Programmer extends BaseWorker
{
	public Programmer()
	{
		super();
	}

	@Override
	public String getSpecialization()
	{
		return "programmer";
	}
}