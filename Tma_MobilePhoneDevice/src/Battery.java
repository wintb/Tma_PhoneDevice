
public class Battery {
	
	private String Model;
	private String HoursIdle;
	private String HoursTalk;
	private String Type;
	
	//BatteryType batteryType;
	
	public Battery(String Model, String HoursIdle, String HoursTalk, BatteryType batteryType){
		this.Model = Model;
		this.HoursIdle = HoursIdle;
		this.HoursTalk = HoursTalk;
		
		//this.batteryType = batteryType;
		switch (batteryType) {
		case LiLon:
			Type = "Li-Lon";
			break;
		case LiMH:
			Type = "LiMH";
			break;
		case NiCD:
			Type = "NiCD";
			break;
		default:
			break;
		}
		
	}

	@Override
	public String toString() {
		return "\nBattery:\n\tModel: " + Model
				+"\n\tHourssIdle: " + HoursIdle
				+"\n\tHoursTalk: " + HoursTalk
				+"\n\tType: " + Type;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getHoursIdle() {
		return HoursIdle;
	}

	public void setHoursIdle(String hoursIdle) {
		HoursIdle = hoursIdle;
	}

	public String getHoursTalk() {
		return HoursTalk;
	}

	public void setHoursTalk(String hoursTalk) {
		HoursTalk = hoursTalk;
	}
	
	

}
