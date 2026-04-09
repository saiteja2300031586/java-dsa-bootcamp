package day4strings;

public class SlindingWindow {
static int maxsumsliding(int[] arr,int k) {
	int windowsum=0;
	for(int i=0;i<k;i++) {
		windowsum +=arr[i];
	}
	int maxsum=windowsum;
	for(int i=k;i<arr.length;i++) {
		windowsum +=arr[i]-arr[i-k];
		maxsum=Math.max(maxsum, windowsum);
	}
	return maxsum;
	
}
public static void main(String[] args) {
	int[] arr= {2,1,5,3,2};
	int k=3;
	System.out.println("Maxsum :" +maxsumsliding(arr,k));
	
}
}
