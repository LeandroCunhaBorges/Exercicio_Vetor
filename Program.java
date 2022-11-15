package Aplication;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		int[] vect = new int[N];
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS:");
		for(int i=0; i<vect.length;i++) {
			if (vect[i]<0) {
				System.out.println(vect[i]);
			}
		}	
		sc.close();
	}

}
