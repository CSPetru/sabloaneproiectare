

public class DocumentManager {
	private static DocumentManager documentManager;
	private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	private DocumentManager() {

	}

	public static DocumentManager getInstance() {
		if (documentManager == null) {
			documentManager = new DocumentManager();
		}

		return documentManager;

	}

}
