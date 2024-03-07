package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'I';

		switch (harf) {
		case 'A', 'O', 'U', 'I': {
			System.out.println("Kalın sesli harf");
			break;
		}
		default:
			System.out.println("ince sesli harf");
		}
	}
}
