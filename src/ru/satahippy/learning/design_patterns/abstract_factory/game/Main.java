package ru.satahippy.learning.design_patterns.abstract_factory.game;

import ru.satahippy.learning.design_patterns.abstract_factory.game.warrior_factories.HumansWarriorsFactory;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warrior_factories.OrksWarriorsFactory;
import ru.satahippy.learning.design_patterns.abstract_factory.game.warriors.IWarrior;

import java.util.*;

/**
 * Abstract Factory Design Pattern Example
 * Only main method knows about all factories
 */
public class Main
{
	public static void main(String[] args)
	{
		Team orks = new Team("orks", new OrksWarriorsFactory());
		Team humans = new Team("humans", new HumansWarriorsFactory());
		game(orks, humans);
	}

	public static void game(Team team1, Team team2)
	{
		List<IWarrior> team1Warriors = new ArrayList<IWarrior>(Arrays.asList(team1.getWarriors()));
		List<IWarrior> team2Warriors = new ArrayList<IWarrior>(Arrays.asList(team2.getWarriors()));

		while (team1Warriors.size() > 0 && team2Warriors.size() > 0) {
			List<IWarrior> warriors = createQueue(team1Warriors, team2Warriors);
			for (IWarrior warrior : warriors) {
				if (warrior.isDead()) {
					continue;
				} else if (warrior.isTired()) {
					warrior.setTiredness(warrior.getTiredness() - 1);
				} else {
					List<IWarrior> oppositeTeam = team1Warriors.contains(warrior) ? team2Warriors : team1Warriors;
					if (oppositeTeam.size() == 0) {
						break;
					}
					IWarrior enemy = oppositeTeam.get(random(0, oppositeTeam.size() - 1));
					warrior.hit(enemy);
					if (enemy.isDead()) {
						dropDead(oppositeTeam);
					}
				}
			}
		}

		Team winnersTeam = team1Warriors.size() > 0 ? team1 : team2;
		System.out.println(winnersTeam.name + " is winners!");
		System.out.println(team1);
		System.out.println(team2);
	}

	protected static List<IWarrior> createQueue(List<IWarrior> team1, List<IWarrior> team2)
	{
		List<IWarrior> warriors = new ArrayList<IWarrior>(team1);
		warriors.addAll(team2);

		Collections.shuffle(warriors, new Random(System.nanoTime()));

		return warriors;
	}

	protected static void dropDead(List<IWarrior> team1)
	{
		Iterator<IWarrior> iterator = team1.iterator();
		while (iterator.hasNext()) {
			IWarrior warrior = iterator.next();
			if (warrior.isDead()) {
				iterator.remove();
			}
		}
	}

	protected static int random(int min, int max)
	{
		return (new Random()).nextInt((max - min) + 1) + min;
	}
}