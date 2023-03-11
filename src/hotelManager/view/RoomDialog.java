package hotelManager.view;

import javax.swing.JDialog;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class RoomDialog extends JDialog {
	
	private static final long serialVersionUID = -3884850197903777774L;
	private static RoomDialog INSTANCE;
	private JPanel panelRoomInfo;
	private JLabel lblRoomName;
	private JTextField textFieldRoomName;
	private JLabel lblRoomPrice;
	private JTextField textFieldRoomPrice;
	private JLabel lblNumberOfBed;
	private JTextField textFieldNumberOfBed;
	private JLabel lblRoomDetails;
	private JScrollPane scrollPaneRoomDetails;
	private JTextArea textAreaRoomDetails;
	private JLabel lblRoomReserve;
	private JCheckBox chckbxRoomReserve;
	private JPanel panelRoomButtons;
	private JButton btnSaveRoom;
	
	private RoomDialog() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{256, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		GridBagConstraints gbc_panelRoomInfo = new GridBagConstraints();
		gbc_panelRoomInfo.insets = new Insets(0, 0, 5, 0);
		gbc_panelRoomInfo.fill = GridBagConstraints.BOTH;
		gbc_panelRoomInfo.gridx = 0;
		gbc_panelRoomInfo.gridy = 0;
		getContentPane().add(getPanelRoomInfo(), gbc_panelRoomInfo);
		GridBagConstraints gbc_panelRoomButtons = new GridBagConstraints();
		gbc_panelRoomButtons.fill = GridBagConstraints.BOTH;
		gbc_panelRoomButtons.gridx = 0;
		gbc_panelRoomButtons.gridy = 1;
		getContentPane().add(getPanelRoomButtons(), gbc_panelRoomButtons);
		// TODO Auto-generated constructor stub
		pack();
	}
	
	public static RoomDialog getInstance() {
		if(RoomDialog.INSTANCE == null) {
			RoomDialog.INSTANCE = new RoomDialog();
		}
	    return INSTANCE;
	}
	public JPanel getPanelRoomInfo() {
		if (panelRoomInfo == null) {
			panelRoomInfo = new JPanel();
			GridBagLayout gbl_panelRoomInfo = new GridBagLayout();
			gbl_panelRoomInfo.columnWidths = new int[]{0, 0, 0};
			gbl_panelRoomInfo.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
			gbl_panelRoomInfo.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
			gbl_panelRoomInfo.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
			panelRoomInfo.setLayout(gbl_panelRoomInfo);
			GridBagConstraints gbc_lblRoomName = new GridBagConstraints();
			gbc_lblRoomName.insets = new Insets(0, 0, 5, 5);
			gbc_lblRoomName.anchor = GridBagConstraints.EAST;
			gbc_lblRoomName.gridx = 0;
			gbc_lblRoomName.gridy = 0;
			panelRoomInfo.add(getLblRoomName(), gbc_lblRoomName);
			GridBagConstraints gbc_textFieldRoomName = new GridBagConstraints();
			gbc_textFieldRoomName.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldRoomName.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldRoomName.gridx = 1;
			gbc_textFieldRoomName.gridy = 0;
			panelRoomInfo.add(getTextFieldRoomName(), gbc_textFieldRoomName);
			GridBagConstraints gbc_lblRoomPrice = new GridBagConstraints();
			gbc_lblRoomPrice.anchor = GridBagConstraints.EAST;
			gbc_lblRoomPrice.insets = new Insets(0, 0, 5, 5);
			gbc_lblRoomPrice.gridx = 0;
			gbc_lblRoomPrice.gridy = 1;
			panelRoomInfo.add(getLblRoomPrice(), gbc_lblRoomPrice);
			GridBagConstraints gbc_textFieldRoomPrice = new GridBagConstraints();
			gbc_textFieldRoomPrice.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldRoomPrice.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldRoomPrice.gridx = 1;
			gbc_textFieldRoomPrice.gridy = 1;
			panelRoomInfo.add(getTextFieldRoomPrice(), gbc_textFieldRoomPrice);
			GridBagConstraints gbc_lblNumberOfBed = new GridBagConstraints();
			gbc_lblNumberOfBed.anchor = GridBagConstraints.EAST;
			gbc_lblNumberOfBed.insets = new Insets(0, 0, 5, 5);
			gbc_lblNumberOfBed.gridx = 0;
			gbc_lblNumberOfBed.gridy = 2;
			panelRoomInfo.add(getLblNumberOfBed(), gbc_lblNumberOfBed);
			GridBagConstraints gbc_textFieldNumberOfBed = new GridBagConstraints();
			gbc_textFieldNumberOfBed.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldNumberOfBed.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldNumberOfBed.gridx = 1;
			gbc_textFieldNumberOfBed.gridy = 2;
			panelRoomInfo.add(getTextFieldNumberOfBed(), gbc_textFieldNumberOfBed);
			GridBagConstraints gbc_lblRoomDetails = new GridBagConstraints();
			gbc_lblRoomDetails.insets = new Insets(0, 0, 5, 5);
			gbc_lblRoomDetails.gridx = 0;
			gbc_lblRoomDetails.gridy = 3;
			panelRoomInfo.add(getLblRoomDetails(), gbc_lblRoomDetails);
			GridBagConstraints gbc_scrollPaneRoomDetails = new GridBagConstraints();
			gbc_scrollPaneRoomDetails.insets = new Insets(0, 0, 5, 0);
			gbc_scrollPaneRoomDetails.fill = GridBagConstraints.BOTH;
			gbc_scrollPaneRoomDetails.gridx = 1;
			gbc_scrollPaneRoomDetails.gridy = 3;
			panelRoomInfo.add(getScrollPaneRoomDetails(), gbc_scrollPaneRoomDetails);
			GridBagConstraints gbc_lblRoomReserve = new GridBagConstraints();
			gbc_lblRoomReserve.insets = new Insets(0, 0, 0, 5);
			gbc_lblRoomReserve.gridx = 0;
			gbc_lblRoomReserve.gridy = 4;
			panelRoomInfo.add(getLblRoomReserve(), gbc_lblRoomReserve);
			GridBagConstraints gbc_chckbxRoomReserve = new GridBagConstraints();
			gbc_chckbxRoomReserve.anchor = GridBagConstraints.WEST;
			gbc_chckbxRoomReserve.gridx = 1;
			gbc_chckbxRoomReserve.gridy = 4;
			panelRoomInfo.add(getChckbxRoomReserve(), gbc_chckbxRoomReserve);
		}
		return panelRoomInfo;
	}
	public JLabel getLblRoomName() {
		if (lblRoomName == null) {
			lblRoomName = new JLabel("Room Name:");
		}
		return lblRoomName;
	}
	public JTextField getTextFieldRoomName() {
		if (textFieldRoomName == null) {
			textFieldRoomName = new JTextField();
			textFieldRoomName.setColumns(10);
		}
		return textFieldRoomName;
	}
	public JLabel getLblRoomPrice() {
		if (lblRoomPrice == null) {
			lblRoomPrice = new JLabel("Room Price:");
		}
		return lblRoomPrice;
	}
	public JTextField getTextFieldRoomPrice() {
		if (textFieldRoomPrice == null) {
			textFieldRoomPrice = new JTextField();
			textFieldRoomPrice.setColumns(10);
		}
		return textFieldRoomPrice;
	}
	public JLabel getLblNumberOfBed() {
		if (lblNumberOfBed == null) {
			lblNumberOfBed = new JLabel("Number Of Bed:");
		}
		return lblNumberOfBed;
	}
	public JTextField getTextFieldNumberOfBed() {
		if (textFieldNumberOfBed == null) {
			textFieldNumberOfBed = new JTextField();
			textFieldNumberOfBed.setColumns(10);
		}
		return textFieldNumberOfBed;
	}
	public JLabel getLblRoomDetails() {
		if (lblRoomDetails == null) {
			lblRoomDetails = new JLabel("Room Details:");
		}
		return lblRoomDetails;
	}
	public JScrollPane getScrollPaneRoomDetails() {
		if (scrollPaneRoomDetails == null) {
			scrollPaneRoomDetails = new JScrollPane();
			scrollPaneRoomDetails.setViewportView(getTextAreaRoomDetails());
		}
		return scrollPaneRoomDetails;
	}
	public JTextArea getTextAreaRoomDetails() {
		if (textAreaRoomDetails == null) {
			textAreaRoomDetails = new JTextArea();
			textAreaRoomDetails.setRows(5);
			textAreaRoomDetails.setLineWrap(true);
		}
		return textAreaRoomDetails;
	}
	public JLabel getLblRoomReserve() {
		if (lblRoomReserve == null) {
			lblRoomReserve = new JLabel("Room Reserve:");
		}
		return lblRoomReserve;
	}
	public JCheckBox getChckbxRoomReserve() {
		if (chckbxRoomReserve == null) {
			chckbxRoomReserve = new JCheckBox("");
		}
		return chckbxRoomReserve;
	}
	public JPanel getPanelRoomButtons() {
		if (panelRoomButtons == null) {
			panelRoomButtons = new JPanel();
			GridBagLayout gbl_panelRoomButtons = new GridBagLayout();
			gbl_panelRoomButtons.columnWidths = new int[]{0, 0};
			gbl_panelRoomButtons.rowHeights = new int[]{0, 0};
			gbl_panelRoomButtons.columnWeights = new double[]{0.0, Double.MIN_VALUE};
			gbl_panelRoomButtons.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panelRoomButtons.setLayout(gbl_panelRoomButtons);
			GridBagConstraints gbc_btnSaveRoom = new GridBagConstraints();
			gbc_btnSaveRoom.gridx = 0;
			gbc_btnSaveRoom.gridy = 0;
			panelRoomButtons.add(getBtnSaveRoom(), gbc_btnSaveRoom);
		}
		return panelRoomButtons;
	}
	public JButton getBtnSaveRoom() {
		if (btnSaveRoom == null) {
			btnSaveRoom = new JButton("Save Room");
		}
		return btnSaveRoom;
	}
}
