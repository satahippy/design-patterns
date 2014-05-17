package ru.satahippy.learning.design_patterns.decorator.speaker;

import java.util.Random;

/**
 * Concrete Decorator for ISpeaker
 */
public class SorrySpeakerDecorator extends SpeakerDecorator
{
	public double chance = 0.2;

	public SorrySpeakerDecorator(ISpeaker speaker)
	{
		super(speaker);
	}

	public String speech(String text)
	{
		StringBuilder builder = new StringBuilder(text);
		for (int i = 0; i < builder.length(); i++) {
			if (builder.charAt(i) == ' ') {
				if (shouldInsertSorry()) {
					char before = builder.charAt(i - 1);
					String sorry;
					if ((before >= 'a' && before <= 'z') || (before >= 'A' && before <= 'Z')) {
						sorry = ", sorry,";
					} else {
						sorry = " sorry,";
					}
					builder.insert(i, sorry);
					i += sorry.length();
				}
			}
		}

		return super.speech(builder.toString());
	}

	protected boolean shouldInsertSorry()
	{
		if (Math.random() < chance) {
			return true;
		}
		return false;
	}
}
