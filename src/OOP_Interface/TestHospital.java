package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.entServices();
		fh.medicalInsurance();
		fh.medicalTraining();
		fh.medicalResearch();
		fh.medicalDevelopment();
		USMedical.billing();
		
		//top casting: child class object can be referred by parent interface ref variable
		USMedical us = new FortisHospital();
		us.cardioServices();
		us.emergencyServices();
		us.neuroServices();
		us.physioServices();
		
		UKMedical uk = new FortisHospital();
		uk.emergencyServices();
		uk.dentalServices();
		uk.entServices();
		
		//down casting:
		//FortisHospital fh1 = new USMedical();
		
		
	}

}