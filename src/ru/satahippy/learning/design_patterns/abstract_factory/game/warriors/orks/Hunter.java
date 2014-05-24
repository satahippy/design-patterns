package ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.orks;

import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.BaseWarrior;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.IArcher;

/**
 * Concrete implementation of IArcher
 */
public class Hunter extends BaseWarrior implements IArcher
{

	public Hunter()
	{
		name = "Hunter";

		this.health = 15;

		this.minTire = 1;
		this.maxTire = 2;

		this.minDamage = 2;
		this.maxDamage = 4;
	}
}
