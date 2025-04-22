package application;

/*
Class: CMSC203 CRN 32723
 Program: Assignment #5
Instructor: Eivazi F.
 Summary of Description: (Give a brief description for each Program) 
 Due Date: MM/DD/YYYY (<04/21/2025>)
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Student Name: Christopher Joya Lopez
*/

public class HolidayBonus { 

public static final double HIGHEST_SALES_BONUS = 5000.0; 

public static final double LOWEST_SALES_BONUS = 1000.0; 

public static final double OTHER_STORES_BONUS = 2000.0; 

 
public HolidayBonus() {}

public static double[] calculateHolidayBonus(double[][] data) {
	
	 double[] bonuses = new double[data.length];

        for (int i = 0; i < data.length; i++) {
        	
            double totalSales = TwoDimRaggedArrayUtility.getRowTotal(data, i); 

            if (totalSales > 0) {
            	
                if (data.length == 1) {
                	
                    bonuses[i] = HIGHEST_SALES_BONUS;
                    
                } 
                
                else {
                	
                    double highestSales = TwoDimRaggedArrayUtility.getHighestInArray(data);
                    
                    double lowestSales = TwoDimRaggedArrayUtility.getLowestInArray(data);

                    if (totalSales == highestSales) {
                    	
                        bonuses[i] = HIGHEST_SALES_BONUS;
                        
                    } else if (totalSales == lowestSales) {
                    	
                        bonuses[i] = LOWEST_SALES_BONUS;
                        
                    } else {
                    	
                        bonuses[i] = OTHER_STORES_BONUS;
                        
                    }
                }
                
            } 
            
            else {
            	
                bonuses[i] = 0.0;
            }
        }
        
        return bonuses;
}

public static double calculateTotalHolidayBonus(double[][] data) {
	
	double totalBonus = 0.0;
	
    double[] bonuses = calculateHolidayBonus(data); 

    for (double bonus : bonuses) {
    	
        totalBonus += bonus;
        
    }
    
    return totalBonus;
    
}
}
