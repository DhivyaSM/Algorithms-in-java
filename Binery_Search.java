package Algorithms;

import java.util.Scanner;

public class Binery_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Binery_Search bs=new Binery_Search();
		bs.BinerySearh();
	}

	
	private void BinerySearh() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] list= {1,2,3,4,5,6,7,8,10,35,38,47,56,78,89,90,100};
		int min_value=0,max_value=list.length-1;
		System.out.println("enter the searching number");
		
		int search_value=sc.nextInt();
		
		while(min_value<=max_value) {
			int mid_value=(min_value+max_value)/2;
			if(search_value==list[mid_value]) {
				System.out.println("yes this value is presented in this list in postion of  "+mid_value);
				break;
				
			}
			else if(search_value<list[mid_value]) {
				max_value=mid_value - 1;
			}else {
				min_value=mid_value + 1;
			}
		}if(min_value>max_value) {
			System.out.println("this value is not presented in list");
		}
	}

}
