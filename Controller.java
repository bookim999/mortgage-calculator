//Nikki Kim

package Assignment4;

import java.awt.event.*;


/**
 * Controller class for connecting Mortgage and GUI class, and is the Controller of the MVC Framework
 * @author Nikki Kim
 * @version 17.0.5
 */
//Controller class for connecting Mortgage and GUI class
public class Controller {
    //declaring object from Mortgage and GUI class
    private Mortgage mortgage;
    private GUI gui;

    /**
     * Controller constructor that takes the objects from Mortgage and GUI class as parameters and adds the button listener to gui object
     * @param m mortgage object
     * @param g gui object
     */
    //constructor that takes other class objects and adds ButtonListener to the gui object
    public Controller(Mortgage m, GUI g){
        mortgage = m;
        gui = g;
        gui.addButtonListener(new ButtonListener());

    }

    /**
     * inner class ButtonListener that implements ActionListener to listen to button being pressed by user
     */
    //creating inner class to listen to button being pressed by user
    class ButtonListener implements ActionListener {

        /**
         * method that attempts to connect Mortgage and GUI class in response to action event performed by user
         * @param e the event to be processed
         */
        //method that tries to connect Mortgage and GUI class and returns error if it fails
        @Override
        public void actionPerformed(ActionEvent e) {
            //declaring variables to be used later
            double amortization, principal, annInterest, c;
            try{
                //get user input values from GUI class
                amortization = gui.getAmortization();
                principal = gui.getLoanPrincipal();
                annInterest = gui.getAnnInterest();
                c = gui.getCompoundFreq();
                //get the Mortgage class to calculate all required values
                mortgage.setBlendedPay(principal, annInterest, amortization, c);
                mortgage.setTotInterest(amortization, principal);
                mortgage.setTotIP(amortization);
                mortgage.setRatio(principal);
                mortgage.setYrAvgInt(amortization);
                mortgage.setMtAvgInt(amortization);
                mortgage.setYrAmortization(amortization);
                //get the GUI class to set the result of the values to be displayed to user
                gui.setBlendPay(mortgage.getBlendedPay());
                gui.setTotInt(mortgage.getTotInterest());
                gui.setTotPaid(mortgage.getTotIP());
                gui.setRatio(mortgage.getRatio());
                gui.setYrAvgInt(mortgage.getYrAvgInt());
                gui.setMtAvgInt(mortgage.getMtAvgInt());
                gui.setYearAmortization(mortgage.getYrAmortization());
            }
            //exception to catch when user enters a non-number
            catch(NumberFormatException exception){
                gui.showError("Error: You must enter a number.");
            }
        }
    }
    /**
     * main method to create new Mortgage, GUI, Controller objects and set GUI visible
     * @param args command line arguments
     */
    public static void main(String[] args) {
        //initializing the mortgage and gui objects
        Mortgage mortgage = new Mortgage();
        GUI gui = new GUI();
        gui.setVisible(true);
        new Controller(mortgage, gui);
    }
}
