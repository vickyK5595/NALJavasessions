package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysMethodsOverloaddingTest {
	
		// WAF   : this will return menu links on the page
		// param : page name
		// return: ArrayList<String>

		public String[] getPageMenuLinks(String pageName) {
			System.out.println("page name is : " + pageName);

			String menuList[] = new String[5];

			if (pageName.trim().equalsIgnoreCase("loginpage")) {
				menuList[0]=("product");
				menuList[1]=("category");
				menuList[2]=("price");
			} else if (pageName.trim().equalsIgnoreCase("homepage")) {
				menuList[0]=("product");
				menuList[1]=("category");
				menuList[2]=("price");
				menuList[3]=("search");
				menuList[4]=("cart");
			} else if (pageName.trim().equalsIgnoreCase("productpage")) {
				menuList[0]=("product");
				menuList[1]=("category");
				menuList[2]=("price");
				menuList[3]=("info");
				menuList[4]=("seller");
			} else {
				System.out.println("please pass the right page name...." + pageName);
			}

			return menuList;
		}
		
		public ArrayList<String> getEmpDevicesList(String empName) {
			System.out.println("welcome to IT team....emp name is : " + empName);
			
			ArrayList<String> devices = new ArrayList<String>();
			
			empName = empName.toLowerCase();//sachin
			if(empName.equals("sachin")) {
				devices.add("iPhonex");
				devices.add("Macbook pro");
				devices.add("Airtel SIM");
			}
			else if(empName.equals("ravi")) {
				devices.add("iPhone12");
				devices.add("Macbook Air");
				devices.add("Airtel SIM");
				devices.add("Lenovo Windows");

			}
			else if(empName.equals("archana")) {
				devices.add("iPhone13");
				devices.add("Macbook Pro");
				devices.add("HP Windows");
				devices.add("Keyboard");
				devices.add("Mouse");
			}
			else {
				System.out.println("emp name is not found..." + empName);
			}
			
			return devices;
		}
		public String[] getPageMenuLitrels(String pageName) {
			System.out.println("page name is : " + pageName);

			String menuList[] = new String[5];

			if (pageName.trim().equalsIgnoreCase("loginpage")) {
				menuList = "product,category,price".split(",");     //
			} else if (pageName.trim().equalsIgnoreCase("homepage")) {
				menuList ="product,category,price,search,cart".split(",");
				
			} else if (pageName.trim().equalsIgnoreCase("productpage")) {
				menuList = "product,category,price,info,seller".split(",");
			
			} else {
				System.out.println("please pass the right page name...." + pageName);
			}

			return menuList;
		}
		
		
		public static void main(String[] args) {

			ArraysMethodsOverloaddingTest app = new ArraysMethodsOverloaddingTest();
			String loginList[] = app.getPageMenuLinks("homepage");
			System.out.println(Arrays.toString(loginList));
			
			System.out.println(">>>>>>>>>>>>>DEVICES<<<<<<<<<<<<<");
			
			ArraysMethodsOverloaddingTest app1 = new ArraysMethodsOverloaddingTest();
			ArrayList<String> cost = app1.getEmpDevicesList("Ravi");
			System.out.println(cost);
			
			System.out.println(">>>>>>>>>>>>>Litrels<<<<<<<<<<<<<");
			
			ArraysMethodsOverloaddingTest app2 = new ArraysMethodsOverloaddingTest();
			String list[]= app2.getPageMenuLitrels("ProductPage");
			System.out.println(Arrays.toString(list));
		}

	}
