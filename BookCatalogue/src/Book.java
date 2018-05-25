
public class Book {
	private int id;
	private String title;
	private String author;
	private Price price;
	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Book(int id, String title, String author, Double price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = new Price(price);
	}

	public Book(Book oldBook) {
		this.id = oldBook.id;
		this.title = oldBook.title;
		this.author = oldBook.author;
		this.price = oldBook.price;
	}
	
	public String toString() {
		return title + " by " + author;
	}
	
	public Price getPrice() {
//		return this.price;
		return new Price(this.price);
	}
	
	public void setPrice(Double price) {
		this.price = new Price(price);
	}
	
}
