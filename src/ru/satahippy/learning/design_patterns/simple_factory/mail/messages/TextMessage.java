package ru.satahippy.learning.design_patterns.simple_factory.mail.messages;

/**
 * Concrete message
 */
public class TextMessage implements IMessage
{
	String content;

	@Override
	public void setContent(String content)
	{
		this.content = content;
	}

	@Override
	public String getContent()
	{
		return content;
	}
}
