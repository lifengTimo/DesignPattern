package com.lifeng.IteratorPattern;

public class BookShelfIterator implements Iterator {

	private BookShelf bookShelf;
	private int index;
	public BookShelfIterator() {
		// TODO Auto-generated constructor stub
	}
	public BookShelfIterator(BookShelf bookshelf) {
		this.bookShelf=bookshelf;
		this.index=0;
	}
	public boolean hasNext() {
		if(index<bookShelf.getLength()) {
			return true;
		}
		return false;
	}

	public Object next() {
		Book book=bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
