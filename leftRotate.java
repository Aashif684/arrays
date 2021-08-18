package Arrays;

public class leftRotate {
	public static void leftRotateby1(int arr[],int n) {
		int temp=arr[0];
		for(int i=1;i<n;i++) {
			arr[i-1]=arr[i];
			
		}
		arr[n-1]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5},n=5;
		System.out.println("before insertion :");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
leftRotateby1(arr,n);
		System.out.println("after insertion :");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
