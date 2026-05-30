import java.util.*;
public class treesett {

	public static void main(String[] args) {
		// sort in ascending order and don't print duplicate of the array
		int arr1[]= {4,5,3,8,2,5};
for(int i=0;i<arr1.length;i++) {
	int ele=arr1[i];
	int freq=0;
	for(int i1=0;i1<arr1.length;i1++) {
		if (ele==arr1[i])
		{
			freq++;
		}
		
	}
	System.out.println("The frequency of  "+arr1[i]+" is "+freq+" Times ");
}

}
}
