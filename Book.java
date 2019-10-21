package book_l2;

import java.util.*;

public class Book {
		 public String bookName;
		 public List<Author> authorList = new ArrayList<Author>();
		 public List<Chapter> chapterList = new ArrayList<Chapter>();
		public Book(String bookName) {
			this.bookName = bookName;
		}
		public boolean addAuthor(Author e) {
			return authorList.add(e);
		}
		public int createChapter(String chapterName) {
			Chapter chp = new Chapter(chapterName);
			chapterList.add(chp);
			return chapterList.indexOf(chp);
		}
		public Chapter getChapter(int indexOfChapter) {
			return chapterList.get(indexOfChapter);
		}
		 
}
