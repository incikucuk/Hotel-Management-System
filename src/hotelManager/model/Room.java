package hotelManager.model;

public class Room {
	private int id;
	private String roomName;
	private boolean isReserved;
	private String roomDescription;
	private int numberOfBed;
	private int roomPrice;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public String getRoomDescription() {
		return roomDescription;
	}

	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public boolean isReserved() {
		return isReserved;
	}

	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}

	public int getNumberOfBed() {
		return numberOfBed;
	}

	public void setNumberOfBed(int numberOfBed) {
		this.numberOfBed = numberOfBed;
	}

	public int getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}
	
}


