import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	
	static int count =0;
	
	public static void main(String[] args){	
		
	//System.out.println("Here is Quick Sort");
	//System.out.println("****************************");
	for(int i=3; i<15;i++){
		int[] arr = new int[1000000] ;
		int length = 0;
		String filename = "";	
	filename = "Num"+Integer.toString((int)(Math.pow(2,i)))+".txt";
	//System.out.println("The file name is: " +filename);
	try {
		Scanner scanner = new Scanner(new File(filename));
		while (scanner.hasNextInt()) { 
			arr[length] = scanner.nextInt();
			length++;
			}
		//System.out.println("\nHere is oringinal array.");
		//for(int j=0; j<length;j++){
			//System.out.print(arr[j]+" ");
		//}
		//System.out.println("\nThe length is "+length);
		//System.out.println("");

		QuickSort(arr,0,length-1);
		
		//System.out.println("---------------------------------");
		
		print(arr,count,length);


		
	}catch (FileNotFoundException e){
		e.printStackTrace();
		System.out.print("File can't be found! ");
	}
	catch (IOException e) {
		e.printStackTrace();
		System.out.print("Faild to read the file!");
	}	
	}
}

	public static void QuickSort(int[] a,int p, int r){
		//p=0
		if(p<r) {
			int q = Partition(a, p, r);
			QuickSort(a, p , q-1);
			QuickSort(a, q+1, r);
		}
	}
	
	public static int Partition(int[] a, int p, int r){

		int x = a[r];
		int i = p-1;
		int temp =0;
				
		for( int j=p;j<= r-1; j++ ){
			count+=1;
			if(a[j]<=x)
			{
				i++;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		temp = a[i+1];
		a[i+1]=a[r];
		a[r]=temp;
		
		return (i+1);
	}

    public static void print(int[] arr, int cost, int length){
		//System.out.println("Here is the Sorted Result." );
		if(length < 65){
			for(int i=0; i<length;i++){ 
				System.out.print(arr[i]+" ");	
			}
		} else {
			for(int i =50; i<100;i++){
				System.out.print(arr[i]+" ");
			}
		}
		
		System.out.println("\nHere is the Cost: " + cost);
		//System.out.println("Here is the lenghth of the array: " + length);
	}
 }