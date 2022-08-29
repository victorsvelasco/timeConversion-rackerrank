package application;

import java.io.IOException;
import java.util.Scanner;

class Result {

	public static int x;
	public static String[] cont;;
	
    public static String timeConversion(String s) {
    	
    	if (s.substring(8).charAt(0) == 'P' && !s.substring(0,2).equals("12")) {
    		cont = s.substring(0, 8).split(":");
    		x = Integer.parseInt(cont[0]) + 12;
    		return String.format("%d:%s:%s", x, cont[1], cont[2]);
    	} 
    	else if (s.substring(0,2).equals("12") && s.substring(8).charAt(0) == 'A') {
    		cont = s.substring(0, 8).split(":");
    		return String.format("00:%s:%s",cont[1], cont[2]);
    	}
    	else if (s.substring(8).charAt(0) == 'A' && s.substring(0,2).equals("12")){
    		cont = s.substring(0, 8).split(":");
    		return String.format("%s:%s:%s", cont[0],cont[1], cont[2]);
    	
    	}else {
    		cont = s.substring(0, 8).split(":");
    		return String.format("%s:%s:%s", cont[0],cont[1], cont[2]);
    
    	}
    }
}

public class Solution {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		System.out.println(Result.timeConversion(s));

		sc.close();
	}

}
