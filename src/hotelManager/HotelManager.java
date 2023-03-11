package hotelManager;

import hotelManager.controller.MainFrameController;
import hotelManager.controller.RoomDialogController;
import hotelManager.view.MainFrame;

public class HotelManager {
	public static void main(String[] args) {
		MainFrameController.getInstance().init();
		RoomDialogController.getInstance().init();
	}
}
