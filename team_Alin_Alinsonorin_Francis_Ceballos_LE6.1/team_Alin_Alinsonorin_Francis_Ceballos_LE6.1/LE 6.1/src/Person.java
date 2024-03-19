

//public class Person {

	public class Person{
		
		String name;
		String address;
		String emailAdd;
		String phoneNum;
		
		Person(String name, String address, String emailAdd, String phoneNum){
			
			this.name = name;
			this.address = address;
			this.emailAdd = emailAdd;
			this.phoneNum = phoneNum;	
		}
		
		public String toString(){
			
		   return  getClass().getName()+" "+name +" "+address +" "+emailAdd +" "+phoneNum;
		}
	}
	
	 class Student extends Person{
		
	    final int freshman =1;
	    final int sophomore =2;
	    final int junior=3;
	    final int senior=4;
	    String status="freshman";
	 
	    public Student(String name, String address,String phoneNum, String emailAdd, int status){
	   
	    	super(name, address, phoneNum, emailAdd);
	    	
	    	if (status == 1) {
	    		this.status = "freshman";
	    	}
	    	else if(status == 2) {
	    		this.status = "sophomore";
	    	}
	    	else if(status == 3) {
	    		this.status = "junior";	 
	    	}
	    	else if(status == 4) {
	    		this.status = "senior";
	    	}
	    	this.status = "Student";
		}
 
	    public String toString() {
	    	return super.toString() +" " + status;
	    }
	}
	
	class Employee extends Person{
		
		String office;
	    double salary;
	    //MyDate d = new MyDate(1978,1,20);
	    MyDate dateHired;
	    
	    public Employee(String name,String address,String phoneNum,String emailAdd,String office,double salary, MyDate dateHired) {
	    	super(name, address, phoneNum, emailAdd);
	  	  	this.office=office;
	  	  	this.salary=salary;
	  	  	this.dateHired = dateHired;	
	    }
	    
	    public String toString() {
  	  		return (super.toString() +" " + office +" " + salary+" "+dateHired);
  	  	}   
	}
	
	class Faculty extends Employee{
		
		String officeHours;
		String rank;
		 
		 public Faculty(String name,String address,String phoneNum,String emailAdd,String office,int salary, MyDate dateHired, String officeHours,String rank) {
			 
			 super(name,address,phoneNum, emailAdd, office , salary, dateHired);
		     this.officeHours=officeHours;
		     this.rank=rank;
		 }
		 public String toString() {
			 return (super.toString() + " " + officeHours +"  " + rank);
		 }
	}
	
	class Staff extends Employee{
		
		String title;
		
		public Staff(String name,String address,String phoneNum,String emailAdd,String office,int salary, MyDate dateHired, String title) {
			
			super(name, address, phoneNum, emailAdd, office, salary, dateHired);
		    this.title = title;
		}
		
		public String toString() {
			return (super.toString() +" "+title);
		}
	}
//}
		

	
	

