package test_OOP_Interface;

public interface IndianArmy {
	
	public void LandTroops();
	
	public void Vikranths();
	
	public void Chakras();
	
	default void AirTroops() {	
		System.out.println("IndianArmy -----> AirTroops are deployed");	
	}
	
	static void Operators() {
		System.out.println("Operators ------> Operators are deployed");
	}	

}
