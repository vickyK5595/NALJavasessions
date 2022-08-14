package test_OOP_Interface;

public class Asia extends World implements IndianArmy, UKArmy, USArmy {

	@Override
	public void USTroops() {

		System.out.println("Asia -----> USTroops");

	}

	@Override
	public void AirTroops() {
		IndianArmy.super.AirTroops();
		UKArmy.super.AirTroops();
		USArmy.super.AirTroops();
	}

	@Override
	public void AirMarshal() {

		System.out.println("Asia -----> AirMarshal");

	}

	@Override
	public void Seals() {
		System.out.println("Asia -----> Seals");

	}

	@Override
	public void UKTroops() {
		System.out.println("Asia -----> UKTroops");

	}

	@Override
	public void Bonapart() {
		System.out.println("Asia -----> Bonapart");

	}

	@Override
	public void sheperds() {
		System.out.println("Asia -----> Shepereds");

	}

	@Override
	public void LandTroops() {
		System.out.println("Asia -----> LandTroops");

	}

	@Override
	public void Vikranths() {
		System.out.println("Asia -----> Vikranths");

	}

	@Override
	public void Chakras() {
		System.out.println("Asia -----> Chakras");

	}

}
