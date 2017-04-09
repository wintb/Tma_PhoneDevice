
public class GCMCallHistoryTest {
	
	public static void main(String[] args){
		Call call = new Call("4/8/2017", "3:43PM", 989158462, 60);
		Call call2 = new Call("4/9/2017", "5:43PM", 989158462, 120);
		Call call3 = new Call("4/10/2017", "5:43PM", 989158462, 20);
		
		Battery SamSungBattery = new Battery("Intel", "3h", "3h", BatteryType.LiMH);
		DisPlay SamSungDisPlay = new DisPlay("1024x1080", "00fffx666");
		Battery HTCBatterry = new Battery("Intel", "3h", "3h", BatteryType.LiLon);
		DisPlay HTCDisPlay = new DisPlay("1024x1080", "00fffx666");
		
		GCM GalaxyNote7 = new GCM("Galaxy note7", "SamSung", 1000f, "SamSung", SamSungBattery, SamSungDisPlay);
		GCM GalaxyTrend = new GCM("Galaxy Trend", "SamSung", 1000f, "SamSung", SamSungBattery, SamSungDisPlay);
		GCM HTCOne = new GCM("HTCOne", "HTC", 1000f, "HTC", HTCBatterry, HTCDisPlay);
		
		GalaxyNote7.AddHistory(call);
		GalaxyNote7.AddHistory(call2);
		GalaxyNote7.AddHistory(call3);
		GalaxyNote7.CallHistory();
		GalaxyNote7.totalPriceCallHistory();
		
		GalaxyNote7.deleteCallLongest();
		GalaxyNote7.CallHistory();
		
		
	}

}
