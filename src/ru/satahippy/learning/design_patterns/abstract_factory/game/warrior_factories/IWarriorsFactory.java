package ru.satahippy.learning.design_patterns.abstract_factory.game.warrior_factories;

import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.IArcher;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.ISoldier;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.IWizard;

/**
 * Base Abstract Factory
 */
public interface IWarriorsFactory
{
	public ISoldier createSoldier();
	public IArcher createArcher();
	public IWizard createWizard();
}
