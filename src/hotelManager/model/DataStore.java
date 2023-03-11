package hotelManager.model;

import java.util.HashMap;
import java.util.Map;

public class DataStore {
	private static Map<Integer, Room> roomMap = new HashMap<>();
	private static Map<Integer, Person> personMap = new HashMap<>();
	private static Map<Integer, Order> orderMap = new HashMap<>();
	
	private DataStore() {
		// TODO Auto-generated constructor stub
	}
	public static Map<Integer,Room> getRoomMap(){
		return roomMap;
	}
	public static Map<Integer,Person> getPersonMap(){
		return personMap;
	}
	public static Map<Integer,Order> getOrderMap(){
		return orderMap;
	}
}
