import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
//TODO 5ªIteração, não intendo a instrução. O que é ser válido no contexto?
public class Lottery{
	public static void main(String[] args) {
		System.out.printf("How many keys: ");
		Scanner N = new Scanner(System.in);
		int a = N.nextInt();
		N.nextLine();
		N.close();	
		int [][] matrix = new int[a][6];
		//4ªIteração, gera N keys diferentes
		for(int i = 0; i < a; i++) {
			matrix[i] = generator();
			for(int j = 0; j < i; j++) {
				if (matrix[j] == matrix[i]) {
					i--;
				}
			}
		}
	}
	
	public static int[] generator() {
		Random rand = new Random();
		int[] key = new int[6];
		
		for(int i = 0; i < key.length; i++) {
			//1ªIteração, geração de números aleatórios
			key[i] = rand.nextInt(49) + 1;	
			//2ªIteração, evita repetidos
			for(int j = 0; j < i; j++) {
				if (key[j] == key[i]) {
					i--;
				}
			}
		}
		//3ªIteração, ordena a array
		Arrays.sort(key);
		System.out.printf("%nLottery Key: ");
		System.out.printf(Arrays.toString(key));
		return key;
	} 
}
