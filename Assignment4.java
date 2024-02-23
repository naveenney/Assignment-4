
public class Assignment4 {

	// Write a function to return index in which the given number occurs for the second time in an array, -1 if not present for the second time.
	public static int findSecOccurence(int n,int arr[])
	{   
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{   			
			if(n==arr[i]) 
				cnt++;
			if(cnt==2)
				return i;
		}
		return -1;
	}
	
	//Write a program to print prime numbers between 1 to 30
	public static void printPrimeNumber()
	{
	    for(int i=1;i<=30;i++)
	    {
	    	if(isPrime(i))
	    		System.out.print(i+" ");
	    }
	     	
	}
	public static boolean isPrime(int num)
	{
		int cnt=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				cnt++;
		}
		return cnt==2;
	}
	//Write a program to find the sum of even numbers only in a given array. Use continue.
	public static void sumOfEven(int[] arr)
	{
		int sum=0;
		for(int i:arr)
		{
			if(i%2!=0)
				continue;
			else
				sum+=i;
		}
		System.out.println(sum);
	}
	
}
