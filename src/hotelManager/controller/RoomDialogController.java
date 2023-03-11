package hotelManager.controller;

import javax.swing.SwingUtilities;

import hotelManager.model.DataStore;
import hotelManager.model.Room;
import hotelManager.view.MainFrame;
import hotelManager.view.RoomDialog;

public class RoomDialogController {
	private static RoomDialogController INSTANCE;
	private boolean isInitialized = false;
	private boolean isUpdateMode = false;
	private int counter=0;
	
	private RoomDialogController() {
		// TODO Auto-generated constructor stub
	}
	
	public static RoomDialogController getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new RoomDialogController();
		}
		return INSTANCE;
		
	}
	
	public void init() {
		try {
			if(isInitialized) {
				System.out.println("RoomDialogController.init() already called!");
				return;
			}
			initEvent();
			isInitialized = true;
		} catch (Exception e) {
			System.out.println("Hata olustu"+ e.getMessage());
		}
	}
	
	private void initEvent() {
		try {
			RoomDialog.getInstance().getBtnSaveRoom().addActionListener(e->doBtnSaveRoom());
		} catch (Exception e) {
			System.out.println("Hata olustu"+ e.getMessage());
		}
	}
	
	private void  doBtnSaveRoom() {
		try {
			String roomName = RoomDialog.getInstance().getTextFieldRoomName().getText();
			String roomDescription = RoomDialog.getInstance().getTextAreaRoomDetails().getText();
			int roomNumberOfBed = Integer.parseInt(RoomDialog.getInstance().getTextFieldNumberOfBed().getText()); 
			int roomPrice = Integer.parseInt(RoomDialog.getInstance().getTextFieldRoomPrice().getText()); 
			boolean isReserved = 	RoomDialog.getInstance().getChckbxRoomReserve().isSelected();   //verileri aldık
			
			if(isUpdateMode == true) {    //burada secilmis ola room guncellenmektedir.
				int selectedId  = MainFrame.getInstance().getTableRooms().getSelectedRow();
				int roomId = Integer.parseInt(MainFrame.getInstance().getTableRooms().getValueAt(selectedId, 0).toString()); 
				Room room = DataStore.getRoomMap().get(roomId);   //guncellemek istenen room nesnesi bulundu.
				room.setRoomName(roomName);
				room.setRoomDescription(roomDescription);
				room.setNumberOfBed(roomNumberOfBed);
				room.setRoomPrice(roomPrice);
				room.setReserved(isReserved);
				
			}
			else {
				Room room = new Room();
				room.setId(counter);
				room.setRoomName(roomName);
				room.setRoomDescription(roomDescription);
				room.setNumberOfBed(roomNumberOfBed);
				room.setRoomPrice(roomPrice);
				room.setReserved(isReserved);
				DataStore.getRoomMap().put(counter, room);  //counter=id ->> id deki room nesnesini getir.
				
			}
			show(false,false);  //pencereyi gizledik.
			MainFrameController.getInstance().fillRoomTable();  //tablodaki değerleri guncelleme
			
			
		} catch (Exception e) {
			System.out.println("Hata olustu"+ e.getMessage());
		}
	}
	
	public void show(boolean isUpdateMode,boolean visible) {
		try {
			this.isUpdateMode = isUpdateMode;
			SwingUtilities.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					if(isUpdateMode == true) {   //UPDATE
						RoomDialog.getInstance().setTitle("Update Room");
						RoomDialog.getInstance().getBtnSaveRoom().setText("Update");
						int selectedIndex = MainFrame.getInstance().getTableRooms().getSelectedRow();
						int roomId = Integer.parseInt(MainFrame.getInstance().getTableRooms().getValueAt(selectedIndex, 0).toString());  //satır id değeri bulundu
						Room room = DataStore.getRoomMap().get(roomId); ///seçilmiş room verileri geldi
						RoomDialog.getInstance().getTextFieldRoomName().setText(room.getRoomName());
						RoomDialog.getInstance().getTextAreaRoomDetails().setText(room.getRoomDescription());
						RoomDialog.getInstance().getTextFieldNumberOfBed().setText(String.valueOf(room.getNumberOfBed()));
						RoomDialog.getInstance().getTextFieldRoomPrice().setText(String.valueOf(room.getRoomPrice()));
						
					}
					else {         //ADD
						RoomDialog.getInstance().setTitle("Add Room");
						RoomDialog.getInstance().getBtnSaveRoom().setText("Add");
						RoomDialog.getInstance().getTextFieldRoomName().setText("");
						RoomDialog.getInstance().getTextAreaRoomDetails().setText("");
						RoomDialog.getInstance().getTextFieldNumberOfBed().setText("");
						RoomDialog.getInstance().getTextFieldRoomPrice().setText("");
						
					}
					RoomDialog.getInstance().setVisible(visible);
					
				}
			});
			
		} catch (Exception e) {
			System.out.println("Hata olustu"+ e.getMessage());
		}
	}
}
