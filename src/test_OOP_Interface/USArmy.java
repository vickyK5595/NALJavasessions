package test_OOP_Interface;

public interface USArmy {

	public void USTroops();

	public void AirMarshal();

	public void Seals();
	
	default void AirTroops() {	
		System.out.println("USArmy -----> AirTroops are deployed");	
	}
}