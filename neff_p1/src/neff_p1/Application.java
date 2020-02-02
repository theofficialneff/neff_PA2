package neff_p1;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch = 'a';
		String number = "";
		Scanner num = new Scanner (number);
		int a, b, c, d;
		while(ch != 'x') {
			System.out.println("\n\nWould you like to encrypt or decrypt a number?");
			System.out.println("e - encrypt\nd - decrypt\nx - exit");
			ch = input.next().charAt(0);
			switch(ch) {
			
				case 'e':
					System.out.println("\nInput a four-digit integer to be encrypted:");
					number = input.next();
					char[] numbers_e = number.toCharArray();
					a = Integer.parseInt(String.valueOf(numbers_e[0]));
					b = Integer.parseInt(String.valueOf(numbers_e[1]));
					c = Integer.parseInt(String.valueOf(numbers_e[2]));
					d = Integer.parseInt(String.valueOf(numbers_e[3]));
					Encrypter.encrypt(a, b, c, d);
					break;
					
				case 'd':
					System.out.println("\nInput a four-digit integer to be decrypted:");
					number = input.next();
					char[] numbers_d = number.toCharArray();
					a = Integer.parseInt(String.valueOf(numbers_d[0]));
					b = Integer.parseInt(String.valueOf(numbers_d[1]));
					c = Integer.parseInt(String.valueOf(numbers_d[2]));
					d = Integer.parseInt(String.valueOf(numbers_d[3]));
					Decrypter.decrypt(a, b, c, d);
					break;
					
				case 'x':
					System.out.println("\nGoodbye!");
					
			}
		}
	}

}
