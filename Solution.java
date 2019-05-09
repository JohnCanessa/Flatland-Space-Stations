import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 * 
 */
public class Solution {

    // **** Complete the flatlandSpaceStations function below. ****
    static int flatlandSpaceStations(int n, int[] c) {

    	// **** variable initialization ****
    	int dist 	= 0,
    		maxDist = 0;
    	
    	// **** sort the cities with space stations ****
    	Arrays.sort(c);
    	
    	// ???? ????
    	System.out.print("c: [ ");
    	for (int i : c)
    		System.out.print(i + " ");
    	System.out.println("]");
    	    	
    	// **** check the first city ****
    	dist = c[0] - 0;
    	
    	// ???? ????
		System.out.println("dist: " + dist);
    	
		// **** update the max distance (if needed) ****
    	if (dist > maxDist)
    		maxDist = dist;

    	// **** traverse the cities ****
    	for (int i = 0; i < c.length - 1; i++) {
    		dist = c[i + 1] - c[i];
    		dist /= 2;
    		
    		// ???? ????
    		System.out.println("dist: " + dist);
    		
    		// **** update the max distance (if needed) ****
    		if (dist > maxDist)
    			maxDist = dist;
    	}
    	
    	// **** check the last city ****
    	dist = (n - 1) - c[c.length - 1];
    	
    	// ???? ????
		System.out.println("dist: " + dist);

		// **** update the max distance (if needed) ****
    	if (dist > maxDist)
    		maxDist = dist;

    	// **** return max distance ****
    	return maxDist;
    }

    
    // **** open scanner ****
    private static final Scanner scanner = new Scanner(System.in);

    
    // **** test scaffold ****
    public static void main(String[] args) throws IOException {
    	
    	// **** open buffer writer ****
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        // **** close buffered writer ****
        bufferedWriter.close();

        // **** close scanner ****
        scanner.close();
    }
}
