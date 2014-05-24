package ru.satahippy.learning.design_patterns.abstract_factory.game.warriors;

import java.util.Random;

public abstract class BaseWarrior implements IWarrior
{
	protected String name;
	protected int health;
	protected int tiredness;

	protected int minTire;
	protected int maxTire;

	protected int minDamage;
	protected int maxDamage;

	@Override
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public void setHealth(int health)
	{
		this.health = health;
	}

	@Override
	public int getHealth()
	{
		return this.health;
	}

	@Override
	public void setTiredness(int tiredness)
	{
		this.tiredness = tiredness;
	}

	@Override
	public int getTiredness()
	{
		return tiredness;
	}

	@Override
	public boolean isDead()
	{
		if (health <= 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isTired()
	{
		if (tiredness > 0) {
			return true;
		}
		return false;
	}

	@Override
	public void hit(IWarrior warrior)
	{
		int damage = random(minDamage, maxDamage);
		int tiredness = random(minTire, maxTire);
		warrior.setHealth(warrior.getHealth() - damage);
		setTiredness(getTiredness() + tiredness);


		System.out.println(getName() + " hit " + warrior.getName() + " -" + damage + "(" + warrior.getHealth() + ")");
		System.out.println(getName() + " sleep on " + tiredness + " turns");
		if (warrior.isDead()) {
			System.out.println(warrior.getName() + " is dead");
		}
	}

	private int random(int min, int max)
	{
		return (new Random()).nextInt((max - min) + 1) + min;
	}
}
