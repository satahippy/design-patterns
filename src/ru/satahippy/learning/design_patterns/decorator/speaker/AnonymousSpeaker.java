package ru.satahippy.learning.design_patterns.decorator.speaker;

/**
 * Concrete Component
 */
public class AnonymousSpeaker implements ISpeaker
{
	public String speech(String text)
	{
		return text;
	}
}
