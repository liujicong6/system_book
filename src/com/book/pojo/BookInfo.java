package com.book.pojo;

public class BookInfo {
	private Integer id;
	private String bookName;
	private String author;
	private String publisher;
	private Double price;
	
	private String bphoto;
	

	private Category category;
	public BookInfo() {}

	public BookInfo(Integer id, String bookName, String author, String publisher, Double price, String bphoto,
			Category category) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.bphoto = bphoto;
		this.category = category;
	}

	public String getBphoto() {
		return bphoto;
	}
	public void setBphoto(String bphoto) {
		this.bphoto = bphoto;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

}
