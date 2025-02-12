package cc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CurrencyGUI extends JFrame {
	
	private JComboBox<String> fromCurrencyComboBox;
	private JComboBox<String> toCurrencyComboBox;
	private JTextField amountTextField;
	private JLabel resultLabel;
	
	public CurrencyGUI() {

		JFrame frame = new JFrame("The Currency Converter");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		String[] currencies = {"USD", "CAD", "EUR", "AUD", "CNY"};
		
		
		fromCurrencyComboBox = new JComboBox<>(currencies);
		toCurrencyComboBox = new JComboBox<>(currencies);
		
		amountTextField  = new JTextField(15);
		
		JButton convertButton = new JButton("Convert");
		
		resultLabel = new JLabel("Result: ");
		
		add(new JLabel("From:"));
		add(fromCurrencyComboBox);
		add(new JLabel("To: "));
		add(toCurrencyComboBox);
		add(new JLabel("Amount: "));
		add(amountTextField);
		add(convertButton);
		add(resultLabel);
		
		convertButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("You pressed the convert button");
			}
			
		});
		
		setVisible(true);
	}
	
}
