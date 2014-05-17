package ru.satahippy.learning.design_patterns.decorator.speaker;

/**
 * Base Decorator for ISpeaker
 */
public class SpeakerDecorator implements ISpeaker
{
	protected ISpeaker speaker;

	public SpeakerDecorator(ISpeaker speaker)
	{
		this.speaker = speaker;
	}

	public String speech(String text)
	{
		return speaker.speech(text);
	}
}
