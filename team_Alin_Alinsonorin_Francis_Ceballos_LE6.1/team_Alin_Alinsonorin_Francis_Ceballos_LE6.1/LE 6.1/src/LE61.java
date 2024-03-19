
public class LE61 {

	public static void main(String[]args) {
		
		Person p=new Person("	 Josh","	 Sta. Lucia","183145","	josh123@gmail.com");
		Person s=new Student(" Mohan","	 Talamban","  1982833","	mohany@yahoo.com", 1);
		Person e=new Employee("Janluke","Garing","    19290123","	janloc143@gmail.com","	Samsung",	50000, null);
		Person f=new Faculty(" Myl","	 Naga","	    9901231","	boyNaga123@yahoo.com","	Comshop",	60000, null, " 9.00am-9.00pm","Manager");
		Person st=new Staff("   Ben","  	 Cebu","	    120123","	Ben10@yahoo.com","	Intel.Corp",30000, null, "	Floor Manager");
		
		
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
		System.out.println(f.toString());
		System.out.println(st.toString());
	}

	
}
