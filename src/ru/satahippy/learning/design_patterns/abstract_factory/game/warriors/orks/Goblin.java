package ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.orks;

import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.BaseWarrior;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.ISoldier;

/**
 * Concrete implementation of ISoldier
 */
public class Goblin extends BaseWarrior implements ISoldier
{
	public Goblin()
	{
		name = "Goblin";

		this.health = 20;

		this.minTire = 2;
		this.maxTire = 4;

		this.minDamage = 3;
		this.maxDamage = 6;
	}
}
