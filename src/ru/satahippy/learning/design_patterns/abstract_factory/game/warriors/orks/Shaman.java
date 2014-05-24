package ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.orks;

import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.BaseWarrior;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.IWizard;

/**
 * Concrete implementation of IWizard
 */
public class Shaman extends BaseWarrior implements IWizard
{
	public Shaman()
	{
		name = "Shaman";

		this.health = 25;

		this.minTire = 3;
		this.maxTire = 6;

		this.minDamage = 10;
		this.maxDamage = 15;
	}
}
