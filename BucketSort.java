

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BucketSort{
	
	   static long startTime;
	   static int maxValue;
	   
	   //main
	   public static void main(String[] args) {
			  Random r=new Random();
			  Scanner scan=new Scanner(System.in);
			  maxValue=199999;
		      int [] data=new int[10000]; 
		      
		      for(int i=0;i<data.length;i++)
		        {
		        	data[i] = r.nextInt(maxValue);
		        }

		      
		      sort(data,maxValue);
		      System.out.println("Type the index number to get that data");
		      int index=scan.nextInt();
		      
		      System.out.println(getElement(data,index));
		      System.out.println("Sorted: " + Arrays.toString(data));
		      long endTime=System.currentTimeMillis();
		      
		      long total=endTime-startTime;
		      System.out.println();
		      System.out.println("Total time is "+total);
		   }
	   
	 //Sort Function
	   public static void sort(int[] a, int maxVal) {
		  startTime=System.currentTimeMillis();
	      int [] bucket=new int[maxVal+1];
	 
	      for (int i=0; i<bucket.length; i++) {
	         bucket[i]=0;
	      }
	 
	      for (int i=0; i<a.length; i++) {
	         bucket[a[i]]++;
	      }
	 
	      int outPos=0;
	      for (int i=0; i<bucket.length; i++) {
	         for (int j=0; j<bucket[i]; j++) {
	            a[outPos++]=i;
	         }
	      }
	   }
	   
	   //To get specific element from sorted array
	   public static int getElement(int[] arrayOfInts, int index) {
		    return arrayOfInts[index];
		}

	   
	}
