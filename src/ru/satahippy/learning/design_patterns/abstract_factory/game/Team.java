package ru.satahippy.learning.design_patterns.abstract_factory.game;

import ru.satahippy.learning.design_patterns.abstract_factory.game.warrior_factories.IWarriorsFactory;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.IWarrior;

/**
 * It's a real client that use IWarriorsFactory
 */
public class Team
{
	public String name;

	protected IWarriorsFactory warriorsFactory;
	protected IWarrior[] warriors;

	// client shouldn't really know about concrete classes (implementation)
	// only link on IWarriorsFactory and IWarrior (ISoldier/IArcher/IWizard)
	public Team(String name, IWarriorsFactory warriorsFactory)
	{
		this.name = name;
		this.warriorsFactory = warriorsFactory;
		createTeam();
	}

	protected void createTeam()
	{
		warriors = new IWarrior[3];
		warriors[0] = warriorsFactory.createSoldier();
		warriors[1] = warriorsFactory.createArcher();
		warriors[2] = warriorsFactory.createWizard();
	}

	public IWarrior[] getWarriors()
	{
		return warriors;
	}

	public String toString()
	{
		String result = this.name + ":";

		for (int i = 0; i < this.warriors.length; i++) {
			IWarrior warrior = this.warriors[i];
			result += " [" + (warrior.isDead() ? "x" : "") + "]" + warrior.getName();
		}

		return result;
	}
}
