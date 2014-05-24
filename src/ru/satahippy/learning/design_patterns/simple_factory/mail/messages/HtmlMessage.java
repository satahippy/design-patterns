package ru.satahippy.learning.design_patterns.simple_factory.mail.messages;

/**
 * Concrete message
 */
public class HtmlMessage implements IMessage
{
	String content;

	@Override
	public void setContent(String content)
	{
		this.content = processHtml(content);
	}

	@Override
	public String getContent()
	{
		return content;
	}

	// here we can make some html changes
	protected String processHtml(String text)
	{
		return text + "(HTML)";
	}
}
