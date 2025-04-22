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

class TwoDimRaggedArrayUtilityTestStudent {

	private double[][] data;
	
	@BeforeEach
	void setUp() throws Exception {
		
		data = new double[][] {
			
            {1.0, 2.0, 3.0},
            
            {4.0, 5.0},
            
            {6.0}
            
        };
	}

	@AfterEach
	void tearDown() throws Exception {
		
		data = null;
		
	}
	
	@Test
    void testGetTotal() {
		
        assertEquals(21.0, TwoDimRaggedArrayUtility.getTotal(data), 0.0001);
        
    }

	@Test
    void testGetAverage() {
		
        assertEquals(21.0 / 6.0, TwoDimRaggedArrayUtility.getAverage(data), 0.0001);
        
    }
	
	@Test
    void testGetRowTotal() {
		
        assertEquals(6.0, TwoDimRaggedArrayUtility.getRowTotal(data, 0), 0.0001);
        
    }
	
	@Test
    void testGetHighestInRow() {
		
        assertEquals(3.0, TwoDimRaggedArrayUtility.getHighestInRow(data, 0), 0.0001);
        
    }

    @Test
    void testGetHighestInRowIndex() {
    	
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInRowIndex(data, 0));
        
    }

    @Test
    void testGetLowestInRow() {
    	
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInRow(data, 0), 0.0001);
        
    }

    @Test
    void testGetLowestInRowIndex() {
    	
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(data, 0));
        
    }

    @Test
    void testGetHighestInColumn() {
    	
        assertEquals(6.0, TwoDimRaggedArrayUtility.getHighestInColumn(data, 0), 0.0001);
        
    }

    @Test
    void testGetLowestInColumn() {
    	
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInColumn(data, 0), 0.0001);
        
    }

    @Test
    void testGetHighestInArray() {
    	
        assertEquals(6.0, TwoDimRaggedArrayUtility.getHighestInArray(data), 0.0001);
        
    }

    @Test
    void testGetLowestInArray() {
    	
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(data), 0.0001);
        
    }

} 

