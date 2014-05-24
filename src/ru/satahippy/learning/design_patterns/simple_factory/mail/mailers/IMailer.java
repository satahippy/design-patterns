package ru.satahippy.learning.design_patterns.simple_factory.mail.mailers;

import ru.satahippy.learning.design_patterns.simple_factory.mail.messages.IMessage;

/**
 * All mailers should implement this interface.
 */
public interface IMailer
{
	public void send(IMessage message);
}
