import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MergeSort {
	static int count =0;
	public static void main(String[] args){	
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
		System.out.println("\nThe length is "+length);
		mergeSort(arr,0,length-1);

		print(arr,count,length);
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

	public static void mergeSort(int[] arr, int low, int high)
	{
		//for(int a=0; a<r;a++){
			//System.out.print(arr[a]+" ");
			
		//}
		//System.out.println(" ");
		if (low < high){
			int mid = (low+high)/2;
			mergeSort(arr, low, mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);

		} else
			return ;

	}


    public static void merge(int[] arr, int low, int mid, int high )
    {	
    	//merge(a, low, mid, mid+1,high)
    	//int a[], int left_low, int left_high, int right_low, int right_high
		int length = (high-low)+1;
		int[] temp = new int[length];
		int left = low;
		int right = mid + 1;
		
		for (int i=0 ;i < length; i++){
			count+=1;
			if(left >mid)
				temp[i] = arr[right++];
			else if (right >high )
				temp[i] = arr[left++];
			else if (arr[left] <= arr[right])
				temp[i] = arr[left++];
			else
				temp[i]= arr[right++];
				
		}
		for(int i=0 ;i<length; i++){
			arr[low++]=temp[i];
		}
   	
    }
    public static void print(int[] arr, int cost, int length){
		System.out.println("Here is the Sorted Result." );
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
		System.out.println("Here is the lenghth of the array: " + length);
	}
 }

