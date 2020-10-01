/*
 * Electric.java
 * 09 September 2020
 * Jonathan Mainhart - CMIS 242
 * Extends Automobile Class. Creates Electric Automobile objects that 
 * will contain make, model, purchase price specified in whole dollars, and
 * weight. Contains methods to initialize, override base class sales tax, 
 * and override base class toString() method.
 */
package mainhart;

/**
 *
 * @author jonmainhart
 */
public class Electric extends Automobile {

    private int weight; // in pounds

    public Electric(String makeAndModel, int price, int weight) {
        
        // Build Automobile with addition of weight
        super(makeAndModel, price);
        this.weight = weight;

    } // end constructor

    @Override
    public double salesTax() {
        
        // calculate discount for autos weighing less than 3000
        double discount;
        if (this.weight < 3000) {
            discount = 200.00;
        } else { // regular discount if over 3000
            discount = 150.00;
        }
        
        // subtracts discount from base sales tax
        double adjustedSalesTax = super.salesTax() - discount;
        if (adjustedSalesTax >= 0) { // no negative taxes
            return adjustedSalesTax;
        } else {
            return 0.00;
        }

    } // end salesTax

    @Override
    public String toString() {
        
        // adds to the base class string
        String returnString = super.toString() + "Weight: " 
                + this.weight + "\n";
        return returnString;

    }

} // end Class
