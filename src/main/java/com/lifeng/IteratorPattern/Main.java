package com.lifeng.IteratorPattern;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf=new BookShelf(4);
		bookShelf.appendBook(new Book("Around the Word in 80 days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderalla"));
		bookShelf.appendBook(new Book("Dady-Long-Legs"));
		Iterator it=bookShelf.iterator();
		while (it.hasNext()) {
			Book book=(Book)it.next();
			System.out.println(book.getName());
			
		}
	}
}
