package neff_p1;


public class Encrypter {

	public static void encrypt(int a, int b, int c, int d) {
		a = (a + 7) % 10;
		b = (b + 7) % 10;
		c = (c + 7) % 10;
		d = (d + 7) % 10;
		
		System.out.printf("\nHere is your encrypted number: %d%d%d%d\n", c, d, a, b);
	}

}
