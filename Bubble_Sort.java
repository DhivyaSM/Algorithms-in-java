package Algorithms;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] Values= {21,67,22,1,2,436,8,9,78,9,6,10};
		int temp=0;
		for(int i=0;i<Values.length-1;i++) {
			for(int j=i+1;j<Values.length;j++) {
				if(Values[i]>=Values[j]) {
					temp=Values[i];
					Values[i]=Values[j];
					Values[j]=temp;
				}
			}
		}
			for(int i=0;i<Values.length;i++) {
				System.out.print(Values[i]+" ");	
		}
	}

}
