package test_OOP_Interface;

public class UKandUS extends World implements IndianArmy,UKArmy,USArmy{

	@Override
	public void USTroops() {
		
		System.out.println("UKandUS -----> USTroops");
		
	}

	@Override
	public void AirMarshal() {
		
		System.out.println("UKandUS -----> AirMarshal");
		
	}

	@Override
	public void Seals() {
		System.out.println("UKandUS -----> Seals");
		
	}

	@Override
	public void UKTroops() {
		System.out.println("UKandUS -----> UKTroops");
		
	}

	@Override
	public void Bonapart() {
		System.out.println("UKandUS -----> Bonapart");
		
	}

	@Override
	public void sheperds() {
		System.out.println("UKandUS -----> Shepereds");
		
	}

	@Override
	public void LandTroops() {
		System.out.println("UKandUS -----> LandTroops");
		
	}

	@Override
	public void Vikranths() {
		System.out.println("UKandUS -----> Vikranths");
		
	}

	@Override
	public void Chakras() {
		System.out.println("UKandUS -----> Chakras");
		
	}

	@Override
	public void AirTroops() {
		IndianArmy.super.AirTroops();
		USArmy.super.AirTroops();
		UKArmy.super.AirTroops();
	}

}
