package ru.satahippy.learning.design_patterns.simple_factory.mail.mailers;

import ru.satahippy.learning.design_patterns.simple_factory.mail.messages.IMessage;

/**
 * Concrete mailer. Just send mail via local program.
 */
public class SimpleMailer implements IMailer
{
	@Override
	public void send(IMessage message)
	{
		System.out.println("Simple send message: " + message.getContent());
	}
}
