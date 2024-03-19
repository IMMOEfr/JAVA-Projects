/*Create a Polo class for CompanyXYZ. Fields include an order number, 
 * size, color, and price. Create set methods for the order number, size, 
 * and color and get methods for all four fields. The price is determined 
 * by the size: $22.99 for XXL or XXXL, and $19.99 for all other sizes. 
 * Create a subclass named CustomPolo that descends from Polo and includes 
 * a field to hold the slogan requested for the polo tag, and include get 
 * and set methods this field. Write an application that creates two objects
 *  of each class, and demonstrate that all the methods work correctly.
 */
class Polo {
	private int orderNumber;
	private String size;
	private String color;
	private double price;
	
	public Polo() {
		this.orderNumber = 0;
		this.size = null;
		this.color = null;
	}
	public Polo(int orderNumber, String size, String color) {
		this.orderNumber = orderNumber;
		this.size = size;
		this.color = color;
		
		if (size.equals("XXL") || size.equals("XXXL")) {
			price = 22.99;
		} else {
			price = 19.99;
		}
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}
	
	public String getSize() {
		return size;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getPrice() {
		return price;
	}
}

class CustomPolo extends Polo{
	String slogan;
	public CustomPolo() {
		super();
		this.slogan = null;
	}
	public CustomPolo(int orderNumber, String size, String color,String slogan) {
		super(orderNumber,size,color);
		this.slogan = slogan;
	}
	public void setSlogan(String slogan) {
		
		this.slogan = slogan;
	}
	public String getSlogan() {
		return slogan;
	}
}

public class Practice{
	public static void main(String[] args) {
		Polo poloObject = new Polo(1,"XXL","Red");
		System.out.println(poloObject.getPrice());
		CustomPolo customObj = new CustomPolo(1,"XXL","Red","IM COOL");
		System.out.println(customObj.getSlogan());
	}
}