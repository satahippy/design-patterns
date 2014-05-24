package ru.satahippy.learning.design_patterns.abstract_factory.game.warrior_factories;

import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.IArcher;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.ISoldier;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.IWizard;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.humans.Enchantress;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.humans.FootSoldier;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.humans.Rifleman;

/**
 * Concrete Factory
 */
public class HumansWarriorsFactory implements IWarriorsFactory
{
	@Override
	public ISoldier createSoldier()
	{
		return new FootSoldier();
	}

	@Override
	public IArcher createArcher()
	{
		return new Rifleman();
	}

	@Override
	public IWizard createWizard()
	{
		return new Enchantress();
	}
}
