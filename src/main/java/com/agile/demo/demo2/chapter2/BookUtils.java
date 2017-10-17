package com.agile.demo.demo2.chapter2;

public class BookUtils {
	
	static void process(BookProcesser bookProcesser) {
		
		for(int i = 0; i < 5; i ++){
			bookProcesser.process();
		}
	}
	
	static void printBookId() {
		BookProcesser bookProcesser = new BookProcesser() {
			
			@Override
			public void process() {
				System.out.println("book_id");
			}
		};
		process(bookProcesser);
	}
	
	static void printBookName() {
		BookProcesser bookProcesser = new BookProcesser() {
			
			@Override
			public void process() {
				System.out.println("book_name");
			}
		};
		process(bookProcesser);
	}
	
	public static void main(String[] args) {
		BookUtils.printBookId();
		BookUtils.printBookName();
	}
}


interface BookProcesser {
	void process();
}