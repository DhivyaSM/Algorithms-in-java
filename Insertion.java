package Algorithms;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list= {23,34,3,5,6,19,8};
		int key,j;
		for(int i=1;i<list.length;i++) {
			key=list[i];
			j=i-1;
			while(j>=0 &&list[j]>key) {
				list[j+1]=list[j];
				j--;
			}list[j+1]=key;
		}
		for(int List:list) {
			System.out.print(List+" ");
		}
	}

}
