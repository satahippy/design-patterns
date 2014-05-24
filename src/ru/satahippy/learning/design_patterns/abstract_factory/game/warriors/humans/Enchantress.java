package ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.humans;

import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.BaseWarrior;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.IWizard;

/**
 * Concrete implementation of IWizard
 */
public class Enchantress extends BaseWarrior implements IWizard
{
	public Enchantress()
	{
		name = "Enchantress";

		this.health = 20;

		this.minTire = 3;
		this.maxTire = 5;

		this.minDamage = 8;
		this.maxDamage = 12;
	}
}
