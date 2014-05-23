package ru.satahippy.learning.design_patterns.factory_method.recruit_agency.agencies;

import ru.satahippy.learning.design_patterns.factory_method.recruit_agency.workers.IWorker;
import ru.satahippy.learning.design_patterns.factory_method.recruit_agency.workers.Programmer;

/**
 * Concrete Creator
 */
public class ProgrammersAgency extends Agency
{
	public ProgrammersAgency(String[] names)
	{
		super(names);
	}

	// implementation of factory method
	@Override
	public IWorker createWorker()
	{
		return new Programmer();
	}
}
