package Arrays;
import java.math.*;
public class minandmax {

	public static void main(String[] args) {
		int arr[]= {10,13,24,55,23};
		int minn,maxx;
		maxx=arr[0];
		minn=arr[0];
		for(int i=0;i<arr.length;i++) {
			minn=Math.min(minn, arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			maxx=Math.max(maxx, arr[i]);	}
		System.out.println("minimum element is:"+minn);
		System.out.println("maximum element is:"+maxx);
		

	}

}
