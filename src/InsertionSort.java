import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("Here is Insertion Sort");
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
			Insertion_Sort(arr,length);
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
	public static void Insertion_Sort(int[] arr, int length){
		int count = 0;
		for (int i=2 ; i<length;i++){
			int key = arr[i];
			int j = i-1;
			while (j >= 0 && arr[j] > key){
				count++;
				arr[j+1] = arr[j];
				j = j-1;
				
			}
			arr[j+1] = key;
		}

			print(arr,count,length);
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
