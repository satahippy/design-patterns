package ru.satahippy.learning.design_patterns.simple_factory.mail;

import ru.satahippy.learning.design_patterns.simple_factory.mail.mailers.IMailer;
import ru.satahippy.learning.design_patterns.simple_factory.mail.messages.IMessage;

/**
 * Simple Factory Design Pattern Example
 * Can be considered as ServiceLocator or DI or something like that.
 * Useful when your dependency can be changed in future. If you don't want search this dependency across all code use it.
 */
public class Main
{
	public static void main(String[] args)
	{
		try {
			SimpleMailFactory factory = new SimpleMailFactory();
			IMessage message = factory.createMessage(SimpleMailFactory.MESSAGE_HTML);
			IMailer mailer = factory.createMailer();

			message.setContent("Hello my dear friend!");
			mailer.send(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}