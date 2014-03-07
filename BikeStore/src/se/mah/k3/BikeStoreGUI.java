package se.mah.k3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class BikeStoreGUI extends JFrame {

	private JPanel contentPane;
	private JTextField colorField;
	private JTextField priceField;
	private JTextField sizeField;
	//here
	BikeStore bikeStore = new BikeStore();
	private JTextArea textArea;
	//Add the bikes
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStoreGUI frame = new BikeStoreGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BikeStoreGUI() {
		//here
		bikeStore.addBike("Red",23,1400);
		bikeStore.addBike("BLUE",3,140000);
		bikeStore.addBike("Black",18,14);
		bikeStore.addBike("Green",25,1);
		bikeStore.addBike("white",26,20);
		bikeStore.addBike("yellow",14,1355);
		bikeStore.addBike("Hollow",60,1643);
		bikeStore.addBike("Cool",23,1463);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 579);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "All bikes in store", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(25, 29, 323, 446);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		textArea = new JTextArea();
		panel.add(textArea);
		//here
		textArea.setText(bikeStore.getAllBikes());
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Add new Bike", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(418, 29, 305, 451);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int size;
				int price;
				try {
					size = Integer.parseInt(sizeField.getText());
					price = Integer.parseInt(priceField.getText());
					bikeStore.addBike(colorField.getText(), size, price);
					textArea.setText(bikeStore.getAllBikes());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
			}
		});
		
		btnAdd.setBounds(52, 148, 135, 23);
		panel_1.add(btnAdd);
		
		JLabel lblNewLabel = new JLabel("Color:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 52, 46, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Prize:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 77, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Size:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(10, 102, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		colorField = new JTextField();
		colorField.setBounds(78, 49, 86, 20);
		panel_1.add(colorField);
		colorField.setColumns(10);
		
		priceField = new JTextField();
		priceField.setBounds(78, 74, 86, 20);
		panel_1.add(priceField);
		priceField.setColumns(10);
		
		sizeField = new JTextField();
		sizeField.setBounds(78, 99, 86, 20);
		panel_1.add(sizeField);
		sizeField.setColumns(10);
	}
}
