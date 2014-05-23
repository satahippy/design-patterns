package ru.satahippy.learning.design_patterns.factory_method.recruit_agency;

import ru.satahippy.learning.design_patterns.factory_method.recruit_agency.agencies.Agency;
import ru.satahippy.learning.design_patterns.factory_method.recruit_agency.agencies.BuildersAgency;
import ru.satahippy.learning.design_patterns.factory_method.recruit_agency.agencies.ProgrammersAgency;

/**
 * Factory Method Design Pattern Example
 * IWorker - Product Abstraction
 * Builder, Programmer - Concrete Product
 * Agency - Creator Abstraction
 * BuildersAgency, ProgrammersAgency - Concrete Creator
 */
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Builders");
		useAgency(new BuildersAgency(new String[]{"Frima", "Guzzle"}));
		System.out.println("\nProgrammers");
		useAgency(new ProgrammersAgency(new String[]{"sata", "zasaz", "maman"}));
	}

	public static void useAgency(Agency agency)
	{
		agency.printWorkers();
	}
}