import java.util.*;
class subArr{
	int find(int arr[],int n){
	int minlength=Integer.MAX_VALUE;
 
  int left = 0;
  int right =n-1;

  while(left<right && arr[left+1]>= arr[left])
  {
    left++;
  }
 
   if(left==n-1)
    return 0;
 
  while(right>left && arr[right-1]<=arr[right])
  {
    right--;
  }
 
  minlength=Math.min(n-left-1,right);
  int j=right;
  for(int i=0;i<left+1;i++)
  {
    if(arr[i]<=arr[j])
    {
      minlength=Math.min(minlength,j-i-1);
    }
    else if(j<n-1)
    {
      j++;
    }
    else
    {
      break;
    }
  }
  return minlength;
	}
}
class ProjectComp1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		subArr a=new subArr();
		System.out.print("enter length of array :");
		int n=sc.nextInt();
		System.out.println("enter elements in array :");
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int m=a.find(arr,n);
		System.out.println("length of sub-array : "+m);
	}
}