package edu.mu;

public class Book {
	
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
		
	}

	public Book(Book otherBook) {
		if (otherBook != null) {
			this.title = otherBook.title;
			this.author = otherBook.author;
			this.ISBN = otherBook.ISBN;
			this.price = otherBook.price;
		}
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", price=" + price + "]";
	}
	
	
	

}
