package ru.satahippy.learning.design_patterns.decorator.speaker;

/**
 * Concrete Component
 */
public class NamedSpeaker implements ISpeaker
{
	public String name;

	public NamedSpeaker(String name)
	{
		this.name = name;
	}

	public String speech(String text)
	{
		return name + ": " + text;
	}
}
