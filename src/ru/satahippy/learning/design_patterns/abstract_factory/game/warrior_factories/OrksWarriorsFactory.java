package ru.satahippy.learning.design_patterns.abstract_factory.game.warrior_factories;

import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.IArcher;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.ISoldier;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.IWizard;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.orks.Goblin;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.orks.Hunter;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.orks.Shaman;

/**
 * Concrete Factory
 */
public class OrksWarriorsFactory implements IWarriorsFactory
{
	@Override
	public ISoldier createSoldier()
	{
		return new Goblin();
	}

	@Override
	public IArcher createArcher()
	{
		return new Hunter();
	}

	@Override
	public IWizard createWizard()
	{
		return new Shaman();
	}
}
