package hotelManager.view;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class MainFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8823770690648605464L;
	private static MainFrame INSTANCE;
	private JPanel panelRooms;
	private JPanel panelRoomFilter;
	private JTextField textFieldRoomFilter;
	private JButton btnRoomFilter;
	private JPanel panelRoomData;
	private JScrollPane scrollPaneRoomData;
	private JTable tableRooms;
	private JPanel panelRoomTableButtons;
	private JButton btnAddRoom;
	private JButton btnUpdate;
	private JButton btnDeleteRoom;
	private JButton btnCreateReservation;
	private JButton btnDeleteReservation;
	private JPanel panelPerson;
	private JPanel panelPersonFilter;
	private JTextField textFieldPersonFilter;
	private JButton btnFilterPerson;
	private JPanel panelPersonTable;
	private JScrollPane scrollPanePersonTable;
	private JTable tablePerson;
	private JPanel panelPersonTableButtons;
	private JButton btnAddPerson;
	private JButton btnUpdatePerson;
	private JButton btnDeletePerson;
	private JButton btnAddTask;
	private JButton btnUpdateTask;
	private JPanel panelOrder;
	private JPanel panelMenu;
	private JComboBox comboBoxFoods;
	private JComboBox comboBoxBeverages;
	private JPanel panelOrderTable;
	private JScrollPane scrollPaneOrderTable;
	private JTable tableOrder;
	private JPanel panelOrderFunctions;
	private JTextField textFieldRoomNumber;
	private JLabel lblRoomid;
	private JButton btnCreateOrder;
	
	private MainFrame() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		GridBagConstraints gbc_panelRooms = new GridBagConstraints();
		gbc_panelRooms.insets = new Insets(0, 0, 5, 0);
		gbc_panelRooms.fill = GridBagConstraints.BOTH;
		gbc_panelRooms.gridx = 0;
		gbc_panelRooms.gridy = 0;
		getContentPane().add(getPanelRooms(), gbc_panelRooms);
		GridBagConstraints gbc_panelPerson = new GridBagConstraints();
		gbc_panelPerson.insets = new Insets(0, 0, 5, 0);
		gbc_panelPerson.fill = GridBagConstraints.BOTH;
		gbc_panelPerson.gridx = 0;
		gbc_panelPerson.gridy = 1;
		getContentPane().add(getPanelPerson(), gbc_panelPerson);
		GridBagConstraints gbc_panelOrder = new GridBagConstraints();
		gbc_panelOrder.fill = GridBagConstraints.BOTH;
		gbc_panelOrder.gridx = 0;
		gbc_panelOrder.gridy = 2;
		getContentPane().add(getPanelOrder(), gbc_panelOrder);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);  //uygulama tamamen kapatılmasını sağlar.
		pack(); //frame'i düzenler.
	}
	
	public static MainFrame getInstance() {
		if(MainFrame.INSTANCE ==null) {
			MainFrame.INSTANCE = new MainFrame();
		}
		
		return INSTANCE;
	}
	
	public JPanel getPanelRooms() {
		if (panelRooms == null) {
			panelRooms = new JPanel();
			panelRooms.setBorder(new TitledBorder(null, "Room Table", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagLayout gbl_panelRooms = new GridBagLayout();
			gbl_panelRooms.columnWidths = new int[]{0, 0};
			gbl_panelRooms.rowHeights = new int[]{0, 1, 0};
			gbl_panelRooms.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gbl_panelRooms.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
			panelRooms.setLayout(gbl_panelRooms);
			GridBagConstraints gbc_panelRoomFilter = new GridBagConstraints();
			gbc_panelRoomFilter.insets = new Insets(0, 0, 5, 0);
			gbc_panelRoomFilter.fill = GridBagConstraints.BOTH;
			gbc_panelRoomFilter.gridx = 0;
			gbc_panelRoomFilter.gridy = 0;
			panelRooms.add(getPanelRoomFilter(), gbc_panelRoomFilter);
			GridBagConstraints gbc_panelRoomData = new GridBagConstraints();
			gbc_panelRoomData.fill = GridBagConstraints.BOTH;
			gbc_panelRoomData.gridx = 0;
			gbc_panelRoomData.gridy = 1;
			panelRooms.add(getPanelRoomData(), gbc_panelRoomData);
		}
		return panelRooms;
	}
	public JPanel getPanelRoomFilter() {
		if (panelRoomFilter == null) {
			panelRoomFilter = new JPanel();
			GridBagLayout gbl_panelRoomFilter = new GridBagLayout();
			gbl_panelRoomFilter.columnWidths = new int[]{0, 0, 0};
			gbl_panelRoomFilter.rowHeights = new int[]{0, 0};
			gbl_panelRoomFilter.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
			gbl_panelRoomFilter.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panelRoomFilter.setLayout(gbl_panelRoomFilter);
			GridBagConstraints gbc_textFieldRoomFilter = new GridBagConstraints();
			gbc_textFieldRoomFilter.insets = new Insets(0, 0, 0, 5);
			gbc_textFieldRoomFilter.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldRoomFilter.gridx = 0;
			gbc_textFieldRoomFilter.gridy = 0;
			panelRoomFilter.add(getTextFieldRoomFilter(), gbc_textFieldRoomFilter);
			GridBagConstraints gbc_btnRoomFilter = new GridBagConstraints();
			gbc_btnRoomFilter.gridx = 1;
			gbc_btnRoomFilter.gridy = 0;
			panelRoomFilter.add(getBtnRoomFilter(), gbc_btnRoomFilter);
		}
		return panelRoomFilter;
	}
	public JTextField getTextFieldRoomFilter() {
		if (textFieldRoomFilter == null) {
			textFieldRoomFilter = new JTextField();
			textFieldRoomFilter.setColumns(10);
		}
		return textFieldRoomFilter;
	}
	public JButton getBtnRoomFilter() {
		if (btnRoomFilter == null) {
			btnRoomFilter = new JButton("Filter");
		}
		return btnRoomFilter;
	}
	public JPanel getPanelRoomData() {
		if (panelRoomData == null) {
			panelRoomData = new JPanel();
			GridBagLayout gbl_panelRoomData = new GridBagLayout();
			gbl_panelRoomData.columnWidths = new int[]{0, 0, 0};
			gbl_panelRoomData.rowHeights = new int[]{0, 0};
			gbl_panelRoomData.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
			gbl_panelRoomData.rowWeights = new double[]{1.0, Double.MIN_VALUE};
			panelRoomData.setLayout(gbl_panelRoomData);
			GridBagConstraints gbc_scrollPaneRoomData = new GridBagConstraints();
			gbc_scrollPaneRoomData.insets = new Insets(0, 0, 0, 5);
			gbc_scrollPaneRoomData.fill = GridBagConstraints.BOTH;
			gbc_scrollPaneRoomData.gridx = 0;
			gbc_scrollPaneRoomData.gridy = 0;
			panelRoomData.add(getScrollPaneRoomData(), gbc_scrollPaneRoomData);
			GridBagConstraints gbc_panelRoomTableButtons = new GridBagConstraints();
			gbc_panelRoomTableButtons.fill = GridBagConstraints.BOTH;
			gbc_panelRoomTableButtons.gridx = 1;
			gbc_panelRoomTableButtons.gridy = 0;
			panelRoomData.add(getPanelRoomTableButtons(), gbc_panelRoomTableButtons);
		}
		return panelRoomData;
	}
	public JScrollPane getScrollPaneRoomData() {
		if (scrollPaneRoomData == null) {
			scrollPaneRoomData = new JScrollPane();
			scrollPaneRoomData.setViewportView(getTableRooms());
		}
		return scrollPaneRoomData;
	}
	public JTable getTableRooms() {
		if (tableRooms == null) {
			tableRooms = new JTable();
			DefaultTableModel tableModel = new DefaultTableModel() {
				@Override
				public boolean isCellEditable(int row, int column) {
					// TODO Auto-generated method stub
					return false;
				}
			};
			tableModel.addColumn("ID");
			tableModel.addColumn("ROOM NAME");
			tableModel.addColumn("STATE");
			tableModel.addColumn("NUMBER OF BED");
			tableModel.addColumn("ROOM PRICE");
			tableRooms.setModel(tableModel);
			tableRooms.setPreferredScrollableViewportSize(new Dimension(800,200));
			tableRooms.getColumnModel().getColumn(0).setMinWidth(50);
			tableRooms.getColumnModel().getColumn(0).setMaxWidth(50);
		}
		return tableRooms;
	}
	public JPanel getPanelRoomTableButtons() {
		if (panelRoomTableButtons == null) {
			panelRoomTableButtons = new JPanel();
			GridBagLayout gbl_panelRoomTableButtons = new GridBagLayout();
			gbl_panelRoomTableButtons.columnWidths = new int[]{0, 0};
			gbl_panelRoomTableButtons.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
			gbl_panelRoomTableButtons.columnWeights = new double[]{0.0, Double.MIN_VALUE};
			gbl_panelRoomTableButtons.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panelRoomTableButtons.setLayout(gbl_panelRoomTableButtons);
			GridBagConstraints gbc_btnAddRoom = new GridBagConstraints();
			gbc_btnAddRoom.insets = new Insets(0, 0, 5, 0);
			gbc_btnAddRoom.gridx = 0;
			gbc_btnAddRoom.gridy = 0;
			panelRoomTableButtons.add(getBtnAddRoom(), gbc_btnAddRoom);
			GridBagConstraints gbc_btnUpdate = new GridBagConstraints();
			gbc_btnUpdate.insets = new Insets(0, 0, 5, 0);
			gbc_btnUpdate.gridx = 0;
			gbc_btnUpdate.gridy = 1;
			panelRoomTableButtons.add(getBtnUpdate(), gbc_btnUpdate);
			GridBagConstraints gbc_btnDeleteRoom = new GridBagConstraints();
			gbc_btnDeleteRoom.insets = new Insets(0, 0, 5, 0);
			gbc_btnDeleteRoom.gridx = 0;
			gbc_btnDeleteRoom.gridy = 2;
			panelRoomTableButtons.add(getBtnDeleteRoom(), gbc_btnDeleteRoom);
			GridBagConstraints gbc_btnCreateReservation = new GridBagConstraints();
			gbc_btnCreateReservation.insets = new Insets(0, 0, 5, 0);
			gbc_btnCreateReservation.gridx = 0;
			gbc_btnCreateReservation.gridy = 3;
			panelRoomTableButtons.add(getBtnCreateReservation(), gbc_btnCreateReservation);
			GridBagConstraints gbc_btnDeleteReservation = new GridBagConstraints();
			gbc_btnDeleteReservation.gridx = 0;
			gbc_btnDeleteReservation.gridy = 4;
			panelRoomTableButtons.add(getBtnDeleteReservation(), gbc_btnDeleteReservation);
		}
		return panelRoomTableButtons;
	}
	public JButton getBtnAddRoom() {
		if (btnAddRoom == null) {
			btnAddRoom = new JButton("");
			btnAddRoom.setIcon(new ImageIcon("C:\\Users\\incik\\Downloads\\plus.png"));
		}
		return btnAddRoom;
	}
	public JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("");
			btnUpdate.setIcon(new ImageIcon("C:\\Users\\incik\\Downloads\\pencil.png"));
		}
		return btnUpdate;
	}
	public JButton getBtnDeleteRoom() {
		if (btnDeleteRoom == null) {
			btnDeleteRoom = new JButton("");
			btnDeleteRoom.setIcon(new ImageIcon("C:\\Users\\incik\\Downloads\\minus.png"));
		}
		return btnDeleteRoom;
	}
	public JButton getBtnCreateReservation() {
		if (btnCreateReservation == null) {
			btnCreateReservation = new JButton("");
			btnCreateReservation.setIcon(new ImageIcon("C:\\Users\\incik\\Downloads\\booking.png"));
		}
		return btnCreateReservation;
	}
	public JButton getBtnDeleteReservation() {
		if (btnDeleteReservation == null) {
			btnDeleteReservation = new JButton("");
			btnDeleteReservation.setIcon(new ImageIcon("C:\\Users\\incik\\Downloads\\cancel-event.png"));
		}
		return btnDeleteReservation;
	}
	public JPanel getPanelPerson() {
		if (panelPerson == null) {
			panelPerson = new JPanel();
			panelPerson.setBorder(new TitledBorder(null, "Person Table", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagLayout gbl_panelPerson = new GridBagLayout();
			gbl_panelPerson.columnWidths = new int[]{0, 0};
			gbl_panelPerson.rowHeights = new int[]{0, 0, 0};
			gbl_panelPerson.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gbl_panelPerson.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
			panelPerson.setLayout(gbl_panelPerson);
			GridBagConstraints gbc_panelPersonFilter = new GridBagConstraints();
			gbc_panelPersonFilter.insets = new Insets(0, 0, 5, 0);
			gbc_panelPersonFilter.fill = GridBagConstraints.BOTH;
			gbc_panelPersonFilter.gridx = 0;
			gbc_panelPersonFilter.gridy = 0;
			panelPerson.add(getPanelPersonFilter(), gbc_panelPersonFilter);
			GridBagConstraints gbc_panelPersonTable = new GridBagConstraints();
			gbc_panelPersonTable.fill = GridBagConstraints.BOTH;
			gbc_panelPersonTable.gridx = 0;
			gbc_panelPersonTable.gridy = 1;
			panelPerson.add(getPanelPersonTable(), gbc_panelPersonTable);
		}
		return panelPerson;
	}
	public JPanel getPanelPersonFilter() {
		if (panelPersonFilter == null) {
			panelPersonFilter = new JPanel();
			GridBagLayout gbl_panelPersonFilter = new GridBagLayout();
			gbl_panelPersonFilter.columnWidths = new int[]{0, 0, 0};
			gbl_panelPersonFilter.rowHeights = new int[]{0, 0};
			gbl_panelPersonFilter.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
			gbl_panelPersonFilter.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panelPersonFilter.setLayout(gbl_panelPersonFilter);
			GridBagConstraints gbc_textFieldPersonFilter = new GridBagConstraints();
			gbc_textFieldPersonFilter.insets = new Insets(0, 0, 0, 5);
			gbc_textFieldPersonFilter.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldPersonFilter.gridx = 0;
			gbc_textFieldPersonFilter.gridy = 0;
			panelPersonFilter.add(getTextFieldPersonFilter(), gbc_textFieldPersonFilter);
			GridBagConstraints gbc_btnFilterPerson = new GridBagConstraints();
			gbc_btnFilterPerson.gridx = 1;
			gbc_btnFilterPerson.gridy = 0;
			panelPersonFilter.add(getBtnFilterPerson(), gbc_btnFilterPerson);
		}
		return panelPersonFilter;
	}
	public JTextField getTextFieldPersonFilter() {
		if (textFieldPersonFilter == null) {
			textFieldPersonFilter = new JTextField();
			textFieldPersonFilter.setColumns(10);
		}
		return textFieldPersonFilter;
	}
	public JButton getBtnFilterPerson() {
		if (btnFilterPerson == null) {
			btnFilterPerson = new JButton("Filter");
		}
		return btnFilterPerson;
	}
	public JPanel getPanelPersonTable() {
		if (panelPersonTable == null) {
			panelPersonTable = new JPanel();
			GridBagLayout gbl_panelPersonTable = new GridBagLayout();
			gbl_panelPersonTable.columnWidths = new int[]{0, 0, 0};
			gbl_panelPersonTable.rowHeights = new int[]{0, 0};
			gbl_panelPersonTable.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
			gbl_panelPersonTable.rowWeights = new double[]{1.0, Double.MIN_VALUE};
			panelPersonTable.setLayout(gbl_panelPersonTable);
			GridBagConstraints gbc_scrollPanePersonTable = new GridBagConstraints();
			gbc_scrollPanePersonTable.insets = new Insets(0, 0, 0, 5);
			gbc_scrollPanePersonTable.fill = GridBagConstraints.BOTH;
			gbc_scrollPanePersonTable.gridx = 0;
			gbc_scrollPanePersonTable.gridy = 0;
			panelPersonTable.add(getScrollPanePersonTable(), gbc_scrollPanePersonTable);
			GridBagConstraints gbc_panelPersonTableButtons = new GridBagConstraints();
			gbc_panelPersonTableButtons.fill = GridBagConstraints.BOTH;
			gbc_panelPersonTableButtons.gridx = 1;
			gbc_panelPersonTableButtons.gridy = 0;
			panelPersonTable.add(getPanelPersonTableButtons(), gbc_panelPersonTableButtons);
		}
		return panelPersonTable;
	}
	public JScrollPane getScrollPanePersonTable() {
		if (scrollPanePersonTable == null) {
			scrollPanePersonTable = new JScrollPane();
			scrollPanePersonTable.setViewportView(getTablePerson());
		}
		return scrollPanePersonTable;
	}
	public JTable getTablePerson() {
		if (tablePerson == null) {
			tablePerson = new JTable();
			DefaultTableModel defaultTableModel = new DefaultTableModel();
			defaultTableModel.addColumn("ID");
			defaultTableModel.addColumn("NAME");
			defaultTableModel.addColumn("POSITION");
			defaultTableModel.addColumn("PERSON STATUS");
			tablePerson.setModel(defaultTableModel);
			tablePerson.setPreferredScrollableViewportSize(new Dimension(800,200));
			tablePerson.getColumnModel().getColumn(0).setMinWidth(50);
			tablePerson.getColumnModel().getColumn(0).setMaxWidth(50);
		}
		return tablePerson;
	}
	public JPanel getPanelPersonTableButtons() {
		if (panelPersonTableButtons == null) {
			panelPersonTableButtons = new JPanel();
			GridBagLayout gbl_panelPersonTableButtons = new GridBagLayout();
			gbl_panelPersonTableButtons.columnWidths = new int[]{49, 0};
			gbl_panelPersonTableButtons.rowHeights = new int[]{25, 25, 25, 0, 0, 0};
			gbl_panelPersonTableButtons.columnWeights = new double[]{0.0, Double.MIN_VALUE};
			gbl_panelPersonTableButtons.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panelPersonTableButtons.setLayout(gbl_panelPersonTableButtons);
			GridBagConstraints gbc_btnAddPerson = new GridBagConstraints();
			gbc_btnAddPerson.insets = new Insets(0, 0, 5, 0);
			gbc_btnAddPerson.gridx = 0;
			gbc_btnAddPerson.gridy = 0;
			panelPersonTableButtons.add(getBtnAddPerson(), gbc_btnAddPerson);
			GridBagConstraints gbc_btnUpdatePerson = new GridBagConstraints();
			gbc_btnUpdatePerson.insets = new Insets(0, 0, 5, 0);
			gbc_btnUpdatePerson.gridx = 0;
			gbc_btnUpdatePerson.gridy = 1;
			panelPersonTableButtons.add(getBtnUpdatePerson(), gbc_btnUpdatePerson);
			GridBagConstraints gbc_btnDeletePerson = new GridBagConstraints();
			gbc_btnDeletePerson.insets = new Insets(0, 0, 5, 0);
			gbc_btnDeletePerson.gridx = 0;
			gbc_btnDeletePerson.gridy = 2;
			panelPersonTableButtons.add(getBtnDeletePerson(), gbc_btnDeletePerson);
			GridBagConstraints gbc_btnAddTask = new GridBagConstraints();
			gbc_btnAddTask.insets = new Insets(0, 0, 5, 0);
			gbc_btnAddTask.gridx = 0;
			gbc_btnAddTask.gridy = 3;
			panelPersonTableButtons.add(getBtnAddTask(), gbc_btnAddTask);
			GridBagConstraints gbc_btnUpdateTask = new GridBagConstraints();
			gbc_btnUpdateTask.gridx = 0;
			gbc_btnUpdateTask.gridy = 4;
			panelPersonTableButtons.add(getBtnUpdateTask(), gbc_btnUpdateTask);
		}
		return panelPersonTableButtons;
	}
	public JButton getBtnAddPerson() {
		if (btnAddPerson == null) {
			btnAddPerson = new JButton("");
			btnAddPerson.setIcon(new ImageIcon("C:\\Users\\incik\\Downloads\\plus.png"));
		}
		return btnAddPerson;
	}
	public JButton getBtnUpdatePerson() {
		if (btnUpdatePerson == null) {
			btnUpdatePerson = new JButton("");
			btnUpdatePerson.setIcon(new ImageIcon("C:\\Users\\incik\\Downloads\\pencil.png"));
		}
		return btnUpdatePerson;
	}
	public JButton getBtnDeletePerson() {
		if (btnDeletePerson == null) {
			btnDeletePerson = new JButton("");
			btnDeletePerson.setIcon(new ImageIcon("C:\\Users\\incik\\Downloads\\minus.png"));
		}
		return btnDeletePerson;
	}
	public JButton getBtnAddTask() {
		if (btnAddTask == null) {
			btnAddTask = new JButton("");
			btnAddTask.setIcon(new ImageIcon("C:\\Users\\incik\\Downloads\\selected.png"));
		}
		return btnAddTask;
	}
	public JButton getBtnUpdateTask() {
		if (btnUpdateTask == null) {
			btnUpdateTask = new JButton("");
			btnUpdateTask.setIcon(new ImageIcon("C:\\Users\\incik\\Downloads\\user-profile.png"));
		}
		return btnUpdateTask;
	}
	public JPanel getPanelOrder() {
		if (panelOrder == null) {
			panelOrder = new JPanel();
			panelOrder.setBorder(new TitledBorder(null, "Order", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			GridBagLayout gbl_panelOrder = new GridBagLayout();
			gbl_panelOrder.columnWidths = new int[]{0, 0};
			gbl_panelOrder.rowHeights = new int[]{0, 0, 0, 0};
			gbl_panelOrder.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gbl_panelOrder.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
			panelOrder.setLayout(gbl_panelOrder);
			GridBagConstraints gbc_panelMenu = new GridBagConstraints();
			gbc_panelMenu.insets = new Insets(0, 0, 5, 0);
			gbc_panelMenu.fill = GridBagConstraints.BOTH;
			gbc_panelMenu.gridx = 0;
			gbc_panelMenu.gridy = 0;
			panelOrder.add(getPanelMenu(), gbc_panelMenu);
			GridBagConstraints gbc_panelOrderTable = new GridBagConstraints();
			gbc_panelOrderTable.insets = new Insets(0, 0, 5, 0);
			gbc_panelOrderTable.fill = GridBagConstraints.BOTH;
			gbc_panelOrderTable.gridx = 0;
			gbc_panelOrderTable.gridy = 1;
			panelOrder.add(getPanelOrderTable(), gbc_panelOrderTable);
			GridBagConstraints gbc_panelOrderFunctions = new GridBagConstraints();
			gbc_panelOrderFunctions.fill = GridBagConstraints.BOTH;
			gbc_panelOrderFunctions.gridx = 0;
			gbc_panelOrderFunctions.gridy = 2;
			panelOrder.add(getPanelOrderFunctions(), gbc_panelOrderFunctions);
		}
		return panelOrder;
	}
	public JPanel getPanelMenu() {
		if (panelMenu == null) {
			panelMenu = new JPanel();
			GridBagLayout gbl_panelMenu = new GridBagLayout();
			gbl_panelMenu.columnWidths = new int[]{0, 0, 0};
			gbl_panelMenu.rowHeights = new int[]{0, 0};
			gbl_panelMenu.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			gbl_panelMenu.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panelMenu.setLayout(gbl_panelMenu);
			GridBagConstraints gbc_comboBoxFoods = new GridBagConstraints();
			gbc_comboBoxFoods.insets = new Insets(0, 0, 0, 5);
			gbc_comboBoxFoods.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBoxFoods.gridx = 0;
			gbc_comboBoxFoods.gridy = 0;
			panelMenu.add(getComboBoxFoods(), gbc_comboBoxFoods);
			GridBagConstraints gbc_comboBoxBeverages = new GridBagConstraints();
			gbc_comboBoxBeverages.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBoxBeverages.gridx = 1;
			gbc_comboBoxBeverages.gridy = 0;
			panelMenu.add(getComboBoxBeverages(), gbc_comboBoxBeverages);
		}
		return panelMenu;
	}
	public JComboBox getComboBoxFoods() {
		if (comboBoxFoods == null) {
			comboBoxFoods = new JComboBox();
			comboBoxFoods.setModel(new DefaultComboBoxModel(new String[] {"pizza", "hamburger", "fish", "pasta", "cake", "kebap", "doner"}));
		}
		return comboBoxFoods;
	}
	public JComboBox getComboBoxBeverages() {
		if (comboBoxBeverages == null) {
			comboBoxBeverages = new JComboBox();
			comboBoxBeverages.setModel(new DefaultComboBoxModel(new String[] {"Apple juice", "Orange juice", "Lemonade", "cola", "water"}));
		}
		return comboBoxBeverages;
	}
	public JPanel getPanelOrderTable() {
		if (panelOrderTable == null) {
			panelOrderTable = new JPanel();
			GridBagLayout gbl_panelOrderTable = new GridBagLayout();
			gbl_panelOrderTable.columnWidths = new int[]{0, 0};
			gbl_panelOrderTable.rowHeights = new int[]{0, 0};
			gbl_panelOrderTable.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gbl_panelOrderTable.rowWeights = new double[]{1.0, Double.MIN_VALUE};
			panelOrderTable.setLayout(gbl_panelOrderTable);
			GridBagConstraints gbc_scrollPaneOrderTable = new GridBagConstraints();
			gbc_scrollPaneOrderTable.fill = GridBagConstraints.BOTH;
			gbc_scrollPaneOrderTable.gridx = 0;
			gbc_scrollPaneOrderTable.gridy = 0;
			panelOrderTable.add(getScrollPaneOrderTable(), gbc_scrollPaneOrderTable);
		}
		return panelOrderTable;
	}
	public JScrollPane getScrollPaneOrderTable() {
		if (scrollPaneOrderTable == null) {
			scrollPaneOrderTable = new JScrollPane();
			scrollPaneOrderTable.setViewportView(getTableOrder());
		}
		return scrollPaneOrderTable;
	}
	public JTable getTableOrder() {
		if (tableOrder == null) {
			tableOrder = new JTable();
			DefaultTableModel defaultTableModel = new DefaultTableModel();
			defaultTableModel.addColumn("ID");
			defaultTableModel.addColumn("FOOD NAME");
			defaultTableModel.addColumn("PRICE");
			defaultTableModel.addColumn("COUNT");
			tableOrder.setModel(defaultTableModel);
			tableOrder.setPreferredScrollableViewportSize(new Dimension(800,200));
			tableOrder.getColumnModel().getColumn(0).setMinWidth(50);
			tableOrder.getColumnModel().getColumn(0).setMaxWidth(50);
		}
		return tableOrder;
	}
	public JPanel getPanelOrderFunctions() {
		if (panelOrderFunctions == null) {
			panelOrderFunctions = new JPanel();
			GridBagLayout gbl_panelOrderFunctions = new GridBagLayout();
			gbl_panelOrderFunctions.columnWidths = new int[]{0, 0, 0, 0, 0};
			gbl_panelOrderFunctions.rowHeights = new int[]{0, 0};
			gbl_panelOrderFunctions.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
			gbl_panelOrderFunctions.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panelOrderFunctions.setLayout(gbl_panelOrderFunctions);
			GridBagConstraints gbc_lblRoomid = new GridBagConstraints();
			gbc_lblRoomid.insets = new Insets(0, 0, 0, 5);
			gbc_lblRoomid.anchor = GridBagConstraints.EAST;
			gbc_lblRoomid.gridx = 0;
			gbc_lblRoomid.gridy = 0;
			panelOrderFunctions.add(getLblRoomid(), gbc_lblRoomid);
			GridBagConstraints gbc_textFieldRoomNumber = new GridBagConstraints();
			gbc_textFieldRoomNumber.insets = new Insets(0, 0, 0, 5);
			gbc_textFieldRoomNumber.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldRoomNumber.gridx = 1;
			gbc_textFieldRoomNumber.gridy = 0;
			panelOrderFunctions.add(getTextFieldRoomNumber(), gbc_textFieldRoomNumber);
			GridBagConstraints gbc_btnCreateOrder = new GridBagConstraints();
			gbc_btnCreateOrder.gridx = 3;
			gbc_btnCreateOrder.gridy = 0;
			panelOrderFunctions.add(getBtnCreateOrder(), gbc_btnCreateOrder);
		}
		return panelOrderFunctions;
	}
	public JTextField getTextFieldRoomNumber() {
		if (textFieldRoomNumber == null) {
			textFieldRoomNumber = new JTextField();
			textFieldRoomNumber.setColumns(10);
		}
		return textFieldRoomNumber;
	}
	public JLabel getLblRoomid() {
		if (lblRoomid == null) {
			lblRoomid = new JLabel("Room ID:");
		}
		return lblRoomid;
	}
	public JButton getBtnCreateOrder() {
		if (btnCreateOrder == null) {
			btnCreateOrder = new JButton("Create Order");
		}
		return btnCreateOrder;
	}
}

