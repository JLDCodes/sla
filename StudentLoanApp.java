/**
 * Program Name: StudentLoanApp.java(file_name)
 * Purpose: to create a functional GUI that represents a student loan app
 * Coder: JL
 * Date:April 2nd, 2020
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class StudentLoanApp extends JFrame  {
	
	
	ArrayList<Student> students = new ArrayList<Student>();
	JLabel firstLabel, middleLabel, lastLabel, streetNameLabel, streetNumLabel,
	aptLabel, cityLabel, provLabel, postalLabel, cslLabel, oslLabel, titleLabel, IDLabel;
	JPanel titlePanel, formPanel, buttonPanel, repayPanel, submitPanel;
	JTextField firstText, middleText, lastText, aptText, streetNameText, streetNumText, cityText, postalText,
	cslText, oslText, IDText, repayText ;
	JButton submitBtn, removeBtn, loanRepay;
	int count = 0;
	JLabel firstText2, middleText2, lastText2, aptText2, streetNameText2, streetNumText2, cityText2, postalText2,
	cslText2, oslText2, IDText2, repayText2, provText;
	
	private JComboBox<String> cboOptions;
	
	StudentLoanApp(){
		//JFrame title
		super("Jean-Luc Desjardins 0874133");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 200);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(1,2));
		this.setVisible(true);
		
		submitPanel = new JPanel();
		submitPanel.setLayout(new BorderLayout());
		titlePanel = new JPanel();
		titleLabel = new JLabel("This is Jean-Luc’s Student Loan Calculator");
		titlePanel.add(titleLabel);
		titlePanel.setBackground(Color.WHITE);
		submitPanel.add(titlePanel,BorderLayout.NORTH);
		
		formPanel = new JPanel();
		formPanel.setLayout(new GridLayout(0,2));
		IDLabel =new JLabel("Student ID:");
		firstLabel = new JLabel("First name:");
		middleLabel = new JLabel("Middle name:");
		lastLabel = new JLabel("Surname:");
		aptLabel = new JLabel("Apartment number:");
		streetNameLabel = new JLabel("Street name:");
		streetNumLabel = new JLabel("Street number:");
		cityLabel = new JLabel("City:");
		provLabel = new JLabel("Province:");
		postalLabel = new JLabel("Postal code:");
		cslLabel = new JLabel("CSL loan amount:"); 
		oslLabel = new JLabel("OSL loan amount:");
		
		IDText = new JTextField();
		firstText = new JTextField();
		middleText = new JTextField();
		lastText = new JTextField();
		aptText = new JTextField();
		streetNameText = new JTextField();
		streetNumText = new JTextField();
		cityText= new JTextField();
		postalText = new JTextField();
		cslText = new JTextField();
		oslText = new JTextField();
		//combo box for the provinces
		String[] provinces = {"Ontario", "Quebec", "Nova Scotia", "New Brunswick", "Manitoba",
				"British Coloumbia", "Prince Edward Island", "Saskatchewan", "Alberta", "Newfoundland and Labrador"};
				
		cboOptions = new JComboBox<String>(provinces);
		cboOptions.setSelectedIndex(0);
		cboOptions.setBackground(Color.WHITE);
		
		formPanel.add(IDLabel);
		formPanel.add(IDText);
		formPanel.add(firstLabel);
		formPanel.add(firstText);
		formPanel.add(middleLabel);
		formPanel.add(middleText);
		formPanel.add(lastLabel);
		formPanel.add(lastText);
		formPanel.add(provLabel);
		formPanel.add(cboOptions);
		formPanel.add(cityLabel);
		formPanel.add(cityText);
		formPanel.add(streetNameLabel);
		formPanel.add(streetNameText);
		formPanel.add(streetNumLabel);
		formPanel.add(streetNumText);
		formPanel.add(aptLabel);
		formPanel.add(aptText);
		formPanel.add(cslLabel);
		formPanel.add(cslText);
		formPanel.add(oslLabel);
		formPanel.add(oslText);
		formPanel.setBackground(Color.WHITE);
		
		submitPanel.add(formPanel, BorderLayout.CENTER);
		submitBtn = new JButton("Submit");
		loanRepay = new JButton("Load Repayment Form");
	
		submitBtn.addActionListener(new submitClass());
		
		buttonPanel = new JPanel();
		buttonPanel.add(submitBtn);
		buttonPanel.add(loanRepay);
		loanRepay.addActionListener(new loadRepayClass());
		submitPanel.add(buttonPanel, BorderLayout.SOUTH);
		
		JPanel left = new JPanel();
		left.setLayout(new BorderLayout());
		
		titlePanel = new JPanel();
		titleLabel = new JLabel("Repayment Form");
		titlePanel.add(titleLabel);
		titlePanel.setBackground(Color.WHITE);
		left.add(titlePanel,BorderLayout.NORTH);
		
		repayPanel = new JPanel();
		repayPanel.setBackground(Color.WHITE);
		repayText = new JTextField();
	
		IDLabel =new JLabel("Student ID:");
		firstLabel = new JLabel("First name:");
		middleLabel = new JLabel("Middle name:");
		lastLabel = new JLabel("Surname:");
		aptLabel = new JLabel("Apartment number:");
		streetNameLabel = new JLabel("Street name:");
		streetNumLabel = new JLabel("Street number:");
		cityLabel = new JLabel("City:");
		provLabel = new JLabel("Province:");
		postalLabel = new JLabel("Postal code:");
		cslLabel = new JLabel("CSL loan amount:"); 
		oslLabel = new JLabel("OSL loan amount:");
		buttonPanel.setBackground(Color.WHITE);
		int repayCount = count -1;
		
		if (students.isEmpty()) {
			IDText2 = new JLabel();
			firstText2 = new JLabel();
			middleText2 = new JLabel();
			lastText2 = new JLabel();
			aptText2 = new JLabel();
			streetNameText2 = new JLabel();
			streetNumText2 = new JLabel();
			cityText2 = new JLabel();
			postalText2 = new JLabel();
			cslText2  = new JLabel();
			oslText2 = new JLabel();
			provText = new JLabel();
		}
		else {
			IDText2 = new JLabel(students.get(repayCount).getStudentID());
			firstText2 = new JLabel(students.get(repayCount).getFirstName());
			middleText2 = new JLabel(students.get(repayCount).getMiddleName());
			lastText2 = new JLabel(students.get(repayCount).getSurname());
			aptText2 = new JLabel(students.get(repayCount).getAptNumber());
			streetNameText2 = new JLabel(students.get(repayCount).getStreetName());
			streetNumText2 = new JLabel(students.get(repayCount).getStreetNumber());
			cityText2 = new JLabel(students.get(repayCount).getCity());
			postalText2 = new JLabel(students.get(repayCount).getPostalCode());
			cslText2 = new JLabel(String.valueOf(students.get(repayCount).getCslLoanAmount()));
			oslText2 = new JLabel(String.valueOf(students.get(repayCount).getOslLoanAmount()));
			provText = new JLabel((String)students.get(repayCount).getProvince());
			repayText.setText(students.get(count-1).toString());
		}
		
		
		repayPanel.setLayout(new GridLayout(0,2));
		repayPanel.add(IDLabel);
		repayPanel.add(IDText2);
		repayPanel.add(firstLabel);
		repayPanel.add(firstText2);
		repayPanel.add(middleLabel);
		repayPanel.add(middleText2);
		repayPanel.add(lastLabel);
		repayPanel.add(lastText2);
		repayPanel.add(provLabel);
		repayPanel.add(provText);
		repayPanel.add(cityLabel);
		repayPanel.add(cityText2);
		repayPanel.add(streetNameLabel);
		repayPanel.add(streetNameText2);
		repayPanel.add(streetNumLabel);
		repayPanel.add(streetNumText2);
		repayPanel.add(aptLabel);
		repayPanel.add(aptText2);
		repayPanel.add(cslLabel);
		repayPanel.add(cslText2);
		repayPanel.add(oslLabel);
		repayPanel.add(oslText2);
		repayPanel.setBackground(Color.WHITE);
		left.add(repayPanel, BorderLayout.CENTER);
		formPanel.setBackground(Color.WHITE);
		JPanel buttonPanel; 
		
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(0,1));
		next = new JButton("Forward");
		prev = new JButton("Previous");
		JPanel topSub = new JPanel();
		topSub.setLayout(new GridLayout(0,3));
		cb1 = new JComboBox();
		cb1.setSelectedIndex(-1);
		for(int i=0;i<=100;i++) 
		{
		cb1.addItem(i);
		}
		next.addActionListener(new forward());
		prev.addActionListener(new previous());
		String[] options = {".00", ".25", ".50", ".75"};
		percent = new JComboBox<String>(options);
		
		left.add(buttonPanel, BorderLayout.SOUTH);
		JLabel interest = new JLabel("Annual Interest Rate: ");
		topSub.add(interest);
		topSub.add(cb1);
		topSub.add(percent);
		buttonPanel.add(topSub);
		JPanel bottomSub = new JPanel();
		removeBtn = new JButton("Remove");
		removeBtn.addActionListener(new removeClass());
		bottomSub.add(removeBtn);
		bottomSub.add(prev);
		bottomSub.add(next);
		calc = new JButton("Calculate Loan");
		calc.addActionListener(new calcLoan());
		monthly = new JLabel("Amortization period in months:");
		monthText = new JTextField();
		midSub = new JPanel();
		midSub.setLayout(new GridLayout(0,2));
		midSub.add(monthly);
		midSub.add(monthText);
		buttonPanel.add(midSub);
		bottomSub.add(calc);
		buttonPanel.add(bottomSub);
		this.add(submitPanel);
		this.add(left);
		
		this.pack();
		
	}
	JButton next, prev, calc;
	JComboBox cb1, percent;
	JLabel monthly, output;
	JTextField monthText;
	JPanel midSub;
	
	
		
	
	
	
	
	
	
	
	double csl, osl;
	String cslS, oslS;
	
	//this class is used as an event handler for the submit button
	private class submitClass implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String ID = IDText.getText();
			try {
				checkID(ID);
				String first = firstText.getText();
				String mid = middleText.getText();
				String last = lastText.getText();
				String apt = aptText.getText();
				String sName = streetNameText.getText();
				String sNum = streetNumText.getText();
				String city = cityText.getText();
				String post = postalText.getText();
				String prov = (String)cboOptions.getSelectedItem();
				try {
					csl = Double.parseDouble(cslText.getText());
					osl = Double.parseDouble(oslText.getText());
					try {
						
						csl = Double.parseDouble(cslText.getText());
						osl = Double.parseDouble(oslText.getText());
						checkLoan(csl);
						checkLoan(osl);
					}
					catch(JLD_NegativeValueException ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage()+"\nYou cannot enter negative values. It's okay though,\n"
								+ "converting negative number to positive");
					}
				}
				catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage()+"\nEnter a valid number please");
				}
				
				finally {
					csl = Math.abs(csl);
					osl = Math.abs(osl);
				}
				
				
				students.add(new Student(ID, last, mid, first, apt, sNum, sName, city, prov, post, csl, osl));
				
				
				count++;
				//reset the text fields
				IDText.setText("");
				firstText.setText("");
				middleText.setText("");
				lastText.setText("");
				aptText.setText("");
				streetNameText.setText("");
				streetNumText.setText("");
				cityText.setText("");
				postalText.setText("");
				cslText.setText("");
				oslText.setText("");
				
			
			}
			catch(InvalidIDException ex){
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
			
		}
	
	}
	//this class is the event handler for the remove button 
	private class removeClass implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (count > 0) {
				
				students.remove(count);
				count--;
			}
			
			
		}
		
	}
	

	/**
	 * Method Name: checkLoan
	 * Purpose: method takes a loan and checks to see if it is negative
	 * Accepts: a double which represents the loan amount.
	 * Returns: void
	 * Date: April 2nd 2020
	 */
	public void checkLoan(double loan) throws JLD_NegativeValueException{
		if(loan < 0) {
			throw new JLD_NegativeValueException();
		}
		
	}
	
	// this class is used to throw an exception if the student id is not numeric
	public class InvalidIDException extends Exception{
		InvalidIDException(){
			super("Invalid Student ID Exception");
		}
	}
	
	/**
	 * Method Name: checkID
	 * Purpose: a public class method validates if it is numeric
	 * Accepts: a string which represents the student ID
	 * Returns: nothing
	 * Date: April 2nd, 2020
	 */
	public void checkID(String ID) throws InvalidIDException{
		boolean validLength = false;
		if (ID.length() == 7) {
			validLength = true;
		}
		else {
			throw new InvalidIDException();
		}
		if (validLength) {
			
				if (ID.isBlank()) {
					throw new InvalidIDException();
				}
				if (ID.matches("[0-9]+")) {
				   
				}
				else {
					throw new InvalidIDException();
				}
				}
		
	}
	/**
	 * Method Name: loadText
	 * Purpose: a public class method that loads the student object details into the text fields 
	 * Accepts: nothing
	 * Returns: nothing
	 * Date: April 2nd, 2020
	 */
	public void loadText() {
		IDText2.setText(students.get(count).getStudentID());
		firstText2.setText(students.get(count).getFirstName());
		middleText2.setText(students.get(count).getMiddleName());
		lastText2.setText(students.get(count).getSurname());
		aptText2.setText(students.get(count).getAptNumber());
		streetNameText2.setText(students.get(count).getStreetName());
		streetNumText2.setText(students.get(count).getStreetNumber());
		cityText2.setText(students.get(count).getCity());
		postalText2.setText(students.get(count).getPostalCode());
		cslText2.setText(String.valueOf(students.get(count).getCslLoanAmount()));
		oslText2.setText(String.valueOf(students.get(count).getOslLoanAmount()));
		provText.setText((String)students.get(count).getProvince());
	}
	
	//this class updates the repayment form with the last students submitted 
	private class loadRepayClass implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (count > 0) {
				count--;	
			}
			loadText();
		
			SwingUtilities.updateComponentTreeUI(repayPanel);
		}
		
	}
	//this class is the event handler for the previous button 
	private class previous implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			count--;
			if (count < 0) {
				count = students.size() - 1;
			}
		
			loadText();
		
			SwingUtilities.updateComponentTreeUI(repayPanel);
		}
		
	}
	//this class is the event handler for the forward button
	private class forward implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// cycle through all the options available 
			count++;
			if (count >= students.size()) {
				count = 0;
			}
			
			
			loadText();
			
			SwingUtilities.updateComponentTreeUI(repayPanel);
		}
		
	}
	
	JTextArea outputText;
	//this class loads a new window which is the loan calculated
	private class calcLoanClass extends JFrame{

		calcLoanClass(){
			super("Jean-Luc Desjardins 0874133");
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			this.setSize(400, 350);
			this.setLocationRelativeTo(null);
			this.setLayout(new BorderLayout());
			this.setVisible(true);
			outputText = new JTextArea();
			outputText.setFont(font);
			this.add(outputText, BorderLayout.CENTER);
		
			
			
		}
		
		
	}
	Font font = new Font("SansSerif", Font.ITALIC, 16);
	//this class is the event listner for the calc loan button
	private class calcLoan implements ActionListener, JLD_LoanPayable {

		@Override
		/**
		 * Method Name: calculateLoanPayment
		 * Purpose: implements the abstract method of JLD_LoanPayable()
		 * Accepts: a double represents the loan amount, a double representing the prime int rate and an int representing the months 
		 * Returns: a double that is the loan calculated 
		 * Date: April 2nd, 2020
		 */
		public double calculateLoanPayment(double loan, double primeIntRate, int months) {
			// TODO Auto-generated method stub
			//P  = A * i * (1 + i)^N /( (1 + i)^N – 1)
			double num = (loan)*(primeIntRate)*Math.pow((1+primeIntRate),months)/(Math.pow(1+primeIntRate, months)-1);
			return num;
		}
		
	
		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (count >= students.size()) {
				count = students.size()-1;
			}
			if (count < 0) {
				count = 0;
			}
			
			double oslValue = students.get(count).getOslLoanAmount();
			double cslValue = students.get(count).getCslLoanAmount();
			int wholeNum = (int)cb1.getSelectedItem();
			String fracString = (String)percent.getSelectedItem();
			double fracNum = Double.parseDouble(fracString);
			double intRate = wholeNum + fracNum;
			
			double monthlyOsl = (intRate + 1)*ANNUAL_RATE_TO_MONTHLY_RATE ;
			double monthlyCsl = (intRate + 2.5)*ANNUAL_RATE_TO_MONTHLY_RATE;
			int months = Integer.parseInt(monthText.getText());
			
			
			outputText = new JTextArea();
			outputText.setFont(font);
			
			double monthlyOslPay = (double)Math.round(calculateLoanPayment(oslValue, monthlyOsl, months)* 100) / 100;
			double monthlyCslPay = (double)Math.round(calculateLoanPayment(cslValue, monthlyCsl, months)* 100) / 100;
			double total = (double)Math.round(monthlyOslPay+monthlyCslPay);
			double totalPlusInt = (double)Math.round(months * total)*100/100;
			
			new calcLoanClass();
			
			outputText.setText("\n"+students.get(count).toString()+"Monthly csl payment: $"+String.format("%.2f", monthlyCslPay)+"\nMonthly osl payment: $"+String.format("%.2f", monthlyOslPay)+
					"\nTotal monthly payment: $"+String.format("%.2f", total)+
					"\nOver "+months+" months."+
					"\nTotal amount that will be repaid: $"+
					String.format("%.2f", totalPlusInt)+
					"\nOriginal amount borrowed: $"+String.format("%.2f", (oslValue+cslValue))+
					"\nTotal amount of interest paid: $"+String.format("%.2f", (totalPlusInt-(oslValue+cslValue))));
			
			
			SwingUtilities.updateComponentTreeUI(repayPanel);
		}

		
		
	}
	//build in tester class
	public static void main(String[] args) {
		new StudentLoanApp();
	}

	



	
	
}
