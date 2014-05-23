package ru.satahippy.learning.design_patterns.static_factory.documents.documents;

/**
 * Concrete Product
 */
public class TextDocument extends Document
{
	@Override
	public void render()
	{
		System.out.println(path + ": I am the Text Document");
	}
}
