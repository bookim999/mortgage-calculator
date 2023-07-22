//Nikki Kim

package Assignment4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * GUI class that displays all visual components of the program, extends JFrame, and is the View of the MVC Framework
 * @author Nikki Kim
 * @version 17.0.5
 */
//View class called GUI that displays all visual components of the program
public class GUI extends JFrame {

        //declaring object from JTextField, JLabel, and JButton class
        private JTextField loanPrincipal, yrInterestRate, amortization, blendPay, totInterest, totPaid, ratioIP, yrAvg, mtAvg, yrAmort, compoundFreq;
        private JLabel title, loanPrincipalL, yrInterestRateL, amortizationL, blendPayL, totInterestL, totPaidL, ratioIPL, yrAvgL, mtAvgL, yrAmortL, compoundFreqL;
        private JButton button;
    /**
     * GUI constructor that creates the window and all the components that are visible to user to input and output values
     */
    //GUI constructor for creating the window with all the visual components that user can interact with
    public GUI(){
            //creating JFrame with size and layout
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(500,800);
            setLayout(new BorderLayout());
            //creating the 5 panels for BorderLayout and button panel
            JPanel titlePanel = new JPanel();
            JPanel mainPanel = new JPanel();
            JPanel bottomPanel = new JPanel();
            JPanel leftPanel = new JPanel();
            JPanel rightPanel = new JPanel();
            JPanel buttonPanel = new JPanel();
            //coloring the panels
            titlePanel.setBackground(Color.LIGHT_GRAY);
            mainPanel.setBackground(Color.GRAY);
            bottomPanel.setBackground(Color.LIGHT_GRAY);
            leftPanel.setBackground(Color.LIGHT_GRAY);
            rightPanel.setBackground(Color.LIGHT_GRAY);
            buttonPanel.setBackground(Color.LIGHT_GRAY);
            //setting dimensions of the 5 panels
            titlePanel.setPreferredSize(new Dimension(100,50));
            mainPanel.setPreferredSize(new Dimension(200,100));
            bottomPanel.setPreferredSize(new Dimension(100,50));
            leftPanel.setPreferredSize(new Dimension(50,100));
            rightPanel.setPreferredSize(new Dimension(50,100));
            //adding title label to title panel and coloring it
            title = new JLabel("Mortgage Calculator");
            title.setForeground(Color.white);
            titlePanel.add(title);
            //setting layout of main panel
            mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
            //initializing objects of JLabel class
            loanPrincipalL = new JLabel("Principal (total amount loaned):");
            yrInterestRateL = new JLabel("Annual Interest Rate (%):");
            amortizationL = new JLabel("Number of Monthly Payments:");
            compoundFreqL = new JLabel("Compounding Frequency per Year:");
            blendPayL = new JLabel("Blended Monthly Payment:");
            totInterestL = new JLabel("Total Interest Paid:");
            totPaidL = new JLabel("Total Interest and Principal:");
            ratioIPL = new JLabel("Interest/Principal Ratio:");
            yrAvgL = new JLabel("Average Interest Paid Yearly:");
            mtAvgL = new JLabel("Average Interest Paid Monthly:");
            yrAmortL = new JLabel("Amortization in Years:");
            //changing the word color of the JLabel objects
            loanPrincipalL.setForeground(Color.white);
            yrInterestRateL.setForeground(Color.white);
            amortizationL.setForeground(Color.white);
            compoundFreqL.setForeground(Color.white);
            blendPayL.setForeground(Color.white);
            totInterestL.setForeground(Color.white);
            totPaidL.setForeground(Color.white);
            ratioIPL.setForeground(Color.white);
            yrAvgL.setForeground(Color.white);
            mtAvgL.setForeground(Color.white);
            yrAmortL.setForeground(Color.white);
            //aligning all JLabel objects to center
            loanPrincipalL.setAlignmentX(JLabel.CENTER_ALIGNMENT);
            yrInterestRateL.setAlignmentX(JLabel.CENTER_ALIGNMENT);
            amortizationL.setAlignmentX(JLabel.CENTER_ALIGNMENT);
            compoundFreqL.setAlignmentX(JLabel.CENTER_ALIGNMENT);
            blendPayL.setAlignmentX(JLabel.CENTER_ALIGNMENT);
            totInterestL.setAlignmentX(JLabel.CENTER_ALIGNMENT);
            totPaidL.setAlignmentX(JLabel.CENTER_ALIGNMENT);
            ratioIPL.setAlignmentX(JLabel.CENTER_ALIGNMENT);
            yrAvgL.setAlignmentX(JLabel.CENTER_ALIGNMENT);
            mtAvgL.setAlignmentX(JLabel.CENTER_ALIGNMENT);
            yrAmortL.setAlignmentX(JLabel.CENTER_ALIGNMENT);
            //initializing objects of JTextField class
            loanPrincipal = new JTextField();
            yrInterestRate = new JTextField();
            amortization = new JTextField();
            compoundFreq = new JTextField();
            blendPay = new JTextField();
            totInterest = new JTextField();
            totPaid = new JTextField();
            ratioIP = new JTextField();
            yrAvg = new JTextField();
            mtAvg = new JTextField();
            yrAmort = new JTextField();
            //initializing objects of JButton class
            button = new JButton("Calculate");
            //adding all objects of JLabel and JTextField and JButton to main panel
            mainPanel.add(loanPrincipalL);
            mainPanel.add(loanPrincipal);
            mainPanel.add(yrInterestRateL);
            mainPanel.add(yrInterestRate);
            mainPanel.add(amortizationL);
            mainPanel.add(amortization);
            mainPanel.add(compoundFreqL);
            mainPanel.add(compoundFreq);
            buttonPanel.add(button);
            mainPanel.add(buttonPanel);
            mainPanel.add(blendPayL);
            mainPanel.add(blendPay);
            mainPanel.add(totInterestL);
            mainPanel.add(totInterest);
            mainPanel.add(totPaidL);
            mainPanel.add(totPaid);
            mainPanel.add(ratioIPL);
            mainPanel.add(ratioIP);
            mainPanel.add(yrAvgL);
            mainPanel.add(yrAvg);
            mainPanel.add(mtAvgL);
            mainPanel.add(mtAvg);
            mainPanel.add(yrAmortL);
            mainPanel.add(yrAmort);
            //adding all 5 panels to JFrame
            add(titlePanel, BorderLayout.NORTH);
            add(mainPanel, BorderLayout.CENTER);
            add(bottomPanel, BorderLayout.SOUTH);
            add(leftPanel, BorderLayout.WEST);
            add(rightPanel, BorderLayout.EAST);
        }

