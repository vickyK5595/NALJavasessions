package test_OOP_Inheritance;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CEG c = new CEG();
		c.Grade();
		c.Uniform();
		c.Certificate();
		
		System.out.println("---------------------");
		
		Amruta a= new Amruta();
		a.Certificate();
		a.Facility();
		a.Sylabus();
		a.Library();
		
		System.out.println("---------------------");
		
		KEC k = new KEC();
		k.BusFacility();
		k.Certificate();
		
		System.out.println("---------------------");
		
		
		TechUniversity t = new KEC();
		t.Sylabus();
		

	}

}
