import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


/**Project1: Sorting
 * CSCI 323
 * @author Xiang Cui
 *
 */
public class HeapSort {
	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void Insertion_Sort(int[] arr, int n){
		System.out.println("Insertion Sort: ");
		
		int count = 0;
		for (int i=2 ; i<n;i++){
			int key = arr[i];
			int j = i-1;
			while (j >= 0 && arr[j] > key){
				count++;
				arr[j+1] = arr[j];
				j = j-1;
				
			}
			arr[j+1] = key;
		}
		print(arr,count,n);/*
		System.out.println("Here is the Insertion Sort Result." );
		for(int i=0; i<n;i++){ 
			System.out.print(arr[i]+" ");	
		}
		System.out.println("Here is the Cost: " + count);
		System.out.println("Here is the lenghth of the array: " + n);
		count = 0;*/

	}
	public static void print(int[] arr, int cost, int length){
		System.out.println("Here is the Sorted Result." );
		for(int i=0; i<length;i++){ 
			System.out.print(arr[i]+" ");	
		}
		System.out.println("\nHere is the Cost: " + cost);
		System.out.println("Here is the lenghth of the array: " + length);
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
		
		for(int i=1; i<=n1;i++){
			arr_l[i] = arr[(p + i)-1];
		}
		for(int j=1; j<=n2;j++){
			arr_r[j] = arr[q +j];
		}
	}
	
	public static void Quick_Sort(int[] arr, int low, int high){
		System.out.println("Quick Sort: ");
		/*int a = low;
		int b = high-1;
		int temp;
		int mid = arr[(high+low)/2];
		int cost =0;
		while(a<=b){
			
			while (arr[a]<mid) a++;
			while (arr[b]>mid) b--;
			if(a<=b){
				cost++;
				temp = arr[a];
				arr[a] = arr[b];
				arr[b] = temp;
				a++;
				b--;
			}
		}
		if (low < b) Quick_Sort(arr, low, b);
		if (a < high) Quick_Sort(arr, a, high );
		
		print(arr,cost,high);*/
		if(low < high){
			int q = Pattition(arr,low,high);
			Quick_Sort(arr, low,q-1);
		}
		
	}
	
	public static int Pattition(int[] arr,int low,int high){
		int x = arr[high];
		int i = low-1;
		for(int j=low; j<=high-1;j++){
			 
		}
		
		
		return 1 ;
	}
	public static void main(String args[]) throws IOException{

		//creat a new class called Split which does processing and computing
		//for the project.
		
		int[] arr = new int[1000000] ;
		int length = 0;
		String filename = "";
		//System.out.println("Please enter a number between 3 to 14." );
		//Scanner sc = new Scanner(System.in);
		//int in = sc.nextInt();
		//filename = "Num"+Integer.toString((int)(Math.pow(2,in)))+".txt";
		//System.out.println("The file name is: " +filename);
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
			for(int i=0; i<length;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println("");
			Insertion_Sort(arr,length);
			//Merge_Sort(arr,0, length-1);
			//Heap_Sort();
			//Quick_Sort(arr,0,length);
			
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