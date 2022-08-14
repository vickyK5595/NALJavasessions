package constructorConcept;

import java.util.ArrayList;

public class Accenture {

	static final String cmpName = "Accenture";
	String name;
	int age;
	double empID;
	String mailID;
	double contactNo;
	boolean isActive;
	ArrayList<String> devices;
	ArrayList<Integer> projectID = new ArrayList<Integer>();
	
	public Accenture(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public static ArrayList<String> DevicesList(String name,int age) {
		 
		 System.out.println("Employee name is "+ name + " Employee age is " + age);
		  
		 ArrayList<String> devices1 = new ArrayList<String>();
		 
		 name = name.toLowerCase();
		 if(name.equals("vignesh")) {
			 
			 devices1.add("Iphone13");
			 devices1.add("Laptop");
			 devices1.add("Airtel Sim");		 
		 }
		 else {
			 System.out.println("Employee Not found...............");
		 }
		 return devices1;
		 
		
	 }
	public Accenture(String name, double empID, String mailID, double contactNo, boolean isActive) {

		this.name = name;
		this.empID = empID;
		this.mailID = mailID;
		this.contactNo = contactNo;
		this.isActive = isActive;
	}
	public void ProjectName(Accenture s1) {
		
		s1.projectID.add(1);
		s1.projectID.add(2);
		s1.projectID.add(3);
		
		
	}
}

