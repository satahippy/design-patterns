package ru.satahippy.learning.design_patterns.decorator.speaker;

import java.util.Random;

/**
 * Concrete Decorator for ISpeaker
 */
public class ExpressionSpeakerDecorator extends SpeakerDecorator
{
	public ExpressionSpeakerDecorator(ISpeaker speaker)
	{
		super(speaker);
	}

	public String speech(String text)
	{
		return super.speech(text.toUpperCase().replace("!", "!!!"));
	}
}
