
public class Main {

	public static void main(String[] args) {
		String message = "Bug�n hava �ok g�zel.";
		String newMessage = message.substring(0, 2);
		System.out.println(newMessage);
		int number = plus(5, 13);
		System.out.println("Say� toplam�: " + number);
		int additionNumbers = addition(2,4,5,6,12);
		System.out.println("Say� dizisi toplam�: "+ additionNumbers);
	}

	public static void add() {
		System.out.println("Eklendi.");
	}

	public static void delete() {
		System.out.println("Silindi.");
	}

	public static void update() {
		System.out.println("G�ncellendir.");
	}

	public static int plus(int number1, int number2) {
		int tmp = number1 + number2;
		return tmp;
	}

	public static int addition(int ... numbers) {
		int total = 0;
		for(int number: numbers) {
			total += number;
		}
		return total;
	}

}
