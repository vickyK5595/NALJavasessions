package constructorConcept;

import java.util.ArrayList;

public class Vignesh {

	public static void main(String[] args) {
		
		Accenture a1 = new Accenture("Vignesh",27);
		Accenture a2 = new Accenture("Varun",26);
		System.out.println(a1.name + " "+ a1.empID + " "+ a1.age + " "+ a1.isActive + " "+ Accenture.cmpName);
		System.out.println(a2.name + " "+ a2.empID + " "+ a2.age + " "+ a2.isActive + " "+ Accenture.cmpName);
		System.out.println(a1.devices);
		System.out.println(a2.projectID);
		
		ArrayList<String> as1 = Accenture.DevicesList("Vignesh", 27);
		System.out.println(as1);
		ArrayList<String> as2 = Accenture.DevicesList("Varun", 27);
		System.out.println(as2);
		
		Accenture a3 = new Accenture("Vignesh",1125678,"jhdhwhjwo@hfihei.com",0403040246,true);
		
		a3.ProjectName(a3);
		System.out.println(a3.projectID);
		
		
		

	}

}
