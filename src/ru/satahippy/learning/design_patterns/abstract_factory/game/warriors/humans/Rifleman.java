package ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.humans;

import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.BaseWarrior;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.IArcher;

/**
 * Concrete implementation of IArcher
 */
public class Rifleman extends BaseWarrior implements IArcher
{
	public Rifleman()
	{
		name = "Rifleman";

		this.health = 12;

		this.minTire = 1;
		this.maxTire = 2;

		this.minDamage = 3;
		this.maxDamage = 6;
	}
}
