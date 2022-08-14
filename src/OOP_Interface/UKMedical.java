package OOP_Interface;

public interface UKMedical {

	public void dentalServices();

	public void entServices();

	public void emergencyServices();
	
	default void medicalDevelopment() {
		System.out.println("UK -- medicalDevelopment");
	}

}