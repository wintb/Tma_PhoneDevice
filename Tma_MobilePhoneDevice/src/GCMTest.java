import java.util.ArrayList;
import java.util.List;

public class GCMTest {
	
	private static List<GCM> GCMList = new ArrayList<>();
	
	private static void printLine(int a){
		System.out.println("------------------GCM " + (a+1) + " --------------------\n");
	}
	
	private static void showGCMList(){
		for(int i=0; i< GCMList.size(); i++){
			printLine(i);
			System.out.println(GCMList.get(i).toString());
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args){
		
		System.out.println(GCM.Iphone4s.toString());
		
		Battery SamSungBattery = new Battery("Intel", "3h", "3h", BatteryType.LiMH);
		DisPlay SamSungDisPlay = new DisPlay("1024x1080", "00fffx666");
		Battery HTCBatterry = new Battery("Intel", "3h", "3h", BatteryType.LiLon);
		DisPlay HTCDisPlay = new DisPlay("1024x1080", "00fffx666");
		
		GCM GalaxyNote7 = new GCM("Galaxy note7", "SamSung", 1000f, "SamSung", SamSungBattery, SamSungDisPlay);
		GCM GalaxyTrend = new GCM("Galaxy Trend", "SamSung", 1000f, "SamSung", SamSungBattery, SamSungDisPlay);
		GCM HTCOne = new GCM("HTCOne", "HTC", 1000f, "HTC", HTCBatterry, HTCDisPlay);
		
		GCMList.add(GalaxyTrend);
		GCMList.add(GalaxyNote7);
		GCMList.add(HTCOne);
		
		showGCMList();
	}

}
