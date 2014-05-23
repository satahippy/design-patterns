package ru.satahippy.learning.design_patterns.factory_method.recruit_agency.agencies;

import ru.satahippy.learning.design_patterns.factory_method.recruit_agency.workers.IWorker;

/**
 * Abstract Creator
 */
abstract public class Agency
{
	protected String[] names;

	public Agency(String[] names)
	{
		this.names = names;
	}

	// some functionality depends only on Product Abstraction (IWorker)
	public void printWorkers()
	{
		for (int i = 0; i < names.length; i++) {
			IWorker worker = createWorker();
			worker.setName(names[i]);
			System.out.println(worker.getName() + " a " +  worker.getSpecialization());
		}
	}

	// factory method. should be implemented by inheritor
	abstract public IWorker createWorker();
}