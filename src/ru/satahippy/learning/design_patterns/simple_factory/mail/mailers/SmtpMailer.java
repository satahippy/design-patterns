package ru.satahippy.learning.design_patterns.simple_factory.mail.mailers;

import ru.satahippy.learning.design_patterns.simple_factory.mail.messages.IMessage;

/**
 * Concrete mailer, that sends mail via smtp.
 */
public class SmtpMailer implements IMailer
{
	@Override
	public void send(IMessage message)
	{
		System.out.println("Send message with smtp: " + message.getContent());
	}
}
