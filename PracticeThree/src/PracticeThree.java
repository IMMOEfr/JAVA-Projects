abstract class Book{
	String title;
	double price;
	public Book() {
		this.title = null;
	}
	public Book(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}
	abstract void setPrice();
}
class Fiction extends Book{
	public Fiction(String title) {
		super(title);
		setPrice();
	}
	void setPrice() {
		super.price = 24.99;
	}
}
class NonFiction extends Book{
	public NonFiction(String title) {
		super(title);
		setPrice();
	}
	void setPrice() {
		super.price = 37.99;
	}
}

public class PracticeThree {
	public static void main(String[]args) {
		Book bookObjects[] = new Book[2];
		bookObjects[0] = new Fiction("Harry Potter");
		bookObjects[1] = new NonFiction("Encyclopedia");
		
		for(Book element: bookObjects) {
			System.out.println("Title: "+element.getTitle()+"\nPrice: "+element.getPrice()+"PHP");
		}
	}
}
