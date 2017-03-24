import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		System.out.println("Here is Merge Sort");
		System.out.println("****************************");
		for(int i=3; i<15;i++){
			int[] arr = new int[1000000] ;
			int length = 0;
			String filename = "";	
		
		filename = "Num"+Integer.toString((int)(Math.pow(2,i)))+".txt";
		System.out.println("The file name is: " +filename);
		
		try {

			// read the file
			Scanner scanner = new Scanner(new File(filename));
			//whole loop, when it reads to the end of file
			// store the read data into variable info
			while (scanner.hasNextInt()) { 
				//System.out.println(data);
				arr[length] = scanner.nextInt();
				length++;
				}
			System.out.println("Here is oringinal array.");
			for(int j=0; j<length;j++){
				System.out.print(arr[j]+" ");
			}
			System.out.println("");
			Merge_Sort(arr,0, length-1);
			System.out.println("---------------------------------");
			
		}catch (FileNotFoundException e){
			e.printStackTrace();
			System.out.print("File can't be found! ");
		}
		// failure of reading the file.
		catch (IOException e) {
			e.printStackTrace();
			System.out.print("Faild to read the file!");
		}	
		}
	}
	public static void Merge_Sort(int[] arr, int p, int r){
		if (p < r){
			int q = (int) Math.floor((p+r)/2);
			Merge_Sort(arr, p, q);
			Merge_Sort(arr,q+1,r);
			Merge(arr,p,q,r);
		}
		
	}
	public static void Merge(int[] arr, int p, int q, int r){
		int n1 = (q - p)+1;
		int n2 = (r - q);
		
		int[] arr_l = new int[n1];
		int[] arr_r = new int[n2];
		
		while ()
		print(arr,cost,r+1);
	}
	
	public static void print(int[] arr, int cost, int length){
		System.out.println("Here is the Sorted Result." );
		if(length < 65){
			for(int i=0; i<length-1;i++){ 
				System.out.print(arr[i]+" ");	
			}
		} else {
			for(int i =50; i<100;i++){
				System.out.print(arr[i]+" ");
			}
		}
		
		System.out.println("\nHere is the Cost: " + cost);
		System.out.println("Here is the lenghth of the array: " + length);
	}

}

