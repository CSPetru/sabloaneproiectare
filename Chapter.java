package book_l2;

import java.util.*;

public class Chapter {
	public String chapterName;
	public List<SubChapter> subChapterList = new ArrayList<SubChapter>();
	
	public Chapter(String chapterName) {
		this.chapterName = chapterName;
	}

	public int createSubChapter(String subChapterName) {
		SubChapter schp = new SubChapter(subChapterName);
		subChapterList.add(schp);
		return subChapterList.indexOf(schp);
	}
	public SubChapter getSubChapter(int indexOfSubChapter) {
		return subChapterList.get(indexOfSubChapter);
	}

	
	

}
