package neff_p1;

public class Decrypter {

	public static void decrypt(int a, int b, int c, int d) {
		if(a >= 7 && a <= 9)
			a = a - 7;
		else if(a >= 0 && a <= 6)
			a = a + 3;
		
		if(b >= 7 && b <= 9)
			b = b - 7;
		else if(b >= 0 && b <= 6)
			b = b + 3;
		
		if(c >= 7 && c <= 9)
			c = c - 7;
		else if(c >= 0 && c <= 6)
			c = c + 3;
		
		if(d >= 7 && d <= 9)
			d = d - 7;
		else if(d >= 0 && d <= 6)
			d = d + 3;
		
		System.out.printf("\nHere is your decrypted number: %d%d%d%d\n", c, d, a, b);
	}

}
