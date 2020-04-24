package MVC;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField occupationTextField;
	private JTextField taxidTextField;
	private final ButtonGroup genderButtonGroup = new ButtonGroup();
	private JTable table;
	private JPanel formPanel;
	private JLabel nameLabel;
	private JLabel occupationLabel;
	private JLabel ageLabel;
	private JLabel employmentLabel;
	private JLabel nationalityLabel;
	private JLabel taxidLabel;
	private JLabel genderLabel;
	private JTextField nameTextField;
	private JComboBox ageComboBox;
	private JComboBox employmentStatusComboBox;
	private JComboBox nationalityComboBox;
	private JRadioButton maleRadioButton;
	private JRadioButton femaleRadioButton;
	private JButton submitButton;
	private JPanel titlePanel;
	private JLabel lblRegistrationSystem;
	private JPanel tablePanel;
	private JScrollPane scrollPane;
	private JMenuBar menuBar;
	private JLabel dateLabel;

	public MainFrame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {

				String currentDate = new Date().toString();
				dateLabel.setText(currentDate);

			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1007, 500);
		setMinimumSize(new Dimension(600, 500));

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenu mnWindow = new JMenu("Window");
		menuBar.add(mnWindow);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		formPanel = new JPanel();
		formPanel.setBorder(new TitledBorder(null, "Person Form", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		formPanel.setBounds(12, 45, 237, 367);
		contentPane.add(formPanel);
		formPanel.setLayout(null);

		nameLabel = new JLabel("NAME:");
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		nameLabel.setBounds(56, 30, 41, 16);
		formPanel.add(nameLabel);

		occupationLabel = new JLabel("OCCUPATION:");
		occupationLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		occupationLabel.setBounds(12, 59, 85, 16);
		formPanel.add(occupationLabel);

		ageLabel = new JLabel("AGE:");
		ageLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		ageLabel.setBounds(67, 88, 30, 16);
		formPanel.add(ageLabel);

		employmentLabel = new JLabel("EMPLOYMENT:");
		employmentLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		employmentLabel.setBounds(12, 117, 89, 16);
		formPanel.add(employmentLabel);

		nationalityLabel = new JLabel("NATIONALITY:");
		nationalityLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		nationalityLabel.setBounds(12, 146, 97, 16);
		formPanel.add(nationalityLabel);

		taxidLabel = new JLabel("TAXID:");
		taxidLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		taxidLabel.setBounds(52, 175, 45, 16);
		formPanel.add(taxidLabel);

		genderLabel = new JLabel("GENDER:");
		genderLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		genderLabel.setBounds(44, 204, 53, 16);
		formPanel.add(genderLabel);

		nameTextField = new JTextField();
		nameTextField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		nameTextField.setBounds(109, 27, 116, 22);
		formPanel.add(nameTextField);
		nameTextField.setColumns(10);

		occupationTextField = new JTextField();
		occupationTextField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		occupationTextField.setBounds(109, 56, 116, 22);
		formPanel.add(occupationTextField);
		occupationTextField.setColumns(10);

		taxidTextField = new JTextField();
		taxidTextField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		taxidTextField.setColumns(10);
		taxidTextField.setBounds(109, 172, 116, 22);
		formPanel.add(taxidTextField);

		ageComboBox = new JComboBox();
		ageComboBox.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		ageComboBox.setModel(new DefaultComboBoxModel(new String[] { "child", "adult", "senior" }));
		ageComboBox.setBounds(109, 85, 116, 22);
		formPanel.add(ageComboBox);

		employmentStatusComboBox = new JComboBox();
		employmentStatusComboBox.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		employmentStatusComboBox.setModel(new DefaultComboBoxModel(EmploymentStatus.values()));
		employmentStatusComboBox.setBounds(109, 114, 116, 22);
		formPanel.add(employmentStatusComboBox);

		nationalityComboBox = new JComboBox();
		nationalityComboBox.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		nationalityComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (nationalityComboBox.getSelectedItem() == Countries.NJ) {
					taxidLabel.setEnabled(false);
					taxidTextField.setEnabled(false);
				} else {
					taxidLabel.setEnabled(true);
					taxidTextField.setEnabled(true);
				}
			}
		});
		nationalityComboBox.setModel(new DefaultComboBoxModel(Countries.values()));
		nationalityComboBox.setBounds(109, 143, 116, 22);
		formPanel.add(nationalityComboBox);

		maleRadioButton = new JRadioButton("Male");
		genderButtonGroup.add(maleRadioButton);
		maleRadioButton.setBounds(109, 200, 55, 25);
		formPanel.add(maleRadioButton);

		femaleRadioButton = new JRadioButton("Female");
		genderButtonGroup.add(femaleRadioButton);
		femaleRadioButton.setBounds(109, 233, 116, 25);
		formPanel.add(femaleRadioButton);

		submitButton = new JButton("Submit");
		submitButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PersonForm person = createPerson();
				addToTable(person, table);

			}
		});
		submitButton.setBounds(109, 272, 116, 40);
		formPanel.add(submitButton);

		titlePanel = new JPanel();
		titlePanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		titlePanel.setBounds(261, 13, 716, 32);
		contentPane.add(titlePanel);
		titlePanel.setLayout(null);

		lblRegistrationSystem = new JLabel("REGISTRATION SYSTEM");
		lblRegistrationSystem.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRegistrationSystem.setBounds(276, 0, 251, 29);
		titlePanel.add(lblRegistrationSystem);

		tablePanel = new JPanel();
		tablePanel.setBounds(261, 45, 716, 367);
		contentPane.add(tablePanel);
		tablePanel.setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane();
		scrollPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tablePanel.add(scrollPane);

		table = new JTable();
		table.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "ID", "NAME", "OCCUPATION", "AGE", "EMPLOYMENT", "NATIONALITY", "TAX ID", "GENDER" }) {
			Class[] columnTypes = new Class[] { Integer.class, Object.class, Object.class, Object.class, Object.class,
					Object.class, Object.class, Object.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(94);
		table.getColumnModel().getColumn(2).setPreferredWidth(102);
		table.getColumnModel().getColumn(3).setPreferredWidth(68);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		table.getColumnModel().getColumn(5).setPreferredWidth(102);
		table.getColumnModel().getColumn(6).setPreferredWidth(70);
		table.getColumnModel().getColumn(7).setPreferredWidth(85);
		scrollPane.setViewportView(table);

		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(12, 13, 237, 32);
		contentPane.add(panel);
		panel.setLayout(null);

		dateLabel = new JLabel("DATE");
		dateLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		dateLabel.setBounds(12, 0, 213, 29);
		panel.add(dateLabel);
	}

	private PersonForm createPerson() {
		String name = nameTextField.getText();
		String occupation = occupationTextField.getText();
		String age = (String) ageComboBox.getSelectedItem();

		Countries nationality = (Countries) nationalityComboBox.getSelectedItem();
		String country;
		if (nationality == Countries.NJ) {
			country = Countries.NJ.toString();
		} else if (nationality == Countries.US) {
			country = Countries.US.toString();
		} else {
			country = Countries.UK.toString();
		}

		String taxid = taxidTextField.getText();

		EmploymentStatus employmentStatus = (EmploymentStatus) employmentStatusComboBox.getSelectedItem();
		String employment;
		if (employmentStatus == EmploymentStatus.Employed) {
			employment = employmentStatus.Employed.toString();
		} else if (employmentStatus == EmploymentStatus.SelfEmployed) {
			employment = employmentStatus.SelfEmployed.toString();
		} else {
			employment = employmentStatus.UnEmployed.toString();
		}

		ButtonModel sex = genderButtonGroup.getSelection();
		String gender = null;
		if (sex == maleRadioButton.getModel())
			gender = Gender.Male.toString();
		else if (sex == femaleRadioButton.getModel())
			gender = Gender.Female.toString();
		else
			gender = "other";

		PersonForm person = new PersonForm(name, occupation, age, employment, country, taxid, gender);
		return person;
	}

	private void addToTable(PersonForm person, JTable persontable){
		DefaultTableModel model = (DefaultTableModel) persontable.getModel();
		
		Object[] row = new Object[model.getColumnCount()];
		
		row[0] = person.getId();
		row[1] = person.getName();
		row[2] = person.getOccupation();
		row[3] = person.getAge();
		row[4] = person.getEmploymentStatus();
		row[5] =person.getCountry();
		row[6] = person.getTaxid();
		row[7] = person.getGender();
		
		model.addRow(row);
		
	}
	

}
