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

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HolidayBonusTestStudent {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	 @Test
	 public void calculateTotalHolidayBonusWithZeroSales() {
		 
	        double[][] sales = {
	        		
	            {0.0, 0.0},
	            
	            {-200.0},
	            
	            {3000.0, 2000.0}
	            
	        };

	        double expectedTotal = 10000.0;
	        
	        double actualTotal = HolidayBonus.calculateTotalHolidayBonus(sales);

	        assertEquals(expectedTotal, actualTotal, 0.0001);
	    }
	 
	 @Test
	 public void calculateHolidayBonusMultipleStores() {
		 
	        double[][] sales= {
	        		
	            {3000.0, 4000.0},
	            
	            {2000.0, 1000.0},
	            
	            {5000.0, 2000.0}
	            
	        };

	        double[] expectedBonuses = {
	        		
	            7000.0,
	            
	            2000.0,
	            
	            7000.0
	        };

	        double[] actualBonuses = HolidayBonus.calculateHolidayBonus(sales);
	        
	        assertArrayEquals(expectedBonuses, actualBonuses, 0.001);
	    }
	 
	 @Test
	 public void calculateTotalHolidayBonus() {
		 
	        double[][] sales = {
	        		
	            {3000.0, 2000.0},
	            
	            {1500.0, 1000.0},
	            
	            {4000.0, 1000.0}
	        };
	        
	        double expectedTotal = 16000.0;
	        
	        double actualTotal = HolidayBonus.calculateTotalHolidayBonus(sales);

	        assertEquals(expectedTotal, actualTotal, 0.001);
	    }

}