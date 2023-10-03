package transactiontargets;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		int nod;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter Number of days shop was open");
		nod=sc.nextInt();
		
		int trans[]=new int[nod];
		int i;
		for (i = 0; i < trans.length; i++) {
			System.out.println("Please enter income of Day "+ (i+1));
			trans[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(trans));
		
		System.out.println("Please enter number of targets");
		int targets=sc.nextInt();
		
		int sum;
		int flag;
for(int j=1;j<=targets;j++)
		{
			System.out.println("Please enter Value for target "+j);
			int singleTarget=sc.nextInt(); //450
			flag=0;//assumption is target not achieved
			sum=0;
			for(int k=0;k<trans.length;k++)
			{
				sum=sum+trans[k];
				if(sum>=singleTarget)
				{
					flag=1;//target achieved
					System.out.println("Target achieved on day "+ (k+1));
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Target NOT achieved");	
			}
			

		}
		

	}

}