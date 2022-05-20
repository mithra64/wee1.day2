package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,7,6,8};

		//to find length of the array 
		int length = arr.length;

		//sorting the array
		Arrays.sort(arr);


		for(int i=1; i<length; i++) {

			if(i != arr[i-1])
			{
				System.out.println("Missing number is " + i);
				break;
			}
		}

	}

}
