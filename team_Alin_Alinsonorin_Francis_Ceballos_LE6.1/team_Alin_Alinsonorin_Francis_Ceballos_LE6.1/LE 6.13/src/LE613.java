class Cake {
	protected String name;
	protected double rate;
	
	public Cake() {
		name = null;
		rate = 0;
	}
	public Cake(String n, double r) {
		name = n;
		rate = r;
	}
	public double calcPrice() {
		return 0;
	}
	public String toString() {
		return name + "\t" + rate;
	}
}

class OrderCake extends Cake{
	private double weight;
	OrderCake(){
		super();
		weight = 0;
	}
	OrderCake(String n, double r,double w){
		super(n,r);
		weight = w;
	}
	@Override
	public double calcPrice() {
		return weight*super.rate;
	}
}
class ReadymadeCake extends Cake{
	private int quantity;
	ReadymadeCake(){
		super();
		quantity = 0;
	}
	ReadymadeCake(String n, double r, int q){
		super(n,r);
		quantity = q;
	}
	int getQuantity() {
		return quantity;
	}
	@Override
	public double calcPrice() {
		return quantity*super.rate;
	}
}

	

public class LE613{
	
	public static void main(String[]args) {
		Cake cakeObjects[] = new Cake[20];
		double total=0, readyTotal=0;
		Cake highestPrice = new Cake();
		int readyQuantity=0;
		//Array data
		cakeObjects[0] = new ReadymadeCake("Vanilla",3.2,5);
		cakeObjects[1] = new ReadymadeCake("Choco",50,12);
		cakeObjects[2] = new OrderCake("Holchi",50,2);
		cakeObjects[3] = new OrderCake("Ube",3.5,2.5);
		cakeObjects[4] = new OrderCake("Myl",1.1,3.5);
		cakeObjects[5] = new ReadymadeCake("Ube",0.6,1);
		cakeObjects[6] = new ReadymadeCake("Mocha",0.2,1);
		cakeObjects[7] = new OrderCake("Caramel",9.2,4.1);
		cakeObjects[8] = new OrderCake("Doggy",2,10);
		cakeObjects[9] = new ReadymadeCake("Meow",6,3);
		cakeObjects[10] = new ReadymadeCake("Angel",3.2,5);
		cakeObjects[11] = new ReadymadeCake("Burger",1.2,2);
		cakeObjects[12] = new OrderCake("Wafer",2.2,10);
		cakeObjects[13] = new OrderCake("Lolipop",3.5,2.5);
		cakeObjects[14] = new OrderCake("Cotton",1.1,3.5);
		cakeObjects[15] = new ReadymadeCake("Doodoo",0.6,1);
		cakeObjects[16] = new ReadymadeCake("Pie",0.2,1);
		cakeObjects[17] = new OrderCake("Creampie",9.2,4.1);
		cakeObjects[18] = new OrderCake("Bat",2,10);
		cakeObjects[19] = new ReadymadeCake("Spiderman",6,3);
		//Fetching statistics
		for(Cake element: cakeObjects) {
			if(highestPrice.calcPrice()<=element.calcPrice()) {
				highestPrice = element;
			}
			if(element instanceof ReadymadeCake) {
				readyTotal+=element.calcPrice();
				readyQuantity+=((ReadymadeCake) element).getQuantity();
			}
			total = total+element.calcPrice();
		}
		//Display
		System.out.printf("Total price for all cakes: %.2fphp\n",total);
		System.out.println("Total price for ready made cakes: "+readyTotal+"php"+"\nTotal quantity for ready made cakes: "+readyQuantity);
		System.out.print("\nCake with the highest price sold\n"+"Name\t"+"Rate\t"+"Price\n"+highestPrice.toString());
		System.out.printf("\t%.2fphp",highestPrice.calcPrice());
	}
}
