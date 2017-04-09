import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GCM {
	
	private String model;
	private String manufacturer;
	private float price;
	private String owner;
	
	private Battery battery;
	private DisPlay disPlay;
	private Call call;
	
	//call history
	private List<Call> callHistory = new ArrayList<>();
	
	//Iphone 4s
	private static final Battery batteryIphone4S = new Battery("Battery4s", "3h", "3h", BatteryType.LiLon);
	private static final DisPlay display4S = new DisPlay("1024x1080", "00fffx666");
	public static final GCM Iphone4s = new GCM("Intel", "Apple", 1000f, "Apple", batteryIphone4S, display4S);
	
	public GCM(String model, String manufacturer, float price, String owner, Battery battery, DisPlay display){
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
		this.owner = owner;
		this.battery = battery;
		this.disPlay = display;
	}
	
	@Override
	public String toString() {
		return "Model: " + model 
				+ "\nManufacturer: " + manufacturer
				+ "\nPrice: " + price
				+ "\nOwner: " + owner
				+ battery
				+ disPlay;
		
	}
	
	// List call history
	public void CallHistory(){
		for(int i=0; i < callHistory.size(); i++){
			System.out.println("History " + (i+1) + " :");
			System.out.println(callHistory.get(i));
		}
	}
	
	// Add call to call history
	public void AddHistory(Call call){
		if(call != null){
			callHistory.add(call);
		}
	}
	
	//delete call from call history
	public void deleteHistory(Call call){
		if (call != null) {
			callHistory.remove(call);
		}
	}
	
	//clear the call history
	public void clearHistory(){
		if (callHistory != null) {
			callHistory.clear();
			System.out.println("The call history was deleted");
		}
	}
	
	//calculator price of the calls in the call history
	public void totalPriceCallHistory(){
		double totalPrice = 0.00d;
		for(int i=0; i< callHistory.size(); i++){
			totalPrice += callHistory.get(i).bill();
		}
		System.out.println("\nTotal price: " + totalPrice);
	}
	
	public void deleteCallLongest(){
		if(callHistory != null){
			Collections.sort(callHistory, new DurationComparator());
			callHistory.remove(callHistory.size()-1);
			System.out.println("\nThe call longest was deleted");
		}
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	public DisPlay getDisPlay() {
		return disPlay;
	}
	public void setDisPlay(DisPlay disPlay) {
		this.disPlay = disPlay;
	}
	public Call getCall() {
		return call;
	}
	public void setCall(Call call) {
		this.call = call;
	}
	
	

}
