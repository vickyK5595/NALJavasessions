package test_OOP_Interface;

public interface UKArmy {
	
	public void UKTroops();
	
	public void Bonapart();
	
	public void sheperds();
	
	default void AirTroops() {	
		System.out.println("UKArmy -----> AirTroops are deployed");	
	}
	
	
	static void Troops() {
		System.out.println("Operators ------> Operators are deployed");
	}	
}
