
public class Call {
	
	private String Date;
	private String Time;
	private long PhoneNumber;
	private int Duration;
	
	public Call(String Date, String Time, long PhoneNumber, int Duration){
		this.Time = Time;
		this.Date = Date;
		this.PhoneNumber = PhoneNumber;
		this.Duration = Duration;
	}
	
	
	@Override
	public String toString() {
		return "\n\tDate: " + Date
				+"\n\tTime: " + Time
				+"\n\tPhoneNumber: " + PhoneNumber
				+"\n\tDuration: " + Duration;
	}
	
	public double bill(){
		return Duration * (0.37 / 60);
	}

	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int duration) {
		Duration = duration;
	}
	
	
	

}
 