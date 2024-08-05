package Algorithms;

import java.util.Scanner;

public class Liner_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Liner_Search st = new Liner_Search();

		st.Liner_Search_UsingString();
		st.Liner_Search_UsingInt();
	}

	private void Liner_Search_UsingInt() {
		// TODO Auto-generated method stub
		int[] values= {1,2,38,98,67,91,100,89,1000,899,567,876,456,4,5,6,6};
                 Scanner s=new Scanner(System.in);
		
		System.out.println("enter the search value");
		int Search_value=s.nextInt();
		for(int i=0;i<values.length;i++) {
			if(Search_value==values[i]) {
				System.out.println("yes Searching value is presented at position no "+ i);
			}
	}
	}
	private void Liner_Search_UsingString() {
		// TODO Auto-generated method stub
		String[] list= {"abi","banu","priya","kavitha","dhivya","sugenya","sindhu","ananthi","jothi"};
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the search name");
		String Search_name=s.next();
		for(int i=0;i<list.length;i++) {
			if(Search_name.equals(list[i])) {
				System.out.println("yes Searching name is presented at position no "+ i);
			}
				
			}
		}
				
		}


