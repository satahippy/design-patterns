package ru.satahippy.learning.design_patterns.decorator.speaker;

import java.util.Random;

/**
 * Concrete Decorator for ISpeaker
 */
public class SwearSpeakerDecorator extends SpeakerDecorator
{
	public double chance = 0.3;
	public String[] swears = {"fucken", "bitch", "fuck", "sucker", "shit"};

	public SwearSpeakerDecorator(ISpeaker speaker)
	{
		super(speaker);
	}

	public String speech(String text)
	{
		StringBuilder builder = new StringBuilder(text);
		for (int i = 0; i < builder.length(); i++) {
			if (builder.charAt(i) == ' ') {
				if (shouldInsertSwear()) {
					char before = builder.charAt(i - 1);
					String swear;
					if ((before >= 'a' && before <= 'z') || (before >= 'A' && before <= 'Z')) {
						swear = ", " + getSwear() + ",";
					} else {
						swear = " " + getSwear() + ",";
					}
					builder.insert(i, swear);
					i += swear.length();
				}
			}
		}

		return super.speech(builder.toString());
	}

	protected boolean shouldInsertSwear()
	{
		if (Math.random() < chance) {
			return true;
		}
		return false;
	}

	protected String getSwear()
	{
		return swears[new Random().nextInt(swears.length)];
	}
}
