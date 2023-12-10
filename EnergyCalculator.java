import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.SystemColor;
import javax.swing.DropMode;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;


public class EnergyCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnergyCalculator frame = new EnergyCalculator();
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
	public EnergyCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Energy Calculator By Tusar Chandra");
		setFont(new Font("Times New Roman", Font.BOLD, 14));
		setForeground(Color.BLACK);
		setBackground(Color.BLACK);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\admin\\Downloads\\ios-calculator-2-512.png"));
		setBounds(550, 120, 374, 545);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cb = new JComboBox();
		cb.setForeground(Color.WHITE);
		cb.setBackground(Color.BLACK);
		cb.setMaximumRowCount(16);
		cb.setFont(new Font("Tahoma", Font.BOLD, 18));
		cb.setModel(new DefaultComboBoxModel(new String[] {"Electron volts", "Joules", "Kilojoules", "Thermal calories", "Food calories", "Foot-pounds", "British thermal units", "Kilowatt-hours"}));
		cb.setBounds(4, 64, 207, 32);
		contentPane.add(cb);
		
		JComboBox cb1 = new JComboBox();
		cb1.setMaximumRowCount(16);
		cb1.setBackground(Color.BLACK);
		cb1.setForeground(Color.WHITE);
		cb1.setFont(new Font("Tahoma", Font.BOLD, 18));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Electron volts", "Joules", "Kilojoules", "Thermal calories", "Food calories", "Foot-pounds", "British thermal units", "Kilowatt-hours"}));
		cb1.setBounds(4, 168, 207, 32);
		contentPane.add(cb1);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Backspace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					Backspace=str.toString();
					textField.setText(Backspace);
				}
				
			}
		});
		btnBackspace.setBackground(Color.BLACK);
		btnBackspace.setForeground(Color.WHITE);
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 22));
		btnBackspace.setBounds(235, 216, 114, 60);
		contentPane.add(btnBackspace);
		
		JButton button = new JButton("9");
		button.setBackground(Color.BLACK);
		button.setForeground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button.getText();
				textField.setText(number);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(235, 278, 114, 50);
		contentPane.add(button);
		
		JButton button_1 = new JButton("6");
		button_1.setBackground(Color.BLACK);
		button_1.setForeground(Color.WHITE);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_1.getText();
				textField.setText(number);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBounds(235, 330, 114, 50);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setBackground(Color.BLACK);
		button_2.setForeground(Color.WHITE);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_2.getText();
				textField.setText(number);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2.setBounds(235, 382, 114, 50);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton(".");
		button_3.setBackground(Color.BLACK);
		button_3.setForeground(Color.WHITE);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_3.getText();
				textField.setText(number);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 28));
		button_3.setBounds(4, 434, 114, 50);
		contentPane.add(button_3);
		
		JButton btnClear = new JButton("CE");
		btnClear.setBackground(Color.BLACK);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
			}
		});
		btnClear.setBounds(120, 216, 114, 60);
		contentPane.add(btnClear);
		
		JButton button_6 = new JButton("7");
		button_6.setBackground(Color.BLACK);
		button_6.setForeground(Color.WHITE);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_6.getText();
				textField.setText(number);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_6.setBounds(4, 278, 114, 50);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setBackground(Color.BLACK);
		button_7.setForeground(Color.WHITE);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_7.getText();
				textField.setText(number);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_7.setBounds(120, 278, 114, 50);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("4");
		button_8.setSelectedIcon(null);
		button_8.setBackground(Color.BLACK);
		button_8.setForeground(Color.WHITE);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_8.getText();
				textField.setText(number);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_8.setBounds(4, 330, 114, 50);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("5");
		button_9.setBackground(Color.BLACK);
		button_9.setForeground(Color.WHITE);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_9.getText();
				textField.setText(number);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_9.setBounds(120, 330, 114, 50);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("1");
		button_10.setForeground(Color.WHITE);
		button_10.setBackground(Color.BLACK);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText()+button_10.getText();
				textField.setText(number);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_10.setBounds(4, 382, 114, 50);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("2");
		button_11.setBackground(Color.BLACK);
		button_11.setForeground(Color.WHITE);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText()+button_11.getText();
				textField.setText(number);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_11.setBounds(120, 382, 114, 50);
		contentPane.add(button_11);
		
		JButton button_13 = new JButton("0");
		button_13.setBackground(Color.BLACK);
		button_13.setForeground(Color.WHITE);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_13.getText();
				textField.setText(number);
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_13.setBounds(120, 434, 114, 50);
		contentPane.add(button_13);
		
		textField = new JTextField();
		textField.setBackground(Color.BLACK);
		textField.setForeground(Color.WHITE);
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(4, 4, 345, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.BLACK);
		textField_1.setForeground(Color.WHITE);
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_1.setBounds(4, 108, 345, 50);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Convert");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double result;
				double input = Double.parseDouble(textField.getText());
				
				if(cb.getSelectedItem().toString()=="Electron volts" && cb1.getSelectedItem().toString()=="Electron volts")
				{
					result= input;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Electron volts" && cb1.getSelectedItem().toString()=="Joules")
				{
					result= input*1.60218e-19;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Electron volts" && cb1.getSelectedItem().toString()=="Kilojoules")
				{
					result= (input* 1.60218e-19)/1000;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Electron volts" && cb1.getSelectedItem().toString()=="Thermal calories")
				{
					result= input*3.82673e-20;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Electron volts" && cb1.getSelectedItem().toString()=="Food calories")
				{
					result= input*3.82673e-23;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Electron volts" && cb1.getSelectedItem().toString()=="Foot-pounds")
				{
					result= input*1.181705e-19;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Electron volts" && cb1.getSelectedItem().toString()=="British thermal units")
				{
					result= input*1.518570e-22;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Electron volts" && cb1.getSelectedItem().toString()=="Kilowatt-hours")
				{
					result= input*(1.60218e-19 / 3.6e6);
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Joules" && cb1.getSelectedItem().toString()=="Electron volts")
				{
					result= input/1.602176634e-19;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Joules" && cb1.getSelectedItem().toString()=="Joules")
				{
					result= input;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Joules" && cb1.getSelectedItem().toString()=="Kilojoules")
				{
					result= input/1000;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Joules" && cb1.getSelectedItem().toString()=="Thermal calories")
				{
					result= input/4.184;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Joules" && cb1.getSelectedItem().toString()=="Food calories")
				{
					result= input/4184;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Joules" && cb1.getSelectedItem().toString()=="Foot-pounds")
				{
					result= input/1.35581795;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Joules" && cb1.getSelectedItem().toString()=="British thermal units")
				{
					result= input/1055.05585262;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Joules" && cb1.getSelectedItem().toString()=="Kilowatt-hours")
				{
					result= input/3.6e6;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilojoules" && cb1.getSelectedItem().toString()=="Electron volts")
				{
					result= input*6.241509e21;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilojoules" && cb1.getSelectedItem().toString()=="Joules")
				{
					result= input*1000;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilojoules" && cb1.getSelectedItem().toString()=="Kilojoules")
				{
					result= input;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilojoules" && cb1.getSelectedItem().toString()=="Thermal calories")
				{
					result= input*239.005736;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilojoules" && cb1.getSelectedItem().toString()=="Food calories")
				{
					result= input*0.239005736;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilojoules" && cb1.getSelectedItem().toString()=="Foot-pounds")
				{
					result= input*737.562149;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilojoules" && cb1.getSelectedItem().toString()=="British thermal units")
				{
					result= input*0.94781712;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilojoules" && cb1.getSelectedItem().toString()=="Kilowatt-hours")
				{
					result= input/3.6e3;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Thermal calories" && cb1.getSelectedItem().toString()=="Electron volts")
				{
					result= input*4.184*6.242e18;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Thermal calories" && cb1.getSelectedItem().toString()=="Joules")
				{
					result= input*4.184;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Thermal calories" && cb1.getSelectedItem().toString()=="Kilojoules")
				{
					result= input*(4.184/1000);
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Thermal calories" && cb1.getSelectedItem().toString()=="Thermal calories")
				{
					result= input;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Thermal calories" && cb1.getSelectedItem().toString()=="Food calories")
				{
					result= input/1000;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Thermal calories" && cb1.getSelectedItem().toString()=="Foot-pounds")
				{
					result= input*3.08596;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Thermal calories" && cb1.getSelectedItem().toString()=="British thermal units")
				{
					result= input*0.003966;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Thermal calories" && cb1.getSelectedItem().toString()=="Kilowatt-hours")
				{
					result= input*0.000001;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Food calories" && cb1.getSelectedItem().toString()=="Electron volts")
				{
					result= input*2.611448e22;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Food calories" && cb1.getSelectedItem().toString()=="Joules")
				{
					result= input*4.184*1000;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Food calories" && cb1.getSelectedItem().toString()=="Kilojoules")
				{
					result= input*(4.184/1000)*1000;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Food calories" && cb1.getSelectedItem().toString()=="Thermal calories")
				{
					result= input*1000;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Food calories" && cb1.getSelectedItem().toString()=="Food calories")
				{
					result= input;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Food calories" && cb1.getSelectedItem().toString()=="Foot-pounds")
				{
					result= input*3.08596*1000;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Food calories" && cb1.getSelectedItem().toString()=="British thermal units")
				{
					result= input*3.965666;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Food calories" && cb1.getSelectedItem().toString()=="Kilowatt-hours")
				{
					result= input*0.001162;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Foot-pounds" && cb1.getSelectedItem().toString()=="Electron volts")
				{
					result= input*8.462350e18;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Foot-pounds" && cb1.getSelectedItem().toString()=="Joules")
				{
					result= input*1.355818;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Foot-pounds" && cb1.getSelectedItem().toString()=="Kilojoules")
				{
					result= input*(1.355818/1000);
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Foot-pounds" && cb1.getSelectedItem().toString()=="Thermal calories")
				{
					result= input*0.324048;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Foot-pounds" && cb1.getSelectedItem().toString()=="Food calories")
				{
					result= input*0.000324048;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Foot-pounds" && cb1.getSelectedItem().toString()=="Foot-pounds")
				{
					result= input;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Foot-pounds" && cb1.getSelectedItem().toString()=="British thermal units")
				{
					result= input*0.001285;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Foot-pounds" && cb1.getSelectedItem().toString()=="Kilowatt-hours")
				{
					result= input*3.77616e-7;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="British thermal units" && cb1.getSelectedItem().toString()=="Electron volts")
				{
					result= input*6.585142e21;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="British thermal units" && cb1.getSelectedItem().toString()=="Joules")
				{
					result= input*1055.056;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="British thermal units" && cb1.getSelectedItem().toString()=="Kilojoules")
				{
					result= input*1.055056;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="British thermal units" && cb1.getSelectedItem().toString()=="Thermal calories")
				{
					result= input*252.1644;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="British thermal units" && cb1.getSelectedItem().toString()=="Food calories")
				{
					result= input*0.252164;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="British thermal units" && cb1.getSelectedItem().toString()=="Foot-pounds")
				{
					result= input*778.169;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="British thermal units" && cb1.getSelectedItem().toString()=="British thermal units")
				{
					result= input;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="British thermal units" && cb1.getSelectedItem().toString()=="Kilowatt-hours")
				{
					result= input*0.000293;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilowatt-hours" && cb1.getSelectedItem().toString()=="Electron volts")
				{
					result= input*2.243943e25;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilowatt-hours" && cb1.getSelectedItem().toString()=="Joules")
				{
					result= input*3.6e6;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilowatt-hours" && cb1.getSelectedItem().toString()=="Kilojoules")
				{
					result= input*(3.6e6/1000);
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilowatt-hours" && cb1.getSelectedItem().toString()=="Thermal calories")
				{
					result= input*860420.7;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilowatt-hours" && cb1.getSelectedItem().toString()=="Food calories")
				{
					result= input*860.4207;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilowatt-hours" && cb1.getSelectedItem().toString()=="Foot-pounds")
				{
					result= input*2.655e6;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilowatt-hours" && cb1.getSelectedItem().toString()=="British thermal units")
				{
					result= input*3412.141;
					textField_1.setText(Double.toString(result));
				}
				else if(cb.getSelectedItem().toString()=="Kilowatt-hours" && cb1.getSelectedItem().toString()=="Kilowatt-hours")
				{
					result= input;
					textField_1.setText(Double.toString(result));
				}
			}
		});
		btnNewButton_1.setBounds(235, 434, 114, 50);
		contentPane.add(btnNewButton_1);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{cb, cb1, btnBackspace, button, button_1, button_2, button_3, btnClear, button_6, button_7, button_8, button_9, button_10, button_11, button_13, textField, textField_1, btnNewButton_1}));
	}
}
