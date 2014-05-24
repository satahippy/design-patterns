package ru.satahippy.learning.design_patterns.simple_factory.mail;

import ru.satahippy.learning.design_patterns.simple_factory.mail.mailers.IMailer;
import ru.satahippy.learning.design_patterns.simple_factory.mail.mailers.SmtpMailer;
import ru.satahippy.learning.design_patterns.simple_factory.mail.messages.HtmlMessage;
import ru.satahippy.learning.design_patterns.simple_factory.mail.messages.IMessage;
import ru.satahippy.learning.design_patterns.simple_factory.mail.messages.TextMessage;

/**
 * It's a Simple Factory. We can use it whenever we want.
 * If we need we can quick (and without pain) change any Entity.
 */
public class SimpleMailFactory
{
	public static final int MESSAGE_TEXT = 1;
	public static final int MESSAGE_HTML = 2;

	public IMailer createMailer()
	{
		return new SmtpMailer();
	}

	// call can be parametrized
	public IMessage createMessage(int type) throws Exception
	{
		switch (type) {
			case MESSAGE_TEXT:
				return new TextMessage();
			case MESSAGE_HTML:
				return new HtmlMessage();
			default:
				throw new Exception("Wrong Document Type");
		}
	}
}
