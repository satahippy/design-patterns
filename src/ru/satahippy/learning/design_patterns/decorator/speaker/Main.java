package ru.satahippy.learning.design_patterns.decorator.speaker;

/**
 * Decorator Design Pattern Example
 * As client used "speak" method
 */
public class Main
{
	public static void main(String[] args)
	{
		String speech = "Hello my friends! There really great day for everyone of us. Let's eat and drink...";

		speak(speech, new ExpressionSpeakerDecorator(
				new NamedSpeaker("Mr. President")
		));

		speak(speech, new SwearSpeakerDecorator(
				new SorrySpeakerDecorator(
						new AnonymousSpeaker()
				)
		));
	}

	public static void speak(String text, ISpeaker speaker)
	{
		System.out.println(speaker.speech(text));
	}
}