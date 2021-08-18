package Arrays;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,12,14};
		int start=0,end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		System.out.println("after reversal:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
