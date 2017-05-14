package Programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1 {
	static List<Integer> Input = new ArrayList<Integer>();
	static String Input_s;
	static int longest_len;
	static int current_len = 1;

	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Programming Q1 Answer");
		
		System.out.println("Please enter the array of integers, enter one integer and then type ENTER. At the end, type e and ENTER:");
		while(scan.hasNext()){
			Input_s = scan.next();
			//System.out.println(Input_s);
			if (Input_s.equals("e")){
				//if user enter e, it will break the while loop
				break;
			}
			Input.add(Integer.parseInt(Input_s));
		}
		System.out.println("The array of integers is "+ Input + "\n");
		for (int x=1; x < Input.size(); x++){
			//System.out.println(Input.get(x-1));
			//System.out.println(Input.get(x));
			if (Input.get(x)>Input.get(x-1)){
				current_len++;
				if (current_len >= longest_len){
					//if the current length is equal or longer the the longest length, it replace it
					longest_len = current_len;
				}
			}else {
				current_len = 1;
			}
		}
		System.out.println("The length of the longest order is: " + longest_len);
	}

}
