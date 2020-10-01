/*
 * Hybrid.java
 * 09 September 2020
 * Jonathan Mainhart - CMIS 242
 * Extends Automobile Class. Creates Hybrid Automobile objects that 
 * will contain make, model, purchase price specified in whole 
 * dollars, and mpg. Contains methods to initialize, override base class sales 
 * tax, and override base class toString() method.
 */
package mainhart;

/**
 *
 * @author jonmainhart
 */
public class Hybrid extends Automobile {

    private int mpg;

    public Hybrid(String makeAndModel, int price, int mpg) {
        super(makeAndModel, price);
        this.mpg = mpg;
    }

    @Override
    public double salesTax() {
        
        // calculate discount
        double discount;
        if (this.mpg > 40) { // mpg over 40 is 2 dollars off for each mpg over
            discount = ((this.mpg - 40) * 2) + 100; // plus standard 100
        } else {
            discount = 100.00;
        }

        // subtract discount from base sales tax
        double adjustedSalesTax = super.salesTax() - discount;
        // DO NOT ALLOW NEGATIVE TAXES!
        if (adjustedSalesTax >= 0) {
            return adjustedSalesTax;
        } else {
            return 0.00;
        }
        
    } // end salesTax
    
     @Override
    public String toString() {
        
        // adds to the base class string
        String returnString = super.toString() + "Miles per Gallon: " 
                + this.mpg + "\n";
        return returnString;

    }

} // end Class
