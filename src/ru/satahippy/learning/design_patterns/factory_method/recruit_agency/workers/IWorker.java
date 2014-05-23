package ru.satahippy.learning.design_patterns.factory_method.recruit_agency.workers;

/**
 * Interface of Worker.
 * It's all what client need to know.
 */
public interface IWorker
{
	public void setName(String name);
	public String getName();
	public String getSpecialization();
}