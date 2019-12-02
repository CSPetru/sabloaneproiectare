

public class OpenCommand implements Command {

	@Override
	public void execute() {
		Builder jsonBuilder = new JSONBuilder();
		jsonBuilder.build();
		Element myBook = jsonBuilder.getResult();
		Book book = new Book();
		book.addContent(myBook);
		DocumentManager.getInstance().setBook(book);

	}

}
