import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = {15,12,788,1,-1,-788,2,0};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		System.out.print("Girilen sayı: ");
		int number = scanner.nextInt();
		
		int min = array[0];
		int max = array[0];
		
		for (int i : array) {
			if(i < number) {
				min = i;
			}
			
			if(i > number) {
				max = i;
				break;
			}
		}
		
		System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
		System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
		
		
	}

}
