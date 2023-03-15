import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n = 7, a[] = {4,5,0,1,9,0,5};
		solve(a, n);
		for(int i = 0; i < n; i++){
		    System.out.print(a[i]+" ");
		}
	}
	public static void solve(int a[], int n){
	   int k = 0;
	   for(int i = 0; i < n; i++){
	       if(a[i] == 0){
	           k++;
	       }
	       else{
	           a[i-k] = a[i];
	       }
	   }
	   for(int i = n-1; i > n-k; i--){
	       a[i] = 0;
	   }
	}
}
