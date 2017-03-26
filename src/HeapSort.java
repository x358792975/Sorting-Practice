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
	
	static int count =0;
	
	public static void main(String[] args){	
		//System.out.println("Here is Heap Sort");
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
			//System.out.println("Here is oringinal array.");
			//for(int j=0; j<length;j++){
				//System.out.print(arr[j]+" ");
			//}
			//System.out.println("\nThe length is "+length);
			//System.out.println("");
			HeapSort(arr,length);
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
		public static void HeapSort(int[] arr, int size){
			Build_Max_Heap(arr, size);
			for(int i=size-1; i>=0; i--){
				int temp = arr[0];
				arr[0] = arr[i];
				arr[i] = temp;
				Max_Heapify(arr,1,i);
			}
		}
		public static void Max_Heapify(int[] arr, int index, int size){
			int l = index *2;
			int r = l+1;
			int largest =0;

			if( l <= size && arr[l-1] > arr[index -1]){
				largest = l;
			} else {
				largest = index;}
			if(r <= size && arr[r-1] > arr[largest-1]){
				largest = r;
			}
			if (largest != index){
				int temp = arr[index-1];
				count+=1;
				arr[index-1]= arr[largest-1];
				arr[largest-1]=temp;
				Max_Heapify(arr,largest,size);
			}
			
		}

		public static void Build_Max_Heap(int[] arr, int size) {
			for(int i = size/2; i>0;i--){
				Max_Heapify(arr,i,size);
			}
			
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