    /**
     * method to get the loan principal from text field inputs into double form
     * @return double form of loan principal
     */
    //method to get text field input of loan principal into double form
    public double getLoanPrincipal() {
            return Double.parseDouble(loanPrincipal.getText());
        }

    /**
     * method to get the annual interest rate (%) from text field inputs into double form
     * @return double form of annual interest rate (%)
     */
    //method to get text field input of annual interest rate into double form
    public double getAnnInterest() {
            return Double.parseDouble(yrInterestRate.getText());
        }

    /**
     * method to get the amortization expressed in months from text field inputs into double form
     * @return double form of amortization expressed in months
     */
    //method to get text field input of amortization into double form
    public double getAmortization(){
            return Double.parseDouble((amortization.getText()));}

    /**
     * method to get the compounding frequency from text field inputs into double form
     * @return double form of compounding frequency
     */
    //method to get text field input of compounding frequency into double form
    public double getCompoundFreq() {return Double.parseDouble(compoundFreq.getText());}
    /**
     * method to set calculated blended monthly payment into String form to be displayed in text field
     * @param blendedPay string form of blended monthly payment
     */
    //method to set double form of blended monthly payment into text form to display in text field
    public void setBlendPay(double blendedPay){
            blendPay.setText(String.format("%.2f", blendedPay));}

    /**
     * method to set calculated total interest into String form to be displayed in text field
     * @param totalInterest string form of total interest
     */
    //method to set double form of total interest into text form to display in text field
    public void setTotInt(double totalInterest){
            totInterest.setText(String.format("%.2f", totalInterest));
        }

    /**
     * method to set calculated total paid amount into String form to be displayed in text field
     * @param totalPaid string form of total paid amount
     */
    //method to set double form of total paid amount into text form to display in text field
    public void setTotPaid(double totalPaid){
            totPaid.setText(String.format("%.2f", totalPaid));
        }

    /**
     * method to set calculated ratio of interest/principal into String form to be displayed in text field
     * @param ratio string form of ratio of interest/principal
     */
    //method to set double form of ratio of interest/principal into text form to display in text field
    public void setRatio(double ratio){
            ratioIP.setText(String.format("%.2f", ratio));
        }

    /**
     * method to set calculated average interest paid per year into String form to be displayed in text field
     * @param yrAvgInt  string form of average interest paid per year
     */
    //method to set double form of average interest paid per year into text form to display in text field
    public void setYrAvgInt(double yrAvgInt) {
            yrAvg.setText(String.format("%.2f", yrAvgInt));
        }

    /**
     * method to set calculated average interest paid per month into String form to be displayed in text field
     * @param mtAvgInt string form of average interest paid per month
     */
    //method to set double form of average interest paid per month into text form to display in text field
    public void setMtAvgInt(double mtAvgInt) {mtAvg.setText(String.format("%.2f", mtAvgInt));}

    /**
     * method to set calculated amortization expressed in years into String form to be displayed in text field
     * @param yrAmortization string form of amortization expressed in years
     */
    //method to set double form of amortization expressed in years into text form to display in text field
    public void setYearAmortization(double yrAmortization) {yrAmort.setText(String.format("%.2f", yrAmortization));}

    /**
     * method to add a button listener to the calculate button
      * @param listener listener from ActionListener
     */
    //method to add a button listener to the calculate button
    public void addButtonListener(ActionListener listener) {
        button.addActionListener(listener);
    }

    /**
     * method to show error message when user does something that causes an error
     * @param message the message that the user will see
     */
    //method to show error message when user does something that causes an error (shows pop up)
    public void showError(String message){JOptionPane.showMessageDialog(this, message);}
}
