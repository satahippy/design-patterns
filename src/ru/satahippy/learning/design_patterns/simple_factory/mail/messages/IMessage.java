package ru.satahippy.learning.design_patterns.simple_factory.mail.messages;

/**
 * All messages should implement this interface.
 */
public interface IMessage
{
	public void setContent(String content);
	public String getContent();
}
