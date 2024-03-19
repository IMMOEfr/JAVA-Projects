class Candle{
	String color;
	int height, price;
	
	public Candle() {
		this.color = null;
		this.height = 0;
		price = 0;
	}
	public Candle(String color,int height) {
		this.color = color;
		this.height = height;
		price = height*2;
	}
	public void setColor(String newColor) {
		color = newColor;
	}
	public void setHeight(int newHeight) {
		height = newHeight;
		price = height*2;
	}
	public String getColor() {
		return color;
	}
	public int getHeight() {
		return height;
	}
	public int getPrice() {
		return price;
	}
}
class ScentedCandle extends Candle{
	String scent;
	public ScentedCandle() {
		super();
		this.scent = null;
	}
	public ScentedCandle(String color,int height,String scent) {
		super(color,height);
		this.scent = scent;
		super.price = height*3;
	}
	public void setScent(String newScent) {
		scent = newScent;
	}
	@Override
	public void setHeight(int newHeight) {
		height = newHeight;
		super.price = height*3;
	}
	public String getScent() {
		return scent;
	}
}

public class PracticeTwo {
	public static void main(String[] args) {
		Candle newCandle = new Candle("Red",5);
		System.out.println("Candle desc.\nColor: "+newCandle.getColor()+"\nHeight: "+newCandle.getHeight()+"inches\nPrice: "+newCandle.getPrice()+"PHP");
		ScentedCandle newScented = new ScentedCandle("Red",5,"Vanilla");
		System.out.println("Price: "+newScented.getPrice()+"PHP");
	}
}
