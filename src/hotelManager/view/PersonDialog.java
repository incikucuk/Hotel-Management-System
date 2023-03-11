package hotelManager.view;

import javax.swing.JDialog;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class PersonDialog extends JDialog{
	
	private static final long serialVersionUID = 7433602200128906957L;
	private static PersonDialog INSTANCE;
	private JPanel panelPersonInfo;
	private JLabel lblPersonName;
	private JTextField textFieldPersonName;
	private JLabel lblPersonJob;
	private JTextField textFieldPersonJob;
	private JLabel lblPersonState;
	private JCheckBox chckbxPersonState;
	private JPanel panel;
	private JButton btnSavePerson;
	
	private PersonDialog() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		GridBagConstraints gbc_panelPersonInfo = new GridBagConstraints();
		gbc_panelPersonInfo.insets = new Insets(0, 0, 5, 0);
		gbc_panelPersonInfo.fill = GridBagConstraints.BOTH;
		gbc_panelPersonInfo.gridx = 0;
		gbc_panelPersonInfo.gridy = 0;
		getContentPane().add(getPanelPersonInfo(), gbc_panelPersonInfo);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		getContentPane().add(getPanel(), gbc_panel);
		pack();
	}
	
	public static PersonDialog getInstance(){
		if(PersonDialog.INSTANCE == null) {
			PersonDialog.INSTANCE = new PersonDialog();
		}
		return INSTANCE;
	}
	public JPanel getPanelPersonInfo() {
		if (panelPersonInfo == null) {
			panelPersonInfo = new JPanel();
			GridBagLayout gbl_panelPersonInfo = new GridBagLayout();
			gbl_panelPersonInfo.columnWidths = new int[]{0, 250, 0};
			gbl_panelPersonInfo.rowHeights = new int[]{0, 0, 0, 0};
			gbl_panelPersonInfo.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
			gbl_panelPersonInfo.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
			panelPersonInfo.setLayout(gbl_panelPersonInfo);
			GridBagConstraints gbc_lblPersonName = new GridBagConstraints();
			gbc_lblPersonName.insets = new Insets(0, 0, 5, 5);
			gbc_lblPersonName.anchor = GridBagConstraints.EAST;
			gbc_lblPersonName.gridx = 0;
			gbc_lblPersonName.gridy = 0;
			panelPersonInfo.add(getLblPersonName(), gbc_lblPersonName);
			GridBagConstraints gbc_textFieldPersonName = new GridBagConstraints();
			gbc_textFieldPersonName.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldPersonName.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldPersonName.gridx = 1;
			gbc_textFieldPersonName.gridy = 0;
			panelPersonInfo.add(getTextFieldPersonName(), gbc_textFieldPersonName);
			GridBagConstraints gbc_lblPersonJob = new GridBagConstraints();
			gbc_lblPersonJob.anchor = GridBagConstraints.EAST;
			gbc_lblPersonJob.insets = new Insets(0, 0, 5, 5);
			gbc_lblPersonJob.gridx = 0;
			gbc_lblPersonJob.gridy = 1;
			panelPersonInfo.add(getLblPersonJob(), gbc_lblPersonJob);
			GridBagConstraints gbc_textFieldPersonJob = new GridBagConstraints();
			gbc_textFieldPersonJob.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldPersonJob.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldPersonJob.gridx = 1;
			gbc_textFieldPersonJob.gridy = 1;
			panelPersonInfo.add(getTextFieldPersonJob(), gbc_textFieldPersonJob);
			GridBagConstraints gbc_lblPersonState = new GridBagConstraints();
			gbc_lblPersonState.insets = new Insets(0, 0, 0, 5);
			gbc_lblPersonState.gridx = 0;
			gbc_lblPersonState.gridy = 2;
			panelPersonInfo.add(getLblPersonState(), gbc_lblPersonState);
			GridBagConstraints gbc_chckbxPersonState = new GridBagConstraints();
			gbc_chckbxPersonState.anchor = GridBagConstraints.WEST;
			gbc_chckbxPersonState.gridx = 1;
			gbc_chckbxPersonState.gridy = 2;
			panelPersonInfo.add(getChckbxPersonState(), gbc_chckbxPersonState);
		}
		return panelPersonInfo;
	}
	public JLabel getLblPersonName() {
		if (lblPersonName == null) {
			lblPersonName = new JLabel("Person Name:");
		}
		return lblPersonName;
	}
	public JTextField getTextFieldPersonName() {
		if (textFieldPersonName == null) {
			textFieldPersonName = new JTextField();
			textFieldPersonName.setColumns(10);
		}
		return textFieldPersonName;
	}
	public JLabel getLblPersonJob() {
		if (lblPersonJob == null) {
			lblPersonJob = new JLabel("Job:");
		}
		return lblPersonJob;
	}
	public JTextField getTextFieldPersonJob() {
		if (textFieldPersonJob == null) {
			textFieldPersonJob = new JTextField();
			textFieldPersonJob.setColumns(10);
		}
		return textFieldPersonJob;
	}
	public JLabel getLblPersonState() {
		if (lblPersonState == null) {
			lblPersonState = new JLabel("Person State:");
		}
		return lblPersonState;
	}
	public JCheckBox getChckbxPersonState() {
		if (chckbxPersonState == null) {
			chckbxPersonState = new JCheckBox("");
		}
		return chckbxPersonState;
	}
	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0};
			gbl_panel.rowHeights = new int[]{0, 0};
			gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			GridBagConstraints gbc_btnSavePerson = new GridBagConstraints();
			gbc_btnSavePerson.anchor = GridBagConstraints.EAST;
			gbc_btnSavePerson.gridx = 0;
			gbc_btnSavePerson.gridy = 0;
			panel.add(getBtnSavePerson(), gbc_btnSavePerson);
		}
		return panel;
	}
	public JButton getBtnSavePerson() {
		if (btnSavePerson == null) {
			btnSavePerson = new JButton("Save Person");
		}
		return btnSavePerson;
	}
}
