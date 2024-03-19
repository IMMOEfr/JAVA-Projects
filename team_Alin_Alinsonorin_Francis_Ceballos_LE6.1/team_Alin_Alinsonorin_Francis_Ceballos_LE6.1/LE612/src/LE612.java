import java.util.Scanner;
import java.util.ArrayList;

class Factorization{
	protected int n;
	protected boolean isPerfectSquare;
	ArrayList<Integer> factors= new ArrayList<Integer>();
	Factorization(){
		this.n = 1;
	}
	Factorization(int m){
		this.n = 1;
		if(checkPerfect(m)==false)
			factoring(m);
	}
	public boolean checkPerfect(int m) {
		if(Math.sqrt(m)==(int)Math.sqrt(m)) {
			this.isPerfectSquare = true;
		}
		else
			this.isPerfectSquare = false;
		return this.isPerfectSquare;
	}
	public void factoring(int m){
		int temp = m;
		int i,prev=0,current,count=1;
		for(i = 2; i< temp; i++) {
	         while(temp%i == 0) {
	            this.factors.add(i);
	            temp = temp/i;
	         }
	      }
	      if(temp >2) {
	    	  this.factors.add(temp);
	      }
	      for (i = 0; i < this.factors.size(); i++) {
	    	  if(prev == 0) {
	    		  prev = this.factors.get(i); 
	    		 continue;
	    	  }
	    	  current = this.factors.get(i); 
	    	  if(current == prev) { 
	    		  count++; 
	    	  }
	    	  else {
	    		  if(count%2 != 0) {
	    			  this.n = this.n*prev; 
	    		  }
	    		  prev = current; 
	    		  count = 1; 
	    	  }
	    	  if(i+1 == this.factors.size()) {
	    		  this.n = this.n*current;
	    	  }
	        }
	}
}
class PerfectSquare extends Factorization{
	//attributes
	private int m;
	PerfectSquare(){
		super();
		this.m = 0;
	}
	PerfectSquare(int userM){
		super(userM);
		this.m = userM;
	}
	int getPerfectSquare() {
		return m*super.n;
	}
	int getSmallestIntegerN() {
		return super.n;
	}
}

public class LE612 {
		public static void main(String[]args) {
			Scanner myObj = new Scanner(System.in);
			System.out.print("Enter an integer: ");
			int m = myObj.nextInt();
			PerfectSquare obj1 = new PerfectSquare(m);
			System.out.println("The smallest number n for m * n to be a perfect square is "+obj1.getSmallestIntegerN());
		    System.out.println("m * n is "+obj1.getPerfectSquare());
		}
}
