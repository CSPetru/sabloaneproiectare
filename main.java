package book_l2;

public class main {

	public static void main(String[] args) {
		Book diseaTitanic = new Book("Disea Titanic");
		Author rPavel = new Author("Radu Pavel");
		diseaTitanic.addAuthor(rDaniel);
		int indexOfChapter = diseaTitanic.createChapter("Chapter One");
		Chapter chpOne = diseaTitanic.getChapter(indexOfChapter);
		int indexOfSubChapter = chpOne.createSubChapter("Chapter One One");
		SubChapter chpOneOne = chpOne.getSubChapter(indexofSubChapter);
		int indexOfParagraph = chpOneOne.createParagraph("Paragraph");
		int indexOfImage = chpOneOne.createImage("Image1");
		int indexOfTable = chpOneOne.createTable("Table1");

	}

}
