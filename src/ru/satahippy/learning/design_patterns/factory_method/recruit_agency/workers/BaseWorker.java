package ru.satahippy.learning.design_patterns.factory_method.recruit_agency.workers;

/**
 * Base Worker. Just for help.
 */
abstract public class BaseWorker implements IWorker
{
	protected String name;

	public BaseWorker()
	{
	}

	@Override
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String getName()
	{
		return name;
	}
}
