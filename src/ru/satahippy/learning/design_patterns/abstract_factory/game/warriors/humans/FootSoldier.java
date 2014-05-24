package ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.humans;

import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.BaseWarrior;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.ISoldier;

/**
 * Concrete implementation of ISoldier
 */
public class FootSoldier extends BaseWarrior implements ISoldier
{
	public FootSoldier()
	{
		name = "Foot-soldier";

		this.health = 25;

		this.minTire = 3;
		this.maxTire = 5;

		this.minDamage = 4;
		this.maxDamage = 7;
	}
}
