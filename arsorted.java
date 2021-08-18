package Arrays;

public class arsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,1,92,8,15};
for(int i=1;i<arr.length;i++) {
	if(arr[i]<arr[i-1]) {
		System.out.println("not sorted");
		return;
	}

}
System.out.println("sorted");
	}

}
