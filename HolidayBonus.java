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

	int maxCols = 0;
	
	for (int i = 0; i < data.length; i++) {
		
		if (data[i].length > maxCols) {
			
			maxCols = data[i].length;
		}
	}

	for (int col = 0; col < maxCols; col++) {
		
		int highestIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, col);
		
		int lowestIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, col);

		for (int row = 0; row < data.length; row++) {
			
			if (col < data[row].length && data[row][col] > 0) {
				
				if (row == highestIndex) {
					
					bonuses[row] += 5000;
					
				} else if (row == lowestIndex) {
					
					bonuses[row] += 1000;
					
				} else {
					
					bonuses[row] += 2000;
				}
			}
		}
	}

	return bonuses;
}

public static double calculateTotalHolidayBonus(double[][] data) {
	
	double total = 0.0;
	
	double[] bonuses = calculateHolidayBonus(data);

	for (double bonus : bonuses) {
		
		total += bonus;
	}

	return total;
}
}
