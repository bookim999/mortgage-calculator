//Nikki Kim

package Assignment4;

/**
 * Mortgage class that does all Mortgage calculations, and is the Model of the MVC Framework
 * @author Nikki Kim
 * @version 17.0.5
 */
//Model class called Mortgage that calculates all mortgage calculations
public class Mortgage {

    //creating variables to be used later
    private double blendedPay, totInterest, totIP, ratioIP, yrAvgInt, mtAvgInt, yrAmortization;

    /**
     * Method to calculate the blended monthly payment using user input of principal, interest, monthly amortization, and compounding frequency
     * @param principal principal loan amount
     * @param interest annual interest rate expressed in percentage
     * @param amortization number of monthly payments (amortization in months)
     * @param c compounding frequency
     */
    //method to calculate amount of blended monthly payment. Used formula B = (Pi)/1-(i+1)^-n and formula i = [r/c +1]^c/f
    public void setBlendedPay(double principal, double interest, double amortization, double c) {
        double interestFactor = Math.pow((((interest/100)/c)+1),(c/12.0))-1;
        blendedPay = (principal*interestFactor)/(1- Math.pow((interestFactor+1),-amortization));
    }

    /**
     * method to get the blended monthly payment
     * @return blended monthly payment
     */
    //method to get blended monthly payment
    public double getBlendedPay(){
        return blendedPay;
    }

    /**
     * method to calculate total interest paid over the length of the mortgage
     * @param amortization number of monthly payments(amortization in months)
     * @param principal total amount loaned
     */
    //method to calculate total interest paid over length of mortgage
    public void setTotInterest(double amortization, double principal) {
        totInterest = blendedPay*amortization - principal;
    }

    /**
     * method to get total interest paid over the length of the mortgage
     * @return total interest paid over length of mortgage
     */
    //method to get total interest
    public double getTotInterest() {
        return totInterest;
    }

    /**
     * method to calculate the total interest and principal
     * @param amortization the number of monthly payments (amortization in months)
     */
    //method to calculate total interest and principal
    public void setTotIP(double amortization) {
        totIP = blendedPay * amortization;
    }


    /**
     * method to get total interest and principal
     * @return total interest and principal
     */
    //method to get total interest and principal
    public double getTotIP(){
        return totIP;
    }

    /**
     * method to calculate the ratio of interest/principal
     * @param principal total amount loaned
     */
    //method to  calculate the interest/principal ratio
    public void setRatio(double principal) {

        ratioIP = totInterest/principal;
    }

    /**
     * method to get the interest/principal ratio
     * @return the interest/principal ratio
     */
    //method to get interest/principal ratio

    public double getRatio(){
        return ratioIP;
    }

    /**
     * method to calculate the average interest paid per year
     * @param amortization the number of monthly payments (amortization in months)
     */
    //method to calculate the average interest paid per year
    public void setYrAvgInt(double amortization){
        yrAvgInt = totInterest/(amortization/12);
    }

    /**
     * method to get the average interest paid per year
     * @return the average interest paid per year
     */
    //method to get average interest paid per year
    public double getYrAvgInt() {
        return yrAvgInt;
    }

    /**
     * method to calculate the average interest paid per month
     * @param amortization the number of monthly payments (amortization in months)
     */
    //method to calculate the average interest paid per month
    public void setMtAvgInt(double amortization){
        mtAvgInt = totInterest/amortization;
    }

    /**
     * method to get the average interest paid per month
     * @return average interest paid per month
     */
    //method to get the average interest paid per month
    public double getMtAvgInt(){
        return mtAvgInt;
    }

    /**
     * method to calculate the amortization expressed in years
     * @param amortization the number of monthly payments (amortization in months)
     */
    //method to calculate the amortization expressed in years
    public void setYrAmortization(double amortization){
        yrAmortization = amortization/12;
    }

    /**
     * method to get the amortization expressed in years
     * @return amortization expressed in years
     */
    //method to get the amortization expressed in years
    public double getYrAmortization(){
        return yrAmortization;
    }

}
