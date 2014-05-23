package ru.satahippy.learning.design_patterns.static_factory.documents.documents;

/**
 * Parent Product that have static method "factory".
 * It's a Static Factory
 */
abstract public class Document
{
	public final static int DOCUMENT_TEXT = 1;
	public final static int DOCUMENT_IMAGE = 2;
	public final static int DOCUMENT_TABLE = 3;

	protected String path;

	public void setPath(String path)
	{
		this.path = path;
	}

	public String getPath()
	{
		return path;
	}

	abstract public void render();

	// here could be more complex logic
	// for example: detect type of document from extension or mime type.
	public static Document factory(int documentType) throws Exception
	{
		switch (documentType) {
			case DOCUMENT_TEXT:
				return new TextDocument();
			case DOCUMENT_IMAGE:
				return new ImageDocument();
			case DOCUMENT_TABLE:
				return new TableDocument();
			default:
				throw new Exception("Wrong Document Type");
		}
	}

}
