package ru.satahippy.learning.design_patterns.static_factory.documents.documents;

/**
 * Concrete Product
 */
public class ImageDocument extends Document
{
	@Override
	public void render()
	{
		System.out.println(path + ": I am the Image Document");
	}
}
