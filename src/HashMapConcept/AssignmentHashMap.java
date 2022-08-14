package HashMapConcept;

import java.util.HashMap;

public class AssignmentHashMap {
	
	public static void Display(String firstName, String emailID, String City, String Coutry, String Pincode) {
		
		System.out.println("User Firstname is   :"+ firstName);
		System.out.println("Emailid is   :"+ emailID);
		System.out.println("User City is   :"+ City);
		System.out.println("User Country is   :"+ Coutry);
		System.out.println("User Pincode is   :"+ Pincode);
		
		
	}
	
	public static String CustDetails(String name) {
		
		HashMap<String, String> custinfo = new HashMap<String,String>();
		custinfo.put("Admin", "Admin;admin@admin.com;admin@123;AdminTown;Azerbijan;46654");
		custinfo.put("Seller", "Seller;seler@seller.com;seller@123;SellerTown;India;637890");
		custinfo.put("Newbie", "Newbie;Newbie@Newbie.com;Newbie@123;NewbieTown;India;689590");
		custinfo.put("Vignesh", "Vignesh;Vignesh@gmail.com;Vignesh@123;Namakkal;India;638183");
		
		return custinfo.get(name);
	}

	public static void main(String[] args) {
		
		String s = CustDetails("Vignesh");
		System.out.println(s);
		
		String user[] = s.split(";");
		String firstName = user[0];
		String emailID = user[1];
		String City = user[3];
		String Coutry = user[4];
		String Pincode = user[5];
		
		Display(firstName,emailID,City,Coutry,Pincode);
		
		
		

	}

}
