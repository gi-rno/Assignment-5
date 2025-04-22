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

	import java.util.Scanner; 

	import java.io.*; 

	public final class TwoDimRaggedArrayUtility {

		public TwoDimRaggedArrayUtility() {}
		
		public static double getAverage(double[][] data) {
			
			double total = 0.0;
			
		    int count = 0;

		    for (int i = 0; i < data.length; i++) {
		    	
		        for (int j = 0; j < data[i].length; j++) {
		        	
		            total += data[i][j];
		            
		            count++;
		        }
		    }

		    if (count == 0) {
		    	
		        return 0.0;
		        
		    } else {
		    	
		        return total / count;
		    }
		}
			
		public static double getColumnTotal(double[][] data, int col) {
				
			double colTotal = 0.0;

		    for (int i = 0; i < data.length; i++) {
		    	
		        if (col < data[i].length) {
		        	
		            colTotal += data[i][col];
		        }
		    }

		    return colTotal;
		}
		
		public static double getHighestInArray(double[][] data) {
			
			 double highestValue = data[0][0];

			 for (int i = 0; i < data.length; i++) {
				 
			     for (int j = 0; j < data[i].length; j++) {
			    	 
			         if (data[i][j] > highestValue) {
			        	 
			             highestValue = data[i][j];
			             
			            }
			        }
			    }

			    return highestValue;
		}
		
		public static double getHighestInColumn(double[][] data, int col) {
			
			double colHighestValue = 0.0;
			
		    boolean found = false;

		    for (int i = 0; i < data.length; i++) {
		    	
		        if (col < data[i].length) {
		        	
		            if (!found) {
		            	
		                colHighestValue = data[i][col];
		                
		                found = true;
		                
		            } else if (data[i][col] > colHighestValue) {
		            	
		                colHighestValue = data[i][col];
		            }
		        }
		    }

		    return colHighestValue;
		}
		
		public static int getHighestInColumnIndex(double[][] data, int col) {
			
			int highestIndex = -1;
			
		    double colHighestValue = 0.0;
		    
		    boolean found = false;

		    for (int i = 0; i < data.length; i++) {
		    	
		        if (col < data[i].length) {
		        	
		            if (!found) {
		            	
		                colHighestValue = data[i][col];
		                
		                highestIndex = i;
		                
		                found = true;
		                
		            } else if (data[i][col] > colHighestValue) {
		            	
		                colHighestValue = data[i][col];
		                
		                highestIndex = i;
		            }
		        }
		    }

		    return highestIndex;
		}
		
		public static double getHighestInRow(double[][] data, int row) {
			
			double rowHighestValue = data[row][0];

		    for (int j = 1; j < data[row].length; j++) {
		    	
		        if (data[row][j] > rowHighestValue) {
		        	
		            rowHighestValue = data[row][j];
		        }
		    }

		    return rowHighestValue;
		}
		
		public static int getHighestInRowIndex(double[][] data, int row) {
			
			int highestIndex = 0;
			
		    double rowHighestValue = data[row][0];

		    for (int j = 1; j < data[row].length; j++) {
		    	
		        if (data[row][j] > rowHighestValue) {
		        	
		            rowHighestValue = data[row][j];
		            
		            highestIndex = j;
		        }
		    }

		    return highestIndex;
		}
		
		public static double getLowestInArray(double[][] data) {
			
			double lowestValue = data[0][0];

		    for (int i = 0; i < data.length; i++) {
		    	
		        for (int j = 0; j < data[i].length; j++) {
		        	
		            if (data[i][j] < lowestValue) {
		            	
		                lowestValue = data[i][j];
		            }
		        }
		    }

		    return lowestValue;
		}
		
		public static double getLowestInColumn(double[][] data, int col) {
			
		    double colLowestValue = 0.0;
		    
		    boolean found = false;

		    for (int i = 0; i < data.length; i++) {
		    	
		        if (col < data[i].length) {
		        	
		            if (!found) {
		            	
		                colLowestValue = data[i][col];
		                
		                found = true;
		                
		            } else if (data[i][col] < colLowestValue) {
		            	
		                colLowestValue = data[i][col];
		            }
		        }
		    }

		    return colLowestValue;
		}
		
		public static int getLowestInColumnIndex(double[][] data, int col) {
			
			 int colLowestIndex = -1;
			 
			 double colLowestValue = Double.MAX_VALUE;

			    for (int i = 0; i < data.length; i++) {
			    	
			        if (col < data[i].length) {
			        	
			            if (data[i][col] < colLowestValue) {
			            	
			                colLowestValue = data[i][col];
			                
			                colLowestIndex = i;
			            }
			        }
			    }

			    return colLowestIndex;
		}
		
		public static double getLowestInRow(double[][] data, int row) {

		    double rowLowestValue = data[row][0];

		    for (int j = 1; j < data[row].length; j++) {
		    	
		        if (data[row][j] < rowLowestValue) {
		        	
		            rowLowestValue = data[row][j];
		        }
		    }

		    return rowLowestValue;
		}
		
		public static int getLowestInRowIndex(double[][] data, int row) {
			
			if (row < 0 || row >= data.length || data[row].length == 0) {
				
		        return -1;
		    }

		    int rowLowestIndex = 0;
		    
		    double rowLowestValue = data[row][0];

		    for (int j = 1; j < data[row].length; j++) {
		    	
		        if (data[row][j] < rowLowestValue) {
		        	
		            rowLowestValue = data[row][j];
		            
		            rowLowestIndex = j;
		        }
		    }

		    return rowLowestIndex;
		}
		
		public static double getRowTotal(double[][] data, int row) {
			
			double rowTotal = 0.0;

		    if (row >= 0 && row < data.length) {
		    	
		        for (int j = 0; j < data[row].length; j++) {
		        	
		            rowTotal += data[row][j];
		        }
		    }

		    return rowTotal;
		}
		
		public static double getTotal(double[][] data) {
			
			double total = 0.0;

		    for (int i = 0; i < data.length; i++) {
		    	
		        for (int j = 0; j < data[i].length; j++) {
		        	
		            total += data[i][j];
		        }
		    }

		    return total;
		}
		
		public static double[][] readFile(File file) throws FileNotFoundException {
			
	        final int MAX_ROW = 10;
	        
	        final int MAX_COL = 10;

	        String[] temp = new String[MAX_ROW];
	        
	        String[][] stringVals = new String[MAX_ROW][MAX_COL];

	        int row = 0;

	        try (Scanner inpt = new Scanner(file)) {
	        	
	            while (inpt.hasNextLine() && row < MAX_ROW) {
	            	
	                temp[row] = inpt.nextLine();
	                
	                row++;
	            }
	        }


	        for (int i = 0; i < row; i++) {
	        	
	            if (temp[i] != null) {
	            	
	                String[] split = temp[i].strip().split(" ");
	                
	                for (int j = 0; j < split.length && j < MAX_COL; j++) {
	                	
	                    stringVals[i][j] = split[j];
	                }
	            }
	        }

	  
	        double[][] values = new double[row][];

	        for (int i = 0; i < row; i++) {
	         
	            int colCount = 0;
	            
	            for (int j = 0; j < MAX_COL; j++) {
	            	
	                if (stringVals[i][j] != null) {
	                	
	                    colCount++;
	                }
	            }

	            values[i] = new double[colCount];

	            for (int j = 0; j < colCount; j++) {
	            	
	                values[i][j] = Double.parseDouble(stringVals[i][j]);
	            }
	        }

	     
	        if (row == 0) {
	        	
	            return null;
	        }

	        return values;
	    }

		
		public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {
			
			try (PrintWriter writer = new PrintWriter(outputFile)) {
				
	            for (int i = 0; i < data.length; i++) {
	            	
	                for (int j = 0; j < data[i].length; j++) {
	                	
	                    writer.print(data[i][j]);
	                    
	                    if (j < data[i].length - 1) {
	                    	
	                        writer.print(" ");
	                    }
	                }
	                
	                writer.println();
	            }
	        }
		}
	}