package ru.satahippy.learning.design_patterns.static_factory.documents.documents;

/**
 * Concrete Product
 */
public class TableDocument extends Document
{
	@Override
	public void render()
	{
		System.out.println(path + ": I am the Table Document");
	}
}
