import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		int dataBuffer[] = new int[5];
		boolean repeat = true;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("----------------------------------");
		System.out.println("Selamat Datang di Program Simulasi");
		System.out.println("----------------------------------");
		System.out.println("");
		
		
		while (repeat){			
			System.out.println(" ");
			System.out.println("Menu :");
			System.out.println("1. Random Data.");
			System.out.println("2. Simulasi Buble Sort - Ascending.");
			System.out.println("3. Simulasi Selection Sort - Ascending.");
			System.out.println("4. Simulasi Buble Sort - Descending.");
			System.out.println("5. Simulasi Selection Sort - Descending.");
			System.out.println("6. Keluar.");
			System.out.println(" ");				
			System.out.print("Masukkan Menu Pilihan Anda ");							
			int menu = scanner.nextInt();
			System.out.println(" ");
			if (menu==1){
				System.out.print(" Batas Bawah : ");							
				int minValue = scanner.nextInt();
				System.out.print(" Batas Atas : ");	
				int maxValue = scanner.nextInt();
				System.out.println(" ");	
				
				for (int i=0;i<5;i++){
					int randomValue =  (int)(Math.random()*(maxValue-minValue+1)+minValue);  
					dataBuffer[i] = randomValue;
					System.out.print("  " + dataBuffer[i]);
				}
				System.out.println(" ");	
			} else
			if (menu==2){
				bubleSortAscending(dataBuffer);
			} else
			if (menu==3){
				selectionSortAscending(dataBuffer);
			} else
			if (menu==4){
				bubleSortDescending(dataBuffer);
			} else
			if (menu==5){
				selectionSortDescending(dataBuffer);
			} else
			if (menu==6){
				repeat = false;
			}
					
		}
		System.exit(1);
			
	}
	
	public static void bubleSortAscending(int dataBuffer[]) {
	
		System.out.println("Buble Sort Ascending : ");
			
		int n = dataBuffer.length;  
		int temp = 0;  
		for(int i=0; i < n; i++){  
			System.out.println(" ");
			System.out.println("Pass " + (i+1));
			
			for(int j=1; j < (n-i); j++){ 
				if(dataBuffer[j-1] > dataBuffer[j]){  
					//swap elements  
					temp = dataBuffer[j-1];  
					dataBuffer[j-1] = dataBuffer[j];  
					dataBuffer[j] = temp; 					
				}  
				for (int k = 0; k < dataBuffer.length; k++)  
				{				
					System.out.print(" " + dataBuffer[k]); 
				}
				System.out.println(" ");
							  
			}  
			System.out.println(" ");
			System.out.println("Result of phase " + (i+1));
			
			for (int l = 0; l < dataBuffer.length; l++)  
			{
				System.out.print(" " + dataBuffer[l]);
			}
			System.out.println(" ");
			
		}  
	}
	
	public static void selectionSortAscending(int dataBuffer[]) {
		
		System.out.println("Selection Sort Ascending : ");
			
		for (int i = 0; i < dataBuffer.length-1; i++)  
		{  
			System.out.println(" ");
			System.out.println("Pass " + (i+1));
			
			int index = i;  
			for (int j=i+1; j < dataBuffer.length; j++){  
				if (dataBuffer[j] < dataBuffer[index]){  
					index = j;//searching for lowest index  
				}  
					
				for (int k = 0; k < dataBuffer.length; k++)  
				{
					//mark the lowest value
					if (k==index){
					System.out.print(" (" + dataBuffer[k] +")");} else {
					System.out.print(" " + dataBuffer[k]);}
				}
				System.out.println(" ");
			}  
			int smallerNumber = dataBuffer[index];   
			dataBuffer[index] = dataBuffer[i];  
			dataBuffer[i] = smallerNumber;
			 	
			System.out.println(" ");
			System.out.println("Result of phase " + (i+1));
			
			for (int k = 0; k < dataBuffer.length; k++)  
			{
				System.out.print(" " + dataBuffer[k]);
			}
			System.out.println(" ");
		}
			
	}
	
	public static void bubleSortDescending(int dataBuffer[]) {
			
		System.out.println("Buble Sort Descending : ");
			
		int n = dataBuffer.length;  
		int temp = 0;  
		for(int i=0; i < n; i++){  
			System.out.println(" ");
			System.out.println("Pass " + (i+1));
			for(int j=1; j < (n-i); j++){  
				if(dataBuffer[j-1] < dataBuffer[j]){  
					//swap elements  
					temp = dataBuffer[j-1];  
					dataBuffer[j-1] = dataBuffer[j];  
					dataBuffer[j] = temp;  
				}  
				
				for (int k = 0; k < dataBuffer.length; k++)  
				{
					System.out.print(" " + dataBuffer[k]);
				}
				System.out.println(" ");					  
			}  
			
			System.out.println(" ");
			System.out.println("Result of phase " + (i+1));
			
			for (int k = 0; k < dataBuffer.length; k++)  
			{
				System.out.print(" " + dataBuffer[k]);
			}
			System.out.println(" ");
		}  
	}
	
	public static void selectionSortDescending(int dataBuffer[]) {
		
		System.out.println("Selection Sort Descending : ");
			
		for (int i = 0; i < dataBuffer.length-1; i++)  
		{  
			System.out.println(" ");
			System.out.println("Pass " + (i+1));
			int index = i;  
			for (int j=i+1; j < dataBuffer.length; j++){  
				if (dataBuffer[j] > dataBuffer[index]){  
					index = j;//searching for highest index  
				}  
								
				for (int k = 0; k < dataBuffer.length; k++)  
				{
					//mark the highest value
					if (k==index){
					System.out.print(" (" + dataBuffer[k] +")");} else {
					System.out.print(" " + dataBuffer[k]);}
				}
				System.out.println(" ");
			}  
			
			int biggerNumber = dataBuffer[index];   
			dataBuffer[index] = dataBuffer[i];  
			dataBuffer[i] = biggerNumber;
			  		
			System.out.println(" ");
			System.out.println("Result of phase " + (i+1));
			
			for (int k = 0; k < dataBuffer.length; k++)  
			{
				System.out.print(" " + dataBuffer[k]);
			}
			System.out.println(" ");
		}
			
	}
	
}

	