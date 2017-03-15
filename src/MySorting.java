import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/**Project1: Sorting
 * CSCI 313
 * @author Xiang Cui
 *
 */
public class MySorting {
	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static  void insertionSort(int[] arr, int n){
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
		System.out.println("Here is the Insertion Sort Result." );
		for(int i=0; i<n;i++){
			System.out.print(arr[i]+" ");
		}

	}
	public static void main(String args[]) throws IOException{

		//creat a new class called Split which does processing and computing
		//for the project.
		
		int[] arr = new int[1000] ;
		int n = 0;
		try {
			// read the file
			Scanner scanner = new Scanner(new File("Num8.txt"));
			//whole loop, when it reads to the end of file
			// store the read data into variable info
			while (scanner.hasNextInt()) { 
				//System.out.println(data);
				arr[n] = scanner.nextInt();
				n++;
				}
			System.out.println("Here is oringinal array.");
			for(int i=0; i<n;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println("");
			insertionSort(arr,n);

		}catch (FileNotFoundException e){
			e.printStackTrace();
			System.out.print("File can't be found! ");
		}
		// failure of reading the file.
		catch (IOException e) {
			e.printStackTrace();
			System.out.print("Faild to read the file!");
		}	
		/**
		 * call the prinVertex method which is in class Split to 
		 * display the result(adjacency list)
		 */
	}
}
