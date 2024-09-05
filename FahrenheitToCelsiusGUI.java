package studysesh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JLabel;

public class FahrenheitToCelsiusGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      JFrame frame = new JFrame ("Fehrenhait to Celsius Converter");
      /// this is a java class that creates a window for all of your components to go in
      frame.setSize(600, 400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // this means that the window will terminate on close 
      frame.setLayout(null);
      /// this means you get complete control over the coordinates of the components 
      
      
      
      //we use JLabel to create a label to prompt the user 
      JLabel label = new JLabel(" Enter temptreture in Fehrenheit : ");
      label.setBounds(20,20,300,30); ///because we set the layout to null 
      frame.add(label);
      // this is what we use to create a text field
      JTextField textField = new JTextField();
      textField.setBounds(230, 20, 220, 30);
      frame.add(textField);
      
      /// create a label to display the result 
      JLabel results = new JLabel (" Tempreture in Celsius: "); 
      results.setBounds(20,60,300,30);
      frame.add(results);
      // now we create a button 
      
      JButton button = new JButton("Convert"); 
      button.setBounds(20,100,200,30);
      frame.add(button); 
      
      // now we add an action listener to the button for functionality 
      
      button.addActionListener( new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String input=textField.getText(); //textField is a variable of the type textField which returns a string
			try {
				//this is where the calculations happen 
				//first of all we convert the string to a double 
				double fahrenheit = Double.parseDouble(input);
				// and now we do the conversion inside the celius variable 
				double celsius =(fahrenheit-32)*0.566; 
				///and now we display the results inside a label 
                results.setText(String.format("Temperature in Celsius: %.2f", celsius));
			}catch (NumberFormatException ex) {
				results.setText("invalid input , Please enter a number.");
				
			}
			
		}
    	  
      });
      
      
      JButton resetBtn = new JButton("Reset");
      resetBtn.setBounds(220, 100, 200, 30);
      frame.add(resetBtn);
      
      resetBtn.addActionListener(  new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			   // Clear the text field
            textField.setText("");
            // Reset the result label
            results.setText("Temperature in Celsius:");

		}
    	  
      });
      
      
      
     frame.setVisible(true);
		
	}

}
