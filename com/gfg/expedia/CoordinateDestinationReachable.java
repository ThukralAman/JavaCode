package com.gfg.expedia;

// http://www.geeksforgeeks.org/check-destination-reachable-source-two-movements-allowed/

/*
 * 
Check if a destination is reachable from source with two movements allowed
Given coordinates of a source point (x1, y1) determine if it is possible to reach the destination point (x2, y2). From any point (x, y) there only two types of valid movements:
(x, x + y) and (x + y, y). Return a boolean true if it is possible else return false.
Note: All coordinates are positive.
Asked in: Expedia, Telstra

Examples:

Input : (x1, y1) = (2, 10)
        (x2, y2) = (26, 12)
Output : True
(2, 10)->(2, 12)->(14, 12)->(26, 12) 
is a valid path.

Input : (x1, y1) = (20, 10)
        (x2, y2) = (6, 12)
Output : False
No such path is possible because x1 > x2
and coordinates are positive
 */

public class CoordinateDestinationReachable {

	boolean isReachable(int source_x, int source_y, int dest_x, int dest_y) {
		System.out.println("source_x, source_y, dest_x, dest_y" + ", " + source_x + ", " + source_y + ", " + dest_x + ", " + dest_y);
		
		if(dest_x < source_x || dest_y < source_y) {
			return false;
		}
		
		if(source_x == dest_x && source_y == dest_y) {
			return true;
		}
		
		else{
			return ( isReachable(source_x + source_y, source_y, dest_x, dest_y) || 
					isReachable(source_x, source_x + source_y, dest_x, dest_y) );
		}
		
		
	}
	
	public static void main(String[] args) {
		CoordinateDestinationReachable obj = new CoordinateDestinationReachable();
		
		int source_x = 2, source_y = 4;
	    int dest_x = 2, dest_y = 8;
	    System.out.println(obj.isReachable(source_x, source_y, dest_x, dest_y));
	    if (obj.isReachable(source_x, source_y, dest_x, dest_y))
	        System.out.println("True");
	    else
	        System.out.println("False");
	    
	}
}
