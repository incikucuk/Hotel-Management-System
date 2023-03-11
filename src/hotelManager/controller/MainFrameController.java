package hotelManager.controller;

import java.util.Map.Entry;

import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import hotelManager.model.DataStore;
import hotelManager.model.Room;
import hotelManager.view.MainFrame;

public class MainFrameController {
	private static MainFrameController INSTANCE;
	private boolean isInitialized=false;
	
	private MainFrameController() {
		// TODO Auto-generated constructor stub
	}
	
	//////////////////////
	////// PRİVATE //////
	////////////////////
	
	private void initComponents() {
		try {
			SwingUtilities.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					//TODO..
				}
			});
		} catch (Exception e) {
			System.out.println("Hata olustu"+ e.getMessage());
		}
	}
	
	private void initComponentsData() {
		try {
			SwingUtilities.invokeLater(new Runnable() {

				@Override
				public void run() {
					fillRoomTable();
				}
				
			});
		} catch (Exception e) {
			System.out.println("Hata olustu"+ e.getMessage());
		}
	}
	private void initEvents() {   //buton gibi şeylerin eventleri burada bağlanır.
		try {
			MainFrame.getInstance().getBtnAddRoom().addActionListener(e -> doClickBtnAddRoom());
			MainFrame.getInstance().getBtnUpdate().addActionListener(e -> doClickUpdateRoom());
			MainFrame.getInstance().getBtnDeleteRoom().addActionListener(e -> doClickRemoveRoom());
		} catch (Exception e) {
			System.out.println("Hata olustu"+ e.getMessage());
		}
	}
	private void doClickUpdateRoom() {
		try {
			RoomDialogController.getInstance().show(true, true);   //update ekran görünümü sağlar.
		} catch (Exception e) {
			System.out.println("Hata olustu"+ e.getMessage());
		}
	}
	private void doClickBtnAddRoom()
	{
		try {
			RoomDialogController.getInstance().show(false, true);   //add ekran görünümü sağlar.
		} catch (Exception e) {
			System.out.println("Hata olustu"+ e.getMessage());
		}
	}
	private void doClickRemoveRoom() {
		try {
			int selectedRow = MainFrame.getInstance().getTableRooms().getSelectedRow();
			if(selectedRow > -1) {
				int roomId = Integer.parseInt(MainFrame.getInstance().getTableRooms().getValueAt(selectedRow, 0).toString()); 
				DataStore.getRoomMap().remove(roomId);
				fillRoomTable();  //tabloyu günceller.
			
			}
		} catch (Exception e) {
			System.out.println("Hata olustu"+ e.getMessage());
		}
	}
	
	
	public void fillRoomTable() {
		//room verilerini tabloya doldurmak
		try {
			DefaultTableModel tableModel = (DefaultTableModel) MainFrame.getInstance().getTableRooms().getModel();
			tableModel.setRowCount(0);
			
			for(Entry<Integer, Room> room : DataStore.getRoomMap().entrySet()) {
			
				tableModel.addRow(new Object[] {
						room.getValue().getId(),
						room.getValue().getRoomName(),
						room.getValue().isReserved(),
						room.getValue().getNumberOfBed(),
						room.getValue().getRoomPrice()	
				});
			}
		} catch (Exception e) {
			System.out.println("Hata olustu"+ e.getMessage());
		}
	}
	public static MainFrameController getInstance() {
		if(INSTANCE == null) {
			MainFrameController.INSTANCE = new MainFrameController();
		}
		return INSTANCE;
	}
	
	public void init() {    //component ve eventleri ilklerndiriyoruz.
		try {
			if(isInitialized) {
				System.out.println("MainFrameController.init() already called!");
				return;
			}
			
			MainFrame.getInstance().setVisible(true);
			initComponents();
			initComponentsData();
			initEvents();
			
			isInitialized =true;
			
		} catch (Exception e) {
			System.out.println("Hata olustu"+ e.getMessage());
		}
	}
}
