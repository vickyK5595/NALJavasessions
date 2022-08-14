package assignmentEnum;

public enum SpeedLimit {
	
	VillageRoad(50),
	PanchayatRoad(60),
	CityRoad(80),
	Highway(100),
	NH(150);

	private int speed;

	SpeedLimit(int speed) {
		this.speed = speed;
	}
	
	public int displaySpeed() {
		return this.speed;
	}

}
