/*
 * Automobile.java
 * 09 September 2020
 * Jonathan Mainhart - CMIS 242
 * Creates Automobile objects that will contain make and model, and
 * purchase prchase price specified in whole dollars. Contains methods to
 * initialize, calculate sales tax, and override the toString() method.
 */
package mainhart;

/**
 *
 * @author jonmainhart
 */
public class Automobile {
    
    private String makeModel;
    private int purchasePrice;
    
    public Automobile(String makeAndModel, int price) {
        
        this.makeModel = makeAndModel;
        this.purchasePrice = price;
        
    } // end constructor
    
    public double salesTax() {
        /**
         * Calculates sales tax at a flat 5% base rate
         */
        double salesTax = (double) this.purchasePrice * 0.05;
        return salesTax;
        
    } // end salesTax
    
    @Override
    public String toString() {
        
        String returnString = "Make and Model: " + this.makeModel
                + "\nSales Price: " + this.purchasePrice + "\nSales Tax: "
                + String.format("%.02f", this.salesTax()) + "\n";
        return returnString;
        
    } // end toString
        
    
} // end Class
