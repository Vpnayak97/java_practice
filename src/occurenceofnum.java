import java.util.Scanner;

public class occurenceofnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i;
	
for(i=0;i<10;i++) {
	int count = 0;
	int temp=num;
	int n=0;
while(temp!=0) {
	n=temp%10;
		if(i==n) {
			count=count+1;
		}	
		temp=temp/10;
		}
System.out.println(i+"the count is "+count);	
	
			}
			
		}

	}


