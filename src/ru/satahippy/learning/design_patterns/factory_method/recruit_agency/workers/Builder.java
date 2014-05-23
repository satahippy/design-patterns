package ru.satahippy.learning.design_patterns.factory_method.recruit_agency.workers;

/**
 * Concrete Worker
 */
public class Builder extends BaseWorker
{
	public Builder()
	{
		super();
	}

	@Override
	public String getSpecialization()
	{
		return "builder";
	}
}