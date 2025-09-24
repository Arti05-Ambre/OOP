
package encapsulation;
class Book{
	private String Title;
	private String Author;
	private int Price;
	

public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}


	public String getAuthor() {
		return Author;
	}


	public void setAuthor(String author) {
		Author = author;
	}


	public int getPrice() {
		return Price;
	}


	public void setPrice(int price) {
		Price = price;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
	Book b1 = new Book();
	b1.setTitle("Atomic Habit");
	b1.setAuthor("James Clear");
	b1.setPrice(300);
	System.out.println("Name of the book is : "+   b1.getTitle());
System.out.println("Author of the book is : " +  b1.getAuthor());
System.out.println("Price of the book is : "+   b1.getPrice());
	}
}
