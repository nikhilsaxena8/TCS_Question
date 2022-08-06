import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int b[] = new int[N];
		for(int i = 0; i < N; i++){
		    a[i] = sc.nextInt();
    	}
    	for(int i = N-2; i >= 0; i--){
    	    if(a[i] >= (N - 1) -i)
    	        b[i]++;
    	    else if(a[i] == 1){
    	        b[i] = b[i+1] + 1; 
    	    }
    	    else{
    	        b[i] = 1 + minSubArray(b, i+1, a[i]+i);
    	    }
    	   // System.out.println(i+" "+b[i]);
    	}
    	System.out.println(b[0]);
	}
	public static int minSubArray(int a[], int start, int end){
	    for(int i = start; i <= end; i++){
    	}
	    int min = a[start];
	    for(int i = start+1; i <= end; i++){
	        if(a[i] < min){
	            int temp = min;
	            min = a[i];
	        }
	    }
	    return min;
	}
}
