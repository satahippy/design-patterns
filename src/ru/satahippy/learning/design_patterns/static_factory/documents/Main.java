package ru.satahippy.learning.design_patterns.static_factory.documents;

import ru.satahippy.learning.design_patterns.static_factory.documents.documents.Document;

/**
 * Static Factory Design Pattern Example
 * WARNING!!! In most cases it's considered as anti-pattern! Cause of static method. And Parent should know about his SubClasses
 * Main is a client, that doesn't know about various types of documents
 */
public class Main
{
	public static void main(String[] args)
	{
		try {
			Document text = Document.factory(Document.DOCUMENT_TEXT);
			text.setPath("/home/text.txt");
			text.render();

			Document image = Document.factory(Document.DOCUMENT_IMAGE);
			image.setPath("/home/image.png");
			image.render();

			Document table = Document.factory(Document.DOCUMENT_TABLE);
			table.setPath("/home/table.xsl");
			table.render();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}