import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables 
  JPanel mainPanel; 

  JLabel firstLabel;
  JLabel secondLabel;
  JLabel resultLabel;

  JTextField firstInput;
  JTextField secondInput;
  JTextField resultArea;

  JButton addButton;
  JButton subButton;
  JButton multButton;
  JButton divButton;

  Font biggerText;
  
  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    // initialize the main JPanel
    mainPanel = new JPanel();
    // disable any layout helpers
    mainPanel.setLayout(null);

    //initialize the labels
    firstLabel = new JLabel("First Number");
    secondLabel = new JLabel("Second Number");
    resultLabel = new JLabel("Result");
    // set the location and setSize
    firstLabel.setBounds(100, 150, 150, 30);
    secondLabel.setBounds(100, 210, 150, 30);
    resultLabel.setBounds(100, 270, 150, 30);
    // add the JLabels to the main panel
    mainPanel.add(firstLabel);
    mainPanel.add(secondLabel);
    mainPanel.add(resultLabel);

    // initialize the text areas
    firstInput = new JTextField();
    secondInput = new JTextField();
    resultArea = new JTextField();
    // set the location and size
    firstInput.setBounds(300, 150, 150, 30);
    secondInput.setBounds(300, 210, 150, 30);
    resultArea.setBounds(300, 270, 150, 30);
    // add the text areas to the main panel
    mainPanel.add(firstInput);
    mainPanel.add(secondInput);
    mainPanel.add(resultArea);
    // disable the text areas so the user can not type in them
    resultArea.setEnabled(false);

    // initialize the JButtons
    addButton = new JButton("Add");
    subButton = new JButton("Sub");
    multButton = new JButton("Mult");
    divButton = new JButton("Div");
    // set the location and size
    addButton.setBounds(100, 330, 70, 30);
    subButton.setBounds(175, 330, 70, 30);
    multButton.setBounds(250, 330, 70, 30);
    divButton.setBounds(325, 330, 70, 30);
    // add an action listener to the buttons
    addButton.addActionListener(this);
    subButton.addActionListener(this);
    multButton.addActionListener(this);
    divButton.addActionListener(this);
    // set the action command on the buttons
    addButton.setActionCommand("add");
    subButton.setActionCommand("sub");
    multButton.setActionCommand("mult");
    divButton.setActionCommand("div");
    // add the JButtons to the main panel
    mainPanel.add(addButton);
    mainPanel.add(subButton);
    mainPanel.add(multButton);
    mainPanel.add(divButton);

    // create a bigger font to use
    biggerText = new Font("Times New Roman",Font.PLAIN, 20);
    // set the font on the area I want to use it
    resultArea.setFont(biggerText);

    // add the main panel to the window
    frame.add(mainPanel);

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    // makes the buttons output values
    if(command.equals("add")){
      // get the text from the text boxes
      String firstText = firstInput.getText();
      String secondText = secondInput.getText(); 

      // change the string into an integer
      int firstInteger = Integer.parseInt(firstText);
      int secondInteger = Integer.parseInt(secondText);

      // calculate result
      int result = (firstInteger + secondInteger);

      // print out result in string form using ""
      resultArea.setText("" + result);
    } else if(command.equals("sub")){

      // get the text from the text boxes
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();

      // change the string into an integer
      int firstInteger = Integer.parseInt(firstText);
      int secondInteger = Integer.parseInt(secondText);

      // calculate result
      int result = (firstInteger - secondInteger);

      // print out result in string form using ""
      resultArea.setText("" + result);
    } else if(command.equals("mult")){

      // get the text from the text boxes
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();

      // change the string into an integer
      int firstInteger = Integer.parseInt(firstText);
      int secondInteger = Integer.parseInt(secondText);

      // calculate result
      int result = (firstInteger * secondInteger);

      // print out result in string form using ""
      resultArea.setText("" + result);
    }else if(command.equals("div")){
      // get the text from the text boxes
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();

      // change the string into an integer
      int firstInteger = Integer.parseInt(firstText);
      int secondInteger = Integer.parseInt(secondText);

      // calculate result
      int result = (firstInteger / secondInteger);

      // print out result in string form using ""
      resultArea.setText("" + result);
    }

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
