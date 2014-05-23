package ru.satahippy.learning.design_patterns.factory_method.recruit_agency.agencies;

import ru.satahippy.learning.design_patterns.factory_method.recruit_agency.workers.Builder;
import ru.satahippy.learning.design_patterns.factory_method.recruit_agency.workers.IWorker;

/**
 * Concrete Creator
 */
public class BuildersAgency extends Agency
{
	public BuildersAgency(String[] names)
	{
		super(names);
	}

	// implementation of factory method
	@Override
	public IWorker createWorker()
	{
		return new Builder();
	}
}
