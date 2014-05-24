package ru.satahippy.learning.design_patterns.abstract_factory.game.warriors;

public interface IWarrior
{
	public void setName(String name);
	public String getName();

	public void setHealth(int health);
	public int getHealth();

	public void setTiredness(int tiredness);
	public int getTiredness();

	public boolean isDead();
	public boolean isTired();

	public void hit(IWarrior warrior);
}